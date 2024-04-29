public class MealOrder {

}
class burger extends MealOrder{
    private String type;
    private String topping;
    private double price;

    public burger(String type, double price) {
        this.type = type;
        this.price = price;
    }
}
class drink extends MealOrder{
private String type;
private String size;
private double price;
}
class sideItem extends MealOrder{
private String type;
private double price;
}