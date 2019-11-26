public class Island extends Planets {
    private int square;
    Island(String name_new, int square_new)
    {
        super(name_new);
        square = square_new;
    }

    public void show()
    {
        System.out.println("Остров " + super.getName() + ". площадь " + square + " км^2");
    }

    @Override
    public String toString() {
        return "Остров " + super.getName() + ". площадь " + square + " км^2";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Island island = (Island) o;

        return square == island.square;
    }

    @Override
    public int hashCode() {
        return square;
    }
}
