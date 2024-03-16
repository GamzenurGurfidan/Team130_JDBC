package manage;

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
}
