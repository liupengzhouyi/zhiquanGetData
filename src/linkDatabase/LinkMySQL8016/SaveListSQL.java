package linkDatabase.LinkMySQL8016;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class SaveListSQL extends LinkMySQL8016 {

    private Statement statement;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public SaveListSQL(List<String> list) throws SQLException {
        this.setStatement(this.getConnection().createStatement());
        for (String sql : list) {
            this.getStatement().execute(sql);
        }

    }

}
