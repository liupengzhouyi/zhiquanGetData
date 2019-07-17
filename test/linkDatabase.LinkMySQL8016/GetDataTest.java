package linkDatabase.LinkMySQL8016;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetDataTest {

    private String sql;

    private GetData getData;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public GetData getGetData() {
        return getData;
    }

    public void setGetData(GetData getData) {
        this.getData = getData;
    }

    @Before
    public void setUp() throws Exception {
        this.setSql("select * from companyinformation;");
        this.getData = new GetData(this.getSql());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getResultSet() {
        if (this.getGetData().getResultSet() != null) {
            System.out.println("_获取对象成功！");
        }
    }
}