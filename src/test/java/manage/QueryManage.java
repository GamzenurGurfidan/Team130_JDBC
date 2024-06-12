package manage;

import lombok.Getter;

@Getter
public class QueryManage {

    private String query02 = "select name from u168183796_qaloantec.cron_schedules " +
            "LIMIT 2";

    private String updateQuery01 = "UPDATE u168183796_qaloantec.users " +
            "SET mobile = 1112222333 " +
            "WHERE username LIKE '%e_'";

    private String updateQuery02 = "UPDATE u168183796_qaloantec.users " +
            "SET mobile = ? " +
            "WHERE username LIKE ?";

    private String insertQuery03 = "Insert Into u168183796_qaloantec.admin_password_resets (id,email,token,status) " +
            "VALUES (?,?,?,?)";

    private String deleteQuery01 = "DELETE FROM u168183796_qaloantec.update_logs WHERE id = ?";

    private String deleteControlQuery = "SELECT * FROM u168183796_qaloantec.update_logs WHERE id = ?";

    private String deleteQuery02Insert = "INSERT INTO u168183796_qaloantec.support_attachments (id, support_message_id, attachment, created_at) " +
            "VALUES (?,?,?,?)";

    private String deleteQuery02 = "DELETE FROM u168183796_qaloantec.support_attachments " +
            "WHERE id = ?";

    private String deleteQuery02Control = "SELECT * FROM u168183796_qaloantec.support_attachments WHERE id = ?";

    private String become_instructor = "select role, COUNT(*) AS record_count from become_instructors group by role;";

    private String us03 = "INSERT INTO gifts(user_id, webinar_id, bundle_id, product_id , name, email, date, description, viewed, status, created_at)\n" +
            "SELECT u.id, w.id, b.id, p.id, u.full_name, u.email,\n" +
            "UNIX_TIMESTAMP(NOW()) as unix_timestamp,\n" +
            "CONCAT_WS(' ',\n" +
            "\t\t(SELECT word FROM (SELECT 'Hello' AS word UNION SELECT 'Hi' UNION SELECT 'Greetings') AS words ORDER BY RAND() LIMIT 1),\n" +
            "\t\t(SELECT word FROM (SELECT 'Wolrd' AS word UNION SELECT 'Friend' UNION SELECT 'Guest') AS words ORDER BY RAND() LIMIT 1),\n" +
            "\t\t(SELECT word FROM (SELECT '!' AS word UNION SELECT '.' UNION SELECT '!!') AS words ORDER BY RAND() LIMIT 1)\n" +
            "\t) AS description,\n" +
            "\t FLOOR (RAND() * 2 ) AS viewed,\n" +
            "\t CASE FLOOR (RAND() * 3 ) \n" +
            "\t\t WHEN 0 THEN 'active'\n" +
            "\t\t WHEN 1 THEN 'pending'\n" +
            "\t\t ELSE 'cancel'\n" +
            "\tEND AS status,\n" +
            "\tUNIX_TIMESTAMP(NOW())  AS created_at\n" +
            " FROM\n" +
            "\t(SELECT id, full_name, email FROM users ORDER BY RAND() LIMIT 1) u\n" +
            " JOIN\n" +
            "\t(SELECT id FROM webinars ORDER BY RAND () LIMIT 1) w\n" +
            " JOIN\n" +
            "\t(SELECT id FROM bundles ORDER BY RAND () LIMIT 1) b\n" +
            " JOIN\n" +
            "\t(SELECT id FROM products ORDER BY RAND () LIMIT 1) p;";

    private String us08webinars = "Select id From webinars Where start_date = UNIX_TIMESTAMP('2024-10-10 14:30:00');";


    public String getUs03() {
        return us03;
    }

    public String getBecome_instructor() {
        return become_instructor;
    }

    public String getQuery02() {
        return query02;
    }

    public String getUpdateQuery01() {
        return updateQuery01;
    }

    public String getUpdateQuery02() {
        return updateQuery02;
    }

    public String getInsertQuery03() {
        return insertQuery03;
    }

    public String getDeleteQuery01() {
        return deleteQuery01;
    }

    public String getDeleteControlQuery() {
        return deleteControlQuery;
    }

    public String getDeleteQuery02Insert() {
        return deleteQuery02Insert;
    }

    public String getDeleteQuery02() {
        return deleteQuery02;
    }

    public String getDeleteQuery02Control() {
        return deleteQuery02Control;
    }



    private String us33webinars = "SELECT full_name FROM users\n" +
            "WHERE id = (SELECT teacher_id FROM webinars ORDER BY capacity DESC LIMIT 1);";

    public String getUs33webinars() {
        return us33webinars;
    }
}
