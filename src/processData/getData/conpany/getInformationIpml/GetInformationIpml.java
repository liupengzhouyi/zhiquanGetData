package processData.getData.conpany.getInformationIpml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface GetInformationIpml {

    ResultSet createInformationObject() throws SQLException;

    //旧公司信息列表
    List<processData.operrationData.model.OrdCompanyInformation> ordCompanyList() throws SQLException;

    //新公司信息列表
    List<processData.operrationData.model.NewCompanyInformation> newCompanyList() throws SQLException;

}
