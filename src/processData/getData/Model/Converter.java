package processData.getData.Model;

public class Converter {

    private OrdCompanyInformation ordCompanyInformation;

    private NewCompanyInformation newCompanyInformation;
   

    public Converter() {
    }

    public Converter(OrdCompanyInformation ordCompanyInformation) {
        this.ordCompanyInformation = ordCompanyInformation;
    }

    // 企业名称
    public void createEnterpriseName() {
        String str = this.getOrdCompanyInformation().getA();
        this.getNewCompanyInformation().setEnterpriseName(str);
    }

    // 联系人
    public void createContact() {
        String str = this.getOrdCompanyInformation().getB();
        //联 系 人：人事部
        str = str.replaceAll("联 系 人：", "");
        this.getNewCompanyInformation().setContact(str);
    }

    // 联系电话
    public void createCall() {
        String string = this.getOrdCompanyInformation().getC();
        //联系电话：17484848845
        string = string.replaceAll("联系电话：", "");
        this.getNewCompanyInformation().setCall(string);
    }

    // 所属行业
    public void createIndustry() {
        String string = this.getOrdCompanyInformation().getD();
        //所属行业：娱乐/体育/休闲
        string = string.replaceAll("所属行业：", "");
        this.getNewCompanyInformation().setIndustry(string);
    }

    // 企业性质
    public void createTheNatureOfTheBusiness() {
        String string = this.getOrdCompanyInformation().getE();
        //企业性质：集体企业
        string = string.replaceAll("企业性质：", "");
        this.getNewCompanyInformation().setTheNatureOfTheBusiness(string);
    }

    // 企业规模
    public void createSizeOfTheEnterprise() {
        String string = this.getOrdCompanyInformation().getF();
        //企业规模：50-100人
        string = string.replaceAll("企业规模：", "");
        this.getNewCompanyInformation().setSizeOfTheEnterprise(string);
    }

    // 注册日期
    public void createRegistrationDate() {
        String string = this.getOrdCompanyInformation().getG();
        //注册日期：2017-05-25
        string = string.replaceAll("注册日期：", "");
        this.getNewCompanyInformation().setRegistrationDate(string);
    }

    // 企业福利
    public void createCorporateBenefits() {
        String string = this.getOrdCompanyInformation().getH();
        //企业福利：五险一金、周末双休、包住、话补
        string = string.replaceAll("企业福利：", "");
        this.getNewCompanyInformation().setCorporateBenefits(string);
    }
                
    // 企业地址
    public void createBusinessAddress() {
        String string = this.getOrdCompanyInformation().getI();
        //企业地址：呼和浩特市呼赛罕区伦贝尔南路东达广场写字楼1011A室
        string = string.replaceAll("企业地址：", "");
        this.getNewCompanyInformation().setBusinessAddress(string);
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
