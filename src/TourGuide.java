public class TourGuide extends Person {
    private int fee;
    TourGuide(String name, int age) {
        this.name = name;
        this.age = age;
        fee = age * 6;
    }
    public int GetFee() { return fee; }
}
