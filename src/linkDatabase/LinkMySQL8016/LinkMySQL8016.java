package linkDatabase.LinkMySQL8016;

import linkDatabase.ImplLinkDatabase.ImplLinkDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class LinkMySQL8016 implements ImplLinkDatabase {

    //定义数据库驱动类
    private final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    //定义数据库连接URL
    private final String DBURL = "jdbc:mysql://localhost:3306/myData?&useSSL=false&serverTimezone=UTC";
    //定义数据库连接用户名
    private final String DBUSER = "root";
    //定义密码
    private final String DBPASSWORD = "Lp184126";
    //定义连接对象
    private Connection connection = null;

    //构造方法，加载驱动
    public LinkMySQL8016() {
        try{
            Class.forName(DBDRIVER);
            this.connection = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        }catch(Exception e){
            System.out.println("加载驱动失败");
        }
        System.out.println("数据库驱动加载成功！");
    }

    //关闭数据库
    @Override
    public void close(){
        /*try {
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        this.connection = null;
        if (this.connection == null) {
            System.out.println("数据库连接已关闭！");
        } else {
            System.out.println("数据库连接关闭失败！");
        }
    }

    //取得数据库连接
    @Override
    public Connection getConnection() {
        return this.connection;
    }

}
