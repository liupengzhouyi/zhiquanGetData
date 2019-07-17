package linkDatabase.LinkMySQL8016;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveData extends LinkMySQL8016 {

    private String sql;

    private Statement statement;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public SaveData(String sql) throws SQLException {
        this.setSql(sql);
        this.setStatement(this.getConnection().createStatement());
        this.getStatement().execute(this.getSql());
    }

}
