package processData.getData.Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrdCompanyInformationTest {

    private OrdCompanyInformation ordCompanyInformation;

    public OrdCompanyInformation getOrdCompanyInformation() {
        return ordCompanyInformation;
    }

    public void setOrdCompanyInformation(OrdCompanyInformation ordCompanyInformation) {
        this.ordCompanyInformation = ordCompanyInformation;
    }

    @Before
    public void setUp() throws Exception {
        this.ordCompanyInformation = new OrdCompanyInformation(
                "中天建设集团有限公司内蒙古公司",
                "联 系 人：张部长",
                "联系电话：04715255440",
                "所属行业：石油/石化/化工",
                "企业性质：股份合作制企业",
                "企业规模：1000人以上",
                "注册日期：2017-05-26",
                "企业福利：五险一金、周末双休、包住、话补",
                "企业地址：包头市高新区幸福南路",
                "\"中天发展控股集团有限公司（简称中天集团）是一家以土木建筑、房产开发、化工新材料、投资为主要经营业务的全国500强大型企业集团。下辖中天建设集团有限公司，浙江中天房产集团有限公司和浙江中天氟硅材料有限公司等10多家成员企业。" +
                        "   2010年，中天全集团营业总收入330亿元，继续位列中国企业500强，中国民营企业50强，浙江省百强企业等。中天集团一直来坚持诚信为本、质量兴业，以“诚信、务实、创新、领先”为核心理念，以“真心缔造美好家园”为企业使命，倡导“以人为本”的企业文化。荣获全国质量奖单位、全国文明单位、全国守合同重信用单位、中国优秀企业公民、中华慈善奖企业等荣誉。" +
                        "    “中天建设”在国内已经形成了以杭州、上海、北京、西安、武汉、广州、天津、成都、沈阳、南宁、呼和浩特等中心城市为主的区域市场，企业经营地域覆盖国内20几个省、市、自治区、年竣工面积超1500万平方米，外省业务占85%以上。多年来，共创出鲁班奖18项，国优银质奖、詹天佑奖、全国用户满意工程、建设部优质样板工程等省部级以上优质工程600多项。2010年，因实施卓越的绩效管理，中天建设集团有限公司被浙江省政府授予首届省政府质量奖。" +
                        "       中天集团以“诚信、务实、创新、领先”为核心理念，以“真心缔造美好家园”为企业使命，肩负起“企业公民”的应有的责任，向着“品牌中天”的目标不断迈进。" +
                        "    中天内蒙古公司是中天建设集团有限公司下辖的十四大区域公司之一，是在集团公司“转型升级”战略的背景下于2010年2月设立，区域公司总部设在内蒙古自治区首府—呼和浩特市，管辖着内蒙古自治区和山西省两个主体市场，下设山西分公司。立足于内蒙古经济最活跃的呼、包、鄂“金三角”地区，并成功开拓了乌海市场，目前的业务承接量逐年大幅提升，业务领域已涵经盖了民用房屋建筑工程，工业和电力厂房项目、市政公用工程、装饰等各个领域，并且连续多次获得煤炭行业工程质量的最高奖项“太阳杯”和建设行业的 “省级优质样板工程”、“省级安全文明示范工地”、“安全文明工地”等各项荣誉，受到了当地建设主管部门的一致好评和业主单位的高度赞扬，使得“中天”品牌在祖国的北疆拥有了较高的知名度和美誉度。\"");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getA() {
        System.out.println(this.getOrdCompanyInformation().getA());
    }

    @Test
    public void getB() {
        System.out.println(this.getOrdCompanyInformation().getB());
    }

    @Test
    public void getC() {
        System.out.println(this.getOrdCompanyInformation().getC());
    }

    @Test
    public void getD() {
        System.out.println(this.getOrdCompanyInformation().getD());
    }

    @Test
    public void getE() {
        System.out.println(this.getOrdCompanyInformation().getE());
    }

    @Test
    public void getF() {
        System.out.println(this.getOrdCompanyInformation().getF());
    }

    @Test
    public void getG() {
        System.out.println(this.getOrdCompanyInformation().getG());
    }

    @Test
    public void getH() {
        System.out.println(this.getOrdCompanyInformation().getH());
    }

    @Test
    public void getI() {
        System.out.println(this.getOrdCompanyInformation().getI());
    }

    @Test
    public void getJ() {
        System.out.println(this.getOrdCompanyInformation().getJ());
    }

    @Test
    public void toString1() {
        System.out.println(this.getOrdCompanyInformation().toString());
    }
}