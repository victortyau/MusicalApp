package labs.bamboo.musicalapp;

public class MusicView {

    private int imageId;

    private String musicName;

    private String musicAuthor;

    public MusicView(int imageId, String musicName, String musicAuthor){
        this.imageId = imageId;
        this.musicName = musicName;
        this.musicAuthor = musicAuthor;
    }

    public int getImageId(){
        return imageId;
    }

    public String getMusicName(){
        return musicName;
    }

    public String getMusicAuthor(){
        return musicAuthor;
    }
}
