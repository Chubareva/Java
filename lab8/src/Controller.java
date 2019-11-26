

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private List<Track> allTracks;
    private Disk playList=new Disk();
    private Service service=new Service();
    public Controller(){
        try {
            allTracks= TracksXML.deserialize();
        }
        catch (FileNotFoundException e){
            System.err.println(e);
        }
    }
    public void start(){
        System.out.println("Давайте заполним плейлист, выбирете треки,которые должны быть добавлены(Треки должны быть написаны через пробел) : ");
        fillInPlayList();
        menu();


    }
    private void fillInPlayList(){
        Scanner in=new Scanner(System.in);
        service.printTrackList(allTracks);
        String[] requests=in.nextLine().split(" ");
        try{
            isThereException(requests);
            for(String str:requests)
                playList.addTrack(allTracks.get(Integer.valueOf(str)));
        }
        catch (InputException ex){
            System.out.println(ex.getMessage());
            fillInPlayList();
        }
        catch (NullPointerException e){
            System.out.println("Вы ничего не ввели,введите еще раз");
            fillInPlayList();
        }
    }

    private void isThereException(String[] request) throws InputException{
        for(String string: request){
            if(!string.matches("-?\\d+(\\.\\d+)?") || Integer.parseInt(string)>=allTracks.size())
                throw new InputException();
        }
    }

    private void menu(){
        Scanner in=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("1.Отсортировать по стилю трека");
        System.out.println("2.Добавить новый трек в плейлист ");
        System.out.println("3.Подсчитать продолжительность всего плейлиста");
        System.out.println("4.Найти композиции,соответствующие диапозону длины треков");
        System.out.println("5.Вывести весь плейлист");
        System.out.println("6.Выйти");
        switch (in.nextInt()){
            case 1:
                System.out.println("\f");
                playList=service.sortByMusicStyle(playList);
                service.printTrackList(playList.getPlayList());
                menu();
                break;
            case 2:
                playList.addTrack(service.addingNewTrack());
                menu();
                break;
            case 3:
                System.out.println("\f");
                System.out.println("Длительность всего плейлиста : "+playList.getTotalDuration());
                menu();
                break;
            case 4:
                System.out.println("\f");
                System.out.println("Введите диапозон длины:");
                double from,to;
                do{
                    try {
                        from=in.nextDouble();
                        to=in.nextDouble();
                        if(from<=to || from>0 ||to>0)break;
                    }
                    catch (InputMismatchException e){ }
                    System.out.println("Ошибка ввода");
                }
                while (true);
                service.findByRange(playList.getPlayList(),from,to);
            case 5:
                service.printTrackList(playList.getPlayList());
                menu();
                break;
            case 6:
                return;
            default:
                System.out.println("Выберите еще раз ");
                menu();
                break;

        }

    }




}
