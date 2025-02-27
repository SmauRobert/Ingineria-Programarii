public class Agency {
    Tour[] tours;
    TourGuide[] guides;
    public void AddTour(Tour tour) {
        if(tours == null)
        {
            tours = new Tour[1];
            tours[0] = tour;
            return ;
        }
        Tour [] tours2 = new Tour[tours.length + 1];
        for (int i = 0; i < tours.length; i++) {
            tours2[i] = tours[i];
        }
        tours2[tours.length - 1] = tour;
        tours = tours2;
    }
    public void Distribute(Participant p) {
        int n = (int) Math.random() * tours.length;
        tours[n].addParticipant(p);
    }
    public void Report() {
       for(int i = 0; i < tours.length; i++) {
           System.out.println(tours[i].GetCost());
           tours[i].PrintDestinations();
       }
    }

}
