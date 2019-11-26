public class Oceans extends Planets {
    private int square;
    private int depth;
    Oceans(String name_new, int square_new, int depth_new)
    {
        super(name_new);
        square = square_new;
        depth = depth_new;
    }

    public boolean isOcean()
    {
        return true;
    }

    public void show()
    {
        System.out.println("Океан " + super.getName() + ". площадь " + square + " кв.км  глубина " +
                depth + " м.");
    }

    @Override
    public String toString() {
        return "Океан " + super.getName() + ". площадь " + square + " кв.км  глубина " +
                depth + " м.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oceans oceans = (Oceans) o;

        if (square != oceans.square) return false;
        return depth == oceans.depth;
    }

    @Override
    public int hashCode() {
        int result = square;
        result = 31 * result + depth;
        return result;
    }
}
