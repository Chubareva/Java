
public class Theater extends PubBuilding {
    private String movie;
    Theater(String name_new, int year_new, String adress_new, String movieName)
    {
        super(name_new, year_new, adress_new);
        movie = movieName;
    }

    public void showInfo() {
        System.out.println("Название: "+ getName() +"\nГод постройки: "+ getYear() + "\nАдрес: "+ getAdress() +
                "\nТекущий фильм: " + movie + "\n------------------------------");

    }

    public void searchAge(int year_s) {
        if(getYear() == year_s) showInfo();
    }

    public void searchBuilding(String building_s) {
        if(building_s.equals(getName())) showInfo();
    }

    public void searchMovie(String movie_s) {
        if(movie_s.equals(movie)) showInfo();
    }
}
