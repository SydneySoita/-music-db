package Logic;

import java.sql.SQLException;
import java.util.List;

public interface LogicInterface{
    boolean add();
    List search(String string) throws SQLException;
    List getAll() throws SQLException;
}
