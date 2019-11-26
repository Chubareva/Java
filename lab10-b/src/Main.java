

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*На базе коллекций реализовать структуру хранения чисел с поддержкой следующих операций:
 добавление/удаление числа;
 поиск числа, наиболее близкого к заданному (т. е. модуль разницы мини-
мален).*/

public class Main {
    private List<Number> collection=new ArrayList<>();

    public Main(){
        initializing();
    }
    public void remove(Number number){
        collection.remove(number);
    }

    public void add(Number number){
        collection.add(number);
    }

    public Number find(Double number){

        Double min = collection.get(0).doubleValue();

        for(Number elem:collection){
            if (Math.abs(elem.doubleValue() - number) < Math.abs(min - number)) {
                min = elem.doubleValue();
            }
        }
        return min;
    }

    private void initializing(){
        collection.add(123);
        collection.add(0);
        collection.add(545.0/34.0);
        collection.add(54f);
        collection.add(118);

    }

    public static void main(String[] args){
        Main exp=new Main();
        System.out.println("Введите число :");
        Scanner scanner=new Scanner(System.in);
        Double request=Double.valueOf(scanner.nextLine());
        System.out.println("Максимально приблеженно число к "+request+" is "+exp.find(request));

    }

}
