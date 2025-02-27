public class Destination {
    private String name;
    private boolean special;
    public int x, y;

    public boolean IsSpecial() { return special; }
    public Destination(String name, boolean special, int x, int y) {
        this.name = name;
        this.special = special;
        this.x = x;
        this.y = y;
    }
}
