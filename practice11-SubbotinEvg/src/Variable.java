public class Variable implements Expression{
    private String var;

    public Variable(String var) {
        this.var = var;
    }

    @Override
    public int evaluate(int variable) {
        return variable;
    }
}
