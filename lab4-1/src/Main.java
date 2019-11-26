/*Создать объект класса Планета, используя классы Материк,Океан,Остров.
Методы: вывести на консоль название материка, планеты, количество материков*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Planets> PlanetSyst = new ArrayList<>();
        PlanetSyst.add(new Materic("Eurasia ",55, true));
        PlanetSyst.add(new Materic("Africa ",30,true));
        PlanetSyst.add(new Materic("North America ",24,true));
        PlanetSyst.add(new Materic("South America ",18,true));
        PlanetSyst.add(new Materic("Antarctica ",14,true));
        PlanetSyst.add(new Materic("Australia ",8,true));
        PlanetSyst.add(new Oceans("Pasific ",155557000,11971));
        PlanetSyst.add(new Oceans("Atlantic ",76762000,9219));
        PlanetSyst.add(new Oceans("Indian ",68556000,7455));
        PlanetSyst.add(new Oceans("Artic ",14056000,5625));
        PlanetSyst.add(new Island("Greenland ",2130800));
        PlanetSyst.add(new Island("New Guinea ",303381));
        PlanetSyst.add(new Island("Borneo ",288869));
        PlanetSyst.add(new Island("Madagascar ",226658));
        PlanetSyst.add(new Island("Baffin Island ",195928));
        for(Planets num : PlanetSyst)
        {
            System.out.println(num.toString());
        }
        Scanner in = new Scanner(System.in);
        int status;
        do {

            System.out.println("\n1 - подсчитать количество материков, 2- название материка");
            status = in.nextInt();
            switch(status)
            {
                case 1: System.out.print("Количество материков: "); int kol = 0; for(Planets num :PlanetSyst) if(num.getClass()==Materic.class)
                    kol++; System.out.println(kol + "\n"); break;
                case 2: System.out.print("Названия материков: "); for(Planets num : PlanetSyst){ if(num.getClass()==Materic.class)
                    System.out.print(num.getName());} System.out.println("\n"); break;
                case 0: System.exit(1);
            }
        }
        while(2>1);
    }
}
