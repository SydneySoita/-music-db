package Logic;

import java.sql.SQLException;
import java.util.List;

import static Util.DbUtil.COLUMN_ARTIST_NAME;
import static Util.DbUtil.TABLE_ARTISTS;

public class SongLogic implements LogicInterface{
    public static final int INDEX_SONG_ID = 1;
    public static final int INDEX_SONG_TRACK = 2;
    public static final int INDEX_SONG_TITLE = 3;
    public static final int INDEX_SONG_ALBUM = 4;

    @Override
    public boolean add() {
        final String INSERT_ARTIST = "INSERT INTO" + TABLE_ARTISTS + '(' + COLUMN_ARTIST_NAME + ") VALUES(?)";
        return false;
    }

    @Override
    public List search(String string) throws SQLException {
        return null;
    }

    @Override
    public List getAll() throws SQLException {
        return null;
    }
}
