public class Divide extends BinaryOperations implements Expression{
    public Divide(Expression ex1, Expression ex2) {
        super(ex1, ex2);
    }

    @Override
    public int evaluate(int variable) {
        return ex1.evaluate(variable) / ex2.evaluate(variable);
    }
}
