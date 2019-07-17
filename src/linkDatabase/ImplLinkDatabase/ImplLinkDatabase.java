package linkDatabase.ImplLinkDatabase;

import java.sql.Connection;

public interface ImplLinkDatabase {

    // 获取 数据库连接 对象
    Connection getConnection();

    // 关闭数据库链接
    void close();
}
