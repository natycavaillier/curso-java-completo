package interfaces.exercicioFixacao.services;

import java.time.LocalDate;

import interfaces.exercicioFixacao.entities.Contract;
import interfaces.exercicioFixacao.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }


    public void processContract(Contract contract, Integer months) {

        double baseInstallment = contract.getTotalValue() / months;
        
        for (int i = 0; i < months; i++) {

            int month = i + 1;

            double amountWithQuotation = baseInstallment + onlinePaymentService.interest(baseInstallment, month);
            amountWithQuotation = amountWithQuotation + onlinePaymentService.paymentFee(amountWithQuotation);
            
            LocalDate dueDateInstallment = contract.getDate().plusMonths(month);

            contract.addInstallment(new Installment(dueDateInstallment, amountWithQuotation));
        }
    }

}
