public class Computer {
    String model;
    int pricedollar;
    String numberofProcessors;
    String screenSize;
    boolean isTurnon;

    public Computer(String model, int price, String numberofProcessors, String screenSize, boolean isTurnon) {
        this.model = model;
        this.pricedollar = price;
        this.numberofProcessors = numberofProcessors;
        this.screenSize = screenSize;
        this.isTurnon = isTurnon;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", price dollar=" + pricedollar +
                ", numberof Processors='" + numberofProcessors + '\'' +
                ", screen Size='" + screenSize + '\'' +
                ", is Turnon=" + isTurnon +
                '}';
    }
}
