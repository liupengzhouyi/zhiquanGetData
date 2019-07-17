package processData.getData.Model;

public class Converter {

    private OrdCompanyInformation ordCompanyInformation;

    private NewCompanyInformation newCompanyInformation;

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

    public Converter() {
    }

    public Converter(OrdCompanyInformation ordCompanyInformation) {
        this.ordCompanyInformation = ordCompanyInformation;
    }

    public void createEnterpriseName() {

    }

    public OrdCompanyInformation getOrdCompanyInformation() {
        return ordCompanyInformation;
    }

    public void setOrdCompanyInformation(OrdCompanyInformation ordCompanyInformation) {
        this.ordCompanyInformation = ordCompanyInformation;
    }

    public NewCompanyInformation getNewCompanyInformation() {
        return newCompanyInformation;
    }

    public void setNewCompanyInformation(NewCompanyInformation newCompanyInformation) {
        this.newCompanyInformation = newCompanyInformation;
    }
}
