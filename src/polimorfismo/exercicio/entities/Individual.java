package polimorfismo.exercicio.entities;

public class Individual extends TaxPayer {
    
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double tax;

        if(annualIncome < 20000.00){
            tax = annualIncome * 0.15;
        }else{
            tax = annualIncome * 0.25;
        }

        if(healthExpenditures > 0){
            tax -= healthExpenditures * 0.5;
        }

        return tax;
    }

    
    
}
