import linkDatabase.LinkMySQL8016.SaveData;
import linkDatabase.LinkMySQL8016.SaveListSQL;
import processData.getData.conpany.getInformation.GetInformation;
import processData.operrationData.model.NewCompanyInformation;
import processData.saveData.conpany.ModelToSQL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        GetInformation getInformation = new GetInformation("select * from companyinformation;");

        List<NewCompanyInformation> list = getInformation.newCompanyList();

        SaveData saveData;

        List<String> sqlList = new ArrayList<String>();

        for (NewCompanyInformation newCompanyInformation : list) {
            String sql = new ModelToSQL(newCompanyInformation).getSql();
            sqlList.add(sql);
        }

        new SaveListSQL(sqlList);

    }
}
