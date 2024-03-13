import java.sql.*;

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

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        // 4. Adim: Query Execute Et,

        ResultSet resultSet = statement.executeQuery(query);

        // 5. Adim: Sonuclari işle

        resultSet.next();                               // birinci satirdaki
        System.out.println(resultSet.getString("firstname"));   // firstname columndaki bilgiyi getirir

        resultSet.next();

        System.out.println(resultSet.getString("firstname"));

        resultSet.next();

        System.out.println(resultSet.getString("lastname"));

        System.out.println(resultSet.getString("country_code"));

        resultSet.absolute(10);

        System.out.println(resultSet.getString("email"));

        resultSet.first();

        System.out.println(resultSet.getInt("id"));



    }
}
