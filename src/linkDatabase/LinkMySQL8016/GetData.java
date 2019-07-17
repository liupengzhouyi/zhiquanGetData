package linkDatabase.LinkMySQL8016;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData extends LinkMySQL8016 {

    private String sql;

    private ResultSet resultSet;

    private Statement statement;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public GetData(String sql) throws SQLException {
        this.setSql(sql);
        this.setStatement(this.getConnection().createStatement());
        this.setResultSet(this.getStatement().executeQuery(this.getSql()));
    }
}
