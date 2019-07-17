package processData.getData.conpany.getInformation;

import linkDatabase.LinkMySQL8016.GetData;
import processData.getData.Model.NewCompanyInformation;
import processData.getData.Model.OrdCompanyInformation;
import processData.getData.conpany.getInformationIpml.GetInformationIpml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetInformation  implements GetInformationIpml {

    private GetData getData;

    private String sql;

    private ResultSet resultSet;

    public GetInformation(String sql) throws SQLException {
        this.setSql(sql);
        this.setResultSet(this.createInformationObject());
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            System.out.print((char)(((int)('A')) + i) + ", ");
            //System.out.println("String " + (char)(((int)('A')) + i) + " = this.getResultSet().getString(\"" + (char)(((int)('A')) + i) + "\");");
        }
    }

    @Override
    public ResultSet createInformationObject() throws SQLException {
        this.getData = new GetData(this.getSql());
        return this.getGetData().getResultSet();
    }

    @Override
    public List<OrdCompanyInformation> ordCompanyList() throws SQLException {
        List<OrdCompanyInformation> list = new ArrayList<OrdCompanyInformation>();
        while(this.getResultSet().next()) {
            String A = this.getResultSet().getString("A");
            String B = this.getResultSet().getString("B");
            String C = this.getResultSet().getString("C");
            String D = this.getResultSet().getString("D");
            String E = this.getResultSet().getString("E");
            String F = this.getResultSet().getString("F");
            String G = this.getResultSet().getString("G");
            String H = this.getResultSet().getString("H");
            String I = this.getResultSet().getString("I");
            String J = this.getResultSet().getString("J");
            OrdCompanyInformation ordCompanyInformation =  new OrdCompanyInformation(A, B, C, D, E, F, G, H, I, J);
            list.add(ordCompanyInformation);
        }
        return list;
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
