import java.awt.geom.PathIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency();

        TourGuide Andreea = new TourGuide("Andreea", 20);
        TourGuide David = new TourGuide("David", 30);

        Destination Miami = new Destination("Miami", true, 50, 50);
        Destination Mexico = new Destination("Mexico", false, 100, 0);
        Destination Iasi = new Destination("Mexico", false, 200, 0);
        Destination Sibiu = new Destination("Mexico", true, 100, 50);
        Destination Madrid = new Destination("Mexico", false, 200, 500);

        CulturalTour c1 = new CulturalTour(new Destination[] {Miami, Mexico}, Andreea);
        CulturalTour c2 = new CulturalTour(new Destination[] {Iasi, Mexico}, David);

        AdventureTour c3 = new AdventureTour(new Destination[] {Iasi, Mexico}, David);
        AdventureTour c4 = new AdventureTour(new Destination[] {Madrid, Sibiu}, Andreea);
        Tour[] tours = new Tour[ ] { c1, c2, c3, c4 };
        for(int i=0 ; i<tours.length ;i++)
        {
            agency.AddTour(tours[i]);
        }
        int n = 20;
        Participant[] participants = new Participant[n];
        for(int i = 0; i < n; i++) {
            participants[i] = new Participant(i, "Joe", (int)(Math.random() * 50));
            agency.Distribute(participants[i]);
        }
       agency.Report();
    }
}