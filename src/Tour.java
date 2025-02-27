public class Tour {
    float price;
    Destination[] destinations;
    TourGuide guide;
    Participant[] participants;
   public void addParticipant (Participant p)
   {
       if(participants == null) {
           participants = new Participant[1];
           participants[0]=p;
           return ;
       }
       Participant [] participants2 = new Participant[participants.length+1];
       for(int i = 0; i < participants.length; i++)
       {
           participants2[i] = participants[i];
       }
       participants2[participants.length-1] = p;
       participants = participants2;
   }
    public float GetCost()
    {
        return price;
    }
    public void PrintDestinations ()
    {
        for(int i = 0; i < destinations.length; i++) {
            System.out.println(destinations[i]);
        }
    }
}
