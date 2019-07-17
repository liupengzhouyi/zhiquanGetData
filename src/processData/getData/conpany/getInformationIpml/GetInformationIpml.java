package processData.getData.conpany.getInformationIpml;

import java.sql.ResultSet;
import java.util.List;

public interface GetInformationIpml {

    ResultSet createInformationObject();

    //旧公司信息列表
    List<processData.getData.Model.OrdCompanyInformation> ordCompanyList();

    //新公司信息列表
    List<processData.getData.Model.NewCompanyInformation> newCompanyList();

}