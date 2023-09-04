package Concepts.Generics;

public class Bounded<T extends Number> {

    private T[] boxData;

    public Bounded(T[] boxData) {
        this.boxData = boxData;
    }

    public void showBoxData(T[] boxData) {
        for (T data : boxData) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public void inspect() {
        System.out.println("T: " + boxData.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Double[] price = {800.00, 100.00, 60.00, 80.00, 60.00};
        Integer[] quantity = {5, 2, 6, 1, 8};

        Bounded<Double> priceObject = new Bounded<>(price);
        priceObject.showBoxData(price);
        priceObject.inspect();

        Bounded<Integer> quantityObject = new Bounded<>(quantity);
        quantityObject.showBoxData(quantity);
        quantityObject.inspect();
    }
}
