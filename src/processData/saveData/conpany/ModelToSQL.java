package processData.saveData.conpany;

import processData.operrationData.model.NewCompanyInformation;

public class ModelToSQL {

    private NewCompanyInformation newCompanyInformation;

    private String sql;

    public ModelToSQL(NewCompanyInformation newCompanyInformation) {
        this.newCompanyInformation = newCompanyInformation;
        this.toSQL();
    }

    // ObjectYoSQL
    public void toSQL() {
        this.setSql("insert into newCompanyInformation(enterpriseName, contact, `_call`, industry, theNatureOfTheBusiness, sizeOfTheEnterprise, registrationDate, corporateBenefits, businessAddress, introduced) value (\'"
                + this.getNewCompanyInformation().getEnterpriseName() + "\', \'"
                + this.getNewCompanyInformation().getContact() + "\',\'"
                + this.getNewCompanyInformation().getCall() + "\', \'"
                + this.getNewCompanyInformation().getIndustry() + "\', \'"
                + this.getNewCompanyInformation().getTheNatureOfTheBusiness() + "\', \'"
                + this.getNewCompanyInformation().getSizeOfTheEnterprise() + "\', \'"
                + this.getNewCompanyInformation().getRegistrationDate() + "\', \'"
                + this.getNewCompanyInformation().getCorporateBenefits() + "\', \'"
                + this.getNewCompanyInformation().getBusinessAddress() + "\', \'"
                + this.getNewCompanyInformation().getIntroduced() + "\');");
    }

    public NewCompanyInformation getNewCompanyInformation() {
        return newCompanyInformation;
    }

    public void setNewCompanyInformation(NewCompanyInformation newCompanyInformation) {
        this.newCompanyInformation = newCompanyInformation;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
