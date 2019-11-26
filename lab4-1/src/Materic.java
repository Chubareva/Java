public class Materic extends Planets {
    private int square;
    private boolean people;
    Materic(String name_new, int square_new,boolean people_new)
    {
        super(name_new);
        square = square_new;
        people = people_new;
    }

    public boolean isMateric()
    {
        return true;
    }

    public void show()
    {
        System.out.print("Материк " + super.getName() + ". Площадь " + square + " млн кв. км население ");
        if(people) System.out.println("есть");
        else System.out.println("нет");

    }

    @Override
    public String toString() {
        String str = "Материк " + super.getName() + ". Радиус " + square + " млн кв. км население ";
        if(people) str += "есть";
        else str += "нет";
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Materic materic = (Materic) o;

        if (square != materic.square) return false;
        return people == materic.people ;
    }

    @Override
    public int hashCode() {
        int result = square;
        result = 31 * result + (people ? 1 : 0);
        return result;
    }

}
