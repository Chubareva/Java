
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> studentList=new ArrayList<>();

    public Group(){
        parser();
    }

    private void parser(){
        List<String> lines = new ArrayList<String>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:/Users/Inga/java/lab9-c/in.txt"));
            String line = null;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
        }
        catch (Exception exc) {}

        for(String line:lines){
            String[] content=line.split("\\s+");
            List<Integer> marks=new ArrayList<>();
            for(int i=1;i<content.length;i++)
                marks.add(Integer.valueOf(content[i]));
            studentList.add(new Student(content[0],marks));
        }
    }
    public void getFileOfExcelentStudents(){
        File excelentStudentsDir=new File("C:/Users/Inga/java/lab9-c/output");
        excelentStudentsDir.mkdir();
        File excelentStudents=new File("C:/Users/Inga/java/lab9-c/output/out.txt");


        try{
            excelentStudents.createNewFile();
            FileWriter writer = new FileWriter(excelentStudents, false);
            for(Student student:studentList){
                if(student.getAverageMark()>=7)
                    writer.write(student.getSurname()+"\n");
            }
            writer.flush();
            writer.close();

        }
        catch (IOException ex){}


    }
}
