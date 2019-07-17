package linkDatabase.LinkMySQL8016;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkMySQL8016Test {

    private LinkMySQL8016 linkMySQL8016;

    public LinkMySQL8016 getLinkMySQL8016() {
        return linkMySQL8016;
    }

    public void setLinkMySQL8016(LinkMySQL8016 linkMySQL8016) {
        this.linkMySQL8016 = linkMySQL8016;
    }

    @Before
    public void setUp() throws Exception {
        this.linkMySQL8016 = new LinkMySQL8016();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void close() {
        this.getLinkMySQL8016().close();
    }

    @Test
    public void getConnection() {
        if (this.getLinkMySQL8016().getConnection() == null) {
            System.out.println("获取是对象失败");
        } else {
            System.out.println("获取对象成功！");
        }
    }
}