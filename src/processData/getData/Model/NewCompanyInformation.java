package processData.getData.Model;

public class NewCompanyInformation {

    // 企业名称
    private String enterpriseName;

    // 联系人
    private String contact;

    // 联系电话
    private String call;

    // 所属行业
    private String industry;

    // 企业性质
    private String theNatureOfTheBusiness;

    // 企业规模
    private String sizeOfTheEnterprise;

    // 注册日期
    private String registrationDate;

    // 企业福利
    private String corporateBenefits;

    // 企业地址
    private String businessAddress;

    public NewCompanyInformation() {
    }

    public NewCompanyInformation(String enterpriseName, String contact, String call, String industry, String theNatureOfTheBusiness, String sizeOfTheEnterprise, String registrationDate, String corporateBenefits, String businessAddress) {
        this.enterpriseName = enterpriseName;
        this.contact = contact;
        this.call = call;
        this.industry = industry;
        this.theNatureOfTheBusiness = theNatureOfTheBusiness;
        this.sizeOfTheEnterprise = sizeOfTheEnterprise;
        this.registrationDate = registrationDate;
        this.corporateBenefits = corporateBenefits;
        this.businessAddress = businessAddress;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getTheNatureOfTheBusiness() {
        return theNatureOfTheBusiness;
    }

    public void setTheNatureOfTheBusiness(String theNatureOfTheBusiness) {
        this.theNatureOfTheBusiness = theNatureOfTheBusiness;
    }

    public String getSizeOfTheEnterprise() {
        return sizeOfTheEnterprise;
    }

    public void setSizeOfTheEnterprise(String sizeOfTheEnterprise) {
        this.sizeOfTheEnterprise = sizeOfTheEnterprise;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCorporateBenefits() {
        return corporateBenefits;
    }

    public void setCorporateBenefits(String corporateBenefits) {
        this.corporateBenefits = corporateBenefits;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    @Override
    public String toString() {
        return "NewCompanyInformation{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", contact='" + contact + '\'' +
                ", call='" + call + '\'' +
                ", industry='" + industry + '\'' +
                ", theNatureOfTheBusiness='" + theNatureOfTheBusiness + '\'' +
                ", sizeOfTheEnterprise='" + sizeOfTheEnterprise + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", corporateBenefits='" + corporateBenefits + '\'' +
                ", businessAddress='" + businessAddress + '\'' +
                '}';
    }
}
