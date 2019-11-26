
import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Student {
    private String surname;
    private List<Integer> marks;
    private double averageMark;

    public Student(String surname,List<Integer> marks){
        this.surname=surname;
        this.marks=marks;
        countAverageMark();
    }

    public double getAverageMark(){
        return averageMark;
    }

    public String getSurname(){
        return surname;
    }
    public void countAverageMark(){
        for(Integer mark:marks){
            averageMark+=mark;
        }
        averageMark/=marks.size();
    }
}
