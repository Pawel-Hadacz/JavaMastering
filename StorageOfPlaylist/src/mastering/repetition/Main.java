package mastering.repetition;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Katastrofa", "Młody Hades");
        album.addSong("Zombie" , 4.5);
        album.addSong("Tone" , 3.2);
        album.addSong("Bloki" , 2.2);
        album.addSong("Taniec" , 4.22);
        album.addSong("Cos" , 3.11);
        album.addSong("Kłak" , 1.9);
        album.addSong("Flesh" , 2.55);
        album.addSong("Man" , 2.23);
        albums.add(album);
        album = new Album("Woda", "Borsi");
        album.addSong("Krec" , 4.5);
        album.addSong("Gabi" , 3.2);
        album.addSong("Mrok" , 2.2);
        album.addSong("Ksiezyc" , 4.22);
        album.addSong("Piwko" , 3.11);
        album.addSong("Wojna" , 1.9);
        album.addSong("Pad" , 2.55);
        album.addSong("Moj" , 2.23);
        albums.add(album);
        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Cos",playList);
        albums.get(0).addToPlayList("Flesh",playList);
        albums.get(0).addToPlayList("Krol",playList); // nie ma
        albums.get(0).addToPlayList(8,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(5,playList);
        albums.get(1).addToPlayList(18,playList); // nie ma
        System.out.println(album);
        System.out.println(albums);
        play(playList);


    }
    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean foward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }
        else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("PLaylist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!foward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        foward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("End of the playlist");
                        foward = false;
                    }
                    break;
                case 2:
                    if(foward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        foward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("Start of the playlist");
                        foward = true;
                    }
                    break;
                case 3:
                    if(foward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            foward = false;
                        }else {
                            System.out.println("Start of the pleylist");
                        }
                        }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying  " + listIterator.previous());
                            foward = true;
                        }
                        else {
                            System.out.println("The end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                   printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }

    }
private static void printMenu(){
    System.out.println("Options: \n");
    System.out.println("0 - exit\n" +
            "1 - next song\n" +
            "2 - prev song\n" +
            "3 - replay song\n" +
            "4 - list songs in the playlist\n" +
            "5 - print options\n" +
            "6 - delete current song"
             );
}
private static void printList(LinkedList<Song> playList){
    Iterator<Song> iterator = playList.iterator();
    System.out.println("---------------------------");
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
    System.out.println("---------------------------");
}

}
