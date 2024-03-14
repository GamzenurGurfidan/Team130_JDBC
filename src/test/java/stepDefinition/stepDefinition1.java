package stepDefinition;

import io.cucumber.java.en.Given;
import manage.QueryManage;
import org.junit.Assert;
import utilities.JDBCReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class stepDefinition1 {

    ResultSet resultSet;

    String query;

    QueryManage queryManage = new QueryManage();

    @Given("Database baglantisi kurulur")
    public void database_baglantisi_kurulur() {

        JDBCReusableMethods.getConnection();
    }

    @Given("Query01 hazirlanir ve execute edilir")
    public void query01_hazirlanir_ve_execute_edilir() throws SQLException {

        query = "SELECT user_id FROM u168183796_qaloantec.deposits " +
                "WHERE amount BETWEEN 100 AND 500";

        resultSet = JDBCReusableMethods.getStatement().executeQuery(query);

    }

    @Given("ResultSet01 sonuclari islenir")
    public void result_set01_sonuclari_islenir() throws SQLException {

        resultSet.next();
        int actualResult = resultSet.getInt("user_id");
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);

    }

    @Given("Database baglantisi kapatilir")
    public void database_baglantisi_kapatilir() {
        JDBCReusableMethods.closeConnection();

    }

    // QUERY 02

    @Given("Query02 hazirlanir ve execute edilir")
    public void query02_hazirlanir_ve_execute_edilir() throws SQLException {

        query = queryManage.getQuery02();
        resultSet = JDBCReusableMethods.getStatement().executeQuery(query);

    }

    @Given("ResultSet02 sonuclari islenir")
    public void result_set02_sonuclari_islenir() throws SQLException {

        /*
            test datalarimiz bize su sekilde verildi
                5 Minutes
                10 Minutes
         */

        List<String> expectedNames = new ArrayList<>();
        expectedNames.add("5 Minutes");
        expectedNames.add("10 Minutes");

        List<String> actualNames = new ArrayList<>();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            actualNames.add(name);
        }

        for (int i = 0; i < actualNames.size(); i++) {
            assertEquals(expectedNames.get(i), actualNames.get(i));
            System.out.println(i + ". index dogrulandi");
        }

    }
}
