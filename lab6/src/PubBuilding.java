abstract class PubBuilding {
    private String name;
    private int year;
    private String adress;
    PubBuilding(String name_new, int year_new, String adress_new)
    {
        name = name_new;
        year = year_new;
        adress = adress_new;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void searchAge(int year_s) {
        if(year == year_s) showInfo();
    }

    public void showInfo() {
        System.out.println("Название: "+ name +"\nГод постройки: "+ adress + "\nАдрес: "+ adress );

    }

    public void searchBuilding(String building_s) {
        if(building_s.equals(getName())) showInfo();
    }

    public abstract void searchMovie(String movie_s);
}
