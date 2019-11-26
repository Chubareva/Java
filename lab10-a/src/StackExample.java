
//Создать стек из номеров записи. Организовать прямой доступ к элементам записи.

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    Stack<Note> noteStack=new Stack();

    public StackExample(){
        intializing();
    }

    private void intializing(){
        noteStack.add(new Note(1,new Person("Chubareva","Inga")));
        noteStack.add(new Note(2,new Person("Karchevskaya","Dasha")));
        noteStack.add(new Note(3,new Person("Vazhinskaya","Nastya")));
        noteStack.add(new Note(4,new Person("Fedosik","Angelina")));
        noteStack.add(new Note(5,new Person("Nitievskiy","Dima")));
    }

    public Person getElement(int request){
        for(Note note:noteStack){
            if(note.getNumber()==request)return note.getPerson();
        }
        return  new Person();
    }


    public static void main(String[] args){
        StackExample stackExample=new StackExample();
        System.out.println("Введите номер записи :");
        Scanner scanner=new Scanner(System.in);
        int request=scanner.nextInt();
        Person requiredPerson=stackExample.getElement(request);
        if(requiredPerson!=null) System.out.println(requiredPerson.toString());
        else System.out.println("Пользователь не был найден");

    }
}



