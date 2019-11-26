public class Note {
    private int number;
    private Person person;

    public Note(int number,Person person){
        this.number=number;
        this.person=person;
    }

    public int getNumber() {
        return number;
    }

    public Person getPerson() {
        return person;
    }
}
