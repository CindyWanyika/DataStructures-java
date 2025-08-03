package Question3;

public class Main {
    public static void main(String[] args){
        Song song1=new Song("sd342","Sex and Marijuana","Bien",100);
        Song song2=new Song("sd75642","Champagne problems","Taylor Swift",180);
        Song song3=new Song("sh902","Habits","Genevieve stokes",130);
        Song song4=new Song("kj0342","Too Sweet","Hozier",200);
        Song song5=new Song("sg1242","Mr Man","Fave",192);
        Song song6=new Song("skg067","Let You Down","Nikita Kering'",200);
        Song song7=new Song("s7y82","Sexy Villain","Remi Wolf",100);
        Song song8=new Song("rd342","Falling Behind","Laufey",103);

        DoublyLinkedList playlist=new DoublyLinkedList();
        playlist.addFirst(song1);
        playlist.addFirst(song2);
        playlist.addLast(song3);
        playlist.addLast(song4);
        playlist.addAfter("sd342",song8);

        //playlist.displayForward();
        playlist.remove("sd75642");
        playlist.find("sd75642");
        //System.out.println("AFTER DELETION\n");
        //playlist.displayBackward();
    }
}
