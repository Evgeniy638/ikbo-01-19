public class Multiply extends BinaryOperations implements Expression {
    public Multiply(Expression ex1, Expression ex2) {
        super(ex1, ex2);
    }

    @Override
    public int evaluate(int variable) {
        return ex1.evaluate(variable) * ex2.evaluate(variable);
    }
}
