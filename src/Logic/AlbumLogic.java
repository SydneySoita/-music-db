package Logic;

import Model.Artist;
import Util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Util.DbUtil.*;

public class AlbumLogic implements LogicInterface{
    DbUtil dbUtil;
    public static int INDEX_ALBUM_ID = 1;
    public static int INDEX_ALBUM_NAME = 2;
    public static int INDEX_ALBUM_ARTIST = 3;

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public List search(String artist) throws SQLException {
        StringBuilder stringBuilder = new StringBuilder("SELECT ");
        stringBuilder.append(TABLE_ALBUMS);
        stringBuilder.append('.');
        stringBuilder.append(COLUMN_ALBUM_NAME);
        stringBuilder.append(" FROM ");
        stringBuilder.append(TABLE_ALBUMS);
        stringBuilder.append(" INNER JOIN ");
        stringBuilder.append(TABLE_ARTISTS);
        stringBuilder.append(" ON ");
        stringBuilder.append(TABLE_ALBUMS);
        stringBuilder.append('.');
        stringBuilder.append(COLUMN_ALBUM_ARTIST);
        stringBuilder.append(" = ");
        stringBuilder.append(TABLE_ARTISTS);
        stringBuilder.append('.');
        stringBuilder.append(COLUMN_ARTIST_ID);
        stringBuilder.append(" WHERE ");
        stringBuilder.append(TABLE_ARTISTS);
        stringBuilder.append('.');
        stringBuilder.append(COLUMN_ARTIST_NAME);
        stringBuilder.append(" = \"");
        stringBuilder.append(artist);
        stringBuilder.append("\"");
        ResultSet results = dbUtil.readData(stringBuilder.toString());
        List<String> albums = new ArrayList<>();
        while (results.next()){
            albums.add(results.getString(1));
        }
        return albums;


    }
    public void close() throws SQLException {
        dbUtil.closeConnection();
    }

    @Override
    public List getAll() {
        return null;
    }
}
