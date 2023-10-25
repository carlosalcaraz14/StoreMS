package bg.smg.util;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DBManager {
    private DataSource dataSource;
    private static DBManager instance;
    DBManager() throws SQLException{
        public static  synchronized  DBManager getInstance() throws SQLException{
            if(instance==null){
                instance = new DBManager();
            }
            return instance;
        }
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/store_ms");
        dataSource.setUser("root");
        dataSource.setPassword(null);
        this.dataSource=dataSource;
    }
}
