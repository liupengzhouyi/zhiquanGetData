package processData.getData.conpany.getInformation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import processData.operrationData.model.NewCompanyInformation;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class GetInformationTest {

    private GetInformation getInformation;

    public GetInformation getGetInformation() {
        return getInformation;
    }

    public void setGetInformation(GetInformation getInformation) {
        this.getInformation = getInformation;
    }

    @Before
    public void setUp() throws Exception {
        this.getInformation = new GetInformation("select * from companyinformation;");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createInformationObject() {
        if (this.getGetInformation().getResultSet() != null) {
            System.out.println("从数据库中获取就goon公司的信息，没有发现错误！");
        } else {
            System.out.println("从数据库中获取就goon公司的信息，发现错误！取不出数据！");
        }
    }

    @Test
    public void ordCompanyList() throws SQLException {

        List<processData.operrationData.model.OrdCompanyInformation> list = this.getGetInformation().ordCompanyList();

        processData.operrationData.model.OrdCompanyInformation ordCompanyInformation = list.get(56);

        System.out.print(ordCompanyInformation.toString());
    }

    @Test
    public void newCompanyList() throws SQLException {

        List<NewCompanyInformation> list = this.getGetInformation().newCompanyList();

        NewCompanyInformation newCompanyInformation = list.get(68);

        System.out.print(newCompanyInformation.toString());

    }
}