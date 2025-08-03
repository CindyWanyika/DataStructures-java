package Question3;

public class Song {
    private String id;
    private String title;
    private String author;
    private int duration;

    public Song(String id,String title,String author,int duration){
        this.id=id;
        this.title=title;
        this.author=author;
        this.duration=duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString(){
        return "Song ID: "+this.id+"\n"+
                "Title: "+this.title+"\n"+
                "Author: "+this.author+"\n"+
                "Duration: "+this.duration+" seconds\n";

    }
}
