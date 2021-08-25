package Util;

import java.sql.*;

public class DbUtil {
    final String url = "jdbc:sqlite:music.db";
    private Connection connection;
    private Statement statement;
    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";
    public DbUtil() throws SQLException {
        connection = DriverManager.getConnection(url);
    }
    public ResultSet readData(String query) throws SQLException {
        statement = connection.createStatement();
        return statement.executeQuery(query);
    }
    public int writeData(String query) throws SQLException {
        statement = connection.createStatement();
        return statement.executeUpdate(query);
    }
    public void closeConnection() throws SQLException {
        statement.close();
        connection.close();
    }

}
