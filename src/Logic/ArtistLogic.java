package Logic;

import Model.Artist;
import Util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Util.DbUtil.*;

public class ArtistLogic implements LogicInterface{

    DbUtil dbUtil;
    public static final int INDEX_ARTIST_ID = 1;
    public static final int  INDEX_ARTIST_NAME = 2;

    {
        try {
            dbUtil = new DbUtil();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    ResultSet results;

    {
        try {
            results = dbUtil.readData("SELECT * FROM ARTISTS");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean add() {
        return false;
    }

    @Override
    public List search(String string) throws SQLException {
        return null;
    }

    @Override
    public List getAll() throws SQLException {
        List<Artist> artists = new ArrayList<>();
        while (results.next()){
            Artist artist = new Artist();
            artist.setId(results.getInt(COLUMN_ARTIST_ID));
            artist.setName(results.getString(COLUMN_ARTIST_NAME));
            artists.add(artist);

        }

        return artists;
    }
    public void close() throws SQLException {
        dbUtil.closeConnection();
    }
}
