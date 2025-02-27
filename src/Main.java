//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency();

        TourGuide Andreea = new TourGuide("Andreea", 20);
        TourGuide David = new TourGuide("David", 30);

        Destination Miami = new Destination("Miami", true, 50, 50);
        Destination Mexico = new Destination("Mexico", false, 100, 0);

        CulturalTour c1 = new CulturalTour(new Destination[] {Miami, Mexico}, Andreea);

        int n = 20;
        Participant[] participants = new Participant[n];
        for(int i = 0; i < n; i++) {
            participants[i] = new Participant(i, "Joe", (int)(Math.random() * 50));
        }
    }
}