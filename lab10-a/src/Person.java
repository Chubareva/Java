public class Person {
    private String surname;
    private String name;

    public Person(String surname,String name){
        this.name=name;
        this.surname=surname;
    }

    public Person(){}


    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Surname : "+surname+"\nName : "+name;
    }
}
