import java.util.*;

/*
Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов:
4. interface Здание  abstract class Общественное Здание  class Театр.
 */

public class Main
{
    public static void main(String[] args)
    {
        PubBuilding[] mas= new PubBuilding[3];
        mas[0] = (PubBuilding) new Theater("Театр Янки купалы",1994,"Независимости, 3","Джен Эир");
        mas[1] = (PubBuilding) new Theater("Театр кинооктера",20001,"ул. Романовская Слобода, 20","Капитанская Дчка");
        mas[2] = (PubBuilding) new Theater("Театр Оперы и Балета",1933,"ул. Богдановича, 13","ромео и Джульетта");

        for(int i=0; i<mas.length; i++)
        {
            mas[i].showInfo();
        }

        int status;
        String temp;
        Scanner in=new Scanner(System.in);

        do {
            System.out.println("Выберите критерий поиска:" + "\n1) По названию" + "\n2) По году постройки" + "\n3) По спектаклю" + "\n0) Выход");
            status = in.nextInt();
            switch (status) {
                case 1:
                    System.out.print("Введите название: ");
                    in.nextLine();
                    temp = in.nextLine();
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].searchBuilding(temp);
                    }
                    break;
                case 2:
                    System.out.print("Введите год постройки: ");
                    int age = in.nextInt();
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].searchAge(age);
                    }
                    break;
                case 3:
                    System.out.print("Введите фильм:");
                    in.nextLine();
                    temp = in.nextLine();
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].searchMovie(temp);
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }while(3>2);
    }
}