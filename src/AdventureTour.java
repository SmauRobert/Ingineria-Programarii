public class AdventureTour extends Tour {
    public AdventureTour(Destination[] newDestinations, TourGuide newGuide) {
        destinations = newDestinations;
        guide = newGuide;

        price = guide.GetFee();
        float length = 0;
        for(int i = 0; i < destinations.length - 1; i++) {
            int x1 = destinations[i].x;
            int y1 = destinations[i].y;
            int x2 = destinations[i + 1].x;
            int y2 = destinations[i + 1].y;
            length += Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            if(destinations[i].IsSpecial()) {
                price += 50;
            }
        }

        if(destinations[destinations.length - 1].IsSpecial()) { price += 50; }

        price += length * 3;
    }
}
