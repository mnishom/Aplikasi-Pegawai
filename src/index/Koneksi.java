package index;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    public static Connection sambungDB(){
        Connection koneksi = null;
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setServerName("localhost");
            mds.setDatabaseName("crud"); 
            mds.setUser("root"); 
            mds.setPassword(""); 
            mds.setPortNumber(3306); 
            mds.setServerTimezone("Asia/Jakarta");
            koneksi = mds.getConnection();
            System.out.println("Terhubung");
            return koneksi;
            
        } catch (SQLException e) {
            System.err.println("Gagal Terhubung. Error: "+e.getMessage());
        }
        return koneksi;
    }
    
    public static void main(String[] args) {
        sambungDB();
    }
}
