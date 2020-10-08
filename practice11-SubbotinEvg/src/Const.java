public class Const  implements Expression{
    private int number;

    Const(int number){
        this.number = number;
    }

    @Override
    public int evaluate(int variable) {
        return number;
    }
}
