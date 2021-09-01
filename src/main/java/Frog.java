public class Frog {
    public static final int MIN_POSITION = 0;
    public static final int MAX_POSITION = 10;

    protected int position;

    public Frog() {
        position = 5;
    }

    public boolean jump(int steps) {
        if (position + steps > MAX_POSITION || position + steps < MIN_POSITION) {
            return false;
        }
        position = position + steps;
        return true;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "position=" + position +
                '}';
    }
}
