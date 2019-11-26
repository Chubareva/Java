

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//10. Создать класс Mobile с внутренним классом, с помощью которого
//        можно хранить информацию о моделях телефонов и их свойствах.
public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите путь к файлу с данными :");
        Scanner scanner = new Scanner(System.in);
        String pathToFile = scanner.nextLine();
        BufferedReader scannerFile = new BufferedReader(new InputStreamReader(new FileInputStream(pathToFile)));
        String line = null;
        List<Mobile> mobiles = new ArrayList<>();
        while ((line = scannerFile.readLine()) != null)
        {
            String[] datas = line.split(":");
            String model = datas[0];
            int price = Integer.valueOf(datas[1]);
            int memory = Integer.valueOf(datas[2]);
            int camera = Integer.valueOf(datas[3]);

            System.out.println("Какой тип внутреннего класса Вы хотите сейчас использовать для заполнения объекта:\n" +
                    "1 - Nested Inner classes(вложенный внутренний класс)\n" +
                    "2 - Static Nested classes(статический вложенный класс)\n" +
                    "3 - Method Local Inner classes(внутренний класс в локальном методе)\n" +
                    "4 - Anonymous Inner classes(анонимный класс)\n" +
                    "0 - Exit");
            int type = scanner.nextInt();
            if (type == 0)
            {
                break;
            }
            Mobile mobile = new Mobile();
            switch (type)
            {
                case 1:
                    mobile.fillNestedInner(model, price, memory, camera);
                    break;
                case 2:
                    mobile = mobile.fillStaticInner(model, price, memory, camera);
                    break;
                case 3:
                    mobile.fillLocalInner(model, price, memory, camera);
                    break;
                case 4:
                    mobile.fillAnonymousInner(model, price, memory, camera);
                    break;
                default:
                    mobile.fill(model, price, memory, camera);
            }
            mobiles.add(mobile);
        }
        System.out.println(String.format("Вы заполнили %s записей мобильных телефонов", mobiles.size()));
        if (!mobiles.isEmpty())
        {
            while (true)
            {
                System.out.println("Какой тип внутреннего класса Вы хотите сейчас использовать для отображения информации:\n" +
                        "1 - Nested Inner classes(вложенный внутренний класс)\n" +
                        "2 - Static Nested classes(статический вложенный класс)\n" +
                        "3 - Method Local Inner classes(внутренний класс в локальном методе)\n" +
                        "4 - Anonymous Inner classes(анонимный класс)\n" +
                        "0 - Exit");
                int type = scanner.nextInt();
                if (type == 0)
                {
                    break;
                }
                for (Mobile mobile : mobiles)
                {
                    String mobileDesc = null;
                    switch (type)
                    {
                        case 1:
                            mobileDesc = mobile.toStringInner();
                            break;
                        case 2:
                            mobileDesc = mobile.toStringStaticInner();
                            break;
                        case 3:
                            mobileDesc = mobile.toStringLocalInner();
                            break;
                        case 4:
                            mobileDesc = mobile.toStringAnonymousInner();
                            break;
                        default:
                            mobileDesc = mobile.toString();
                    }
                    System.out.println(mobileDesc);
                }
            }
        }
    }
}
