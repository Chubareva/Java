abstract class Planets {
    private String name;
    Planets(String name_new)
    {
        name = name_new;
    }

    abstract public void show();

    public String getName() {
        return name;
    }

    public boolean isMateric()
    {

        return true;
    }




}
