package Main;

import Logic.AlbumLogic;
import Logic.ArtistLogic;
import Model.Artist;
import UI.UserInterface;
import Util.DbUtil;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        int choice = UserInterface.userInterface();
        do {
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
//                    System.out.println("Enter artist name: ");
//                    Scanner scanner = new Scanner(System.in);
                    String artistName = "Iron Maiden";
                    AlbumLogic album = new AlbumLogic();
                    List <String> albumByArtist = album.search(artistName);
                    for (String string : albumByArtist){
                        System.out.println(string);

                    }
                    album.close();









                    break;
                case 5:
                    break;
                case 6:
                    ArtistLogic artistLogic = new ArtistLogic();
                    List<Artist> artists = artistLogic.getAll();
                    if (artists == null ){
                        System.out.println("No Artists...");
                        return;
                    }
                    for (Artist artist: artists){
                        System.out.println("Artist name: " + artist.getName());
                    }
                    artistLogic.close();


                    break;
            }

        }while (choice != 0);
    }
}
