import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

    // Sizden bir JDBC testi yapilmasi istendiğinde yapacağımız ilk iş:

    // ilgili database yöneticisi ile iletisime gecerek
    // DATABASE ACCESS INFORMATION'larii edinmek

    /*
            type    jdbc:mysql
            host/ip 45.87.83.5
            port    3306
            database_name   u168183796_qaloantec
            username    u168183796_qaloantecuser
            password    0&vG1A/MuWN
     */


    /*

    URL: "jdbc:mysql://45.87.83.5/u168183796_qaloantec";
    USERNAME= "u168183796_qaloantecuser";
    PASSWORD="0&vG1A/MuWN";

     */

    // Verilen ACCESS INFORMATIONlardan URL username ve password cıkartmanız gerekir

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. Adim: Dogru surucuyu ekle

        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Adim: Database ile baglanti kur

        Connection connection = DriverManager.getConnection("jdbc:mysql://45.87.83.5/u168183796_qaloantec",
                                                            "u168183796_qaloantecuser",
                                                            "0&vG1A/MuWN");

        // 3. Adim: SQL QUERYsi olustur

        String query = "SELECT * FROM u168183796_qaloantec.users";


    }
}
