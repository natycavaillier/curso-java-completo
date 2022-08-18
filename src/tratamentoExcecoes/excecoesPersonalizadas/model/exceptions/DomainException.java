package tratamentoExcecoes.excecoesPersonalizadas.model.exceptions;

public class DomainException extends Exception {
    /*
     * Pode herdar da RuntimeException ou da Exception
     * RuntimeException => Não obriga que trate a exceção
     * Exception => Obriga que trate a exceção (try/catch)
     */

    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
