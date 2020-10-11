public final class Drink extends MenuItem implements Alcoholable{
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(double alcoholVol, DrinkTypeEnum type) {
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type == DrinkTypeEnum.BEER ||
                type == DrinkTypeEnum.BRANDY ||
                type == DrinkTypeEnum.WINE ||
                type == DrinkTypeEnum.VODKA ||
                type == DrinkTypeEnum.CHAMPAGNE ||
                type == DrinkTypeEnum.WHISKEY ||
                type == DrinkTypeEnum.TEQUILA ||
                type == DrinkTypeEnum.RUM ||
                type == DrinkTypeEnum.VERMUTH ||
                type == DrinkTypeEnum.LIQUOR ||
                type == DrinkTypeEnum.JAGERMEISTER ||
                type == DrinkTypeEnum.JUICE;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
