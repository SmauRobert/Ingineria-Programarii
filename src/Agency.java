public class Agency {
    Tour[] tours;
    TourGuide[] guides;

    public void AddTour(Tour tour) {
        tours = new Tour[tours.length + 1];
        for (int i = 0; i < tours.length; i++) {
            tours[i] = tour;
        }
        tours[tours.length - 1] = tour;
    }


}
