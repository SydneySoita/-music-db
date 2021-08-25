package Model;

public class Album {
    private int id;
    private String name;
    private int artistId;

    public Album(int id, String name,int artistId) {
        this.id = id;
        this.name = name;
        this.artistId = artistId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArtist() {
        return artistId;
    }

    public void setArtist(int artistId) {
        this.artistId = artistId;
    }
}
