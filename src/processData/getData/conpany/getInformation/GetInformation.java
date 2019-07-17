package processData.getData.conpany.getInformation;

import linkDatabase.LinkMySQL8016.GetData;
import processData.getData.Model.NewCompanyInformation;
import processData.getData.Model.OrdCompanyInformation;
import processData.getData.conpany.getInformationIpml.GetInformationIpml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GetInformation  implements GetInformationIpml {

    private GetData getData;

    private String sql;

    private ResultSet resultSet;

    public GetInformation(String sql) throws SQLException {
        this.setSql(sql);
        this.setResultSet(this.createInformationObject());
    }

    @Override
    public ResultSet createInformationObject() throws SQLException {
        this.getData = new GetData(this.getSql());
        return this.getGetData().getResultSet();
    }

    @Override
    public List<OrdCompanyInformation> ordCompanyList() {
        return null;
    }

    @Override
    public List<NewCompanyInformation> newCompanyList() {
        return null;
    }

    public GetData getGetData() {
        return getData;
    }

    public void setGetData(GetData getData) {
        this.getData = getData;
    }

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
}
