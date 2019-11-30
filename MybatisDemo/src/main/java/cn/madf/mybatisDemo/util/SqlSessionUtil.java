package cn.madf.mybatisDemo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 烛影鸾书
 * @date 2019/11/19 10:48
 * @copyright© 2019
 */
public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 开启会话
     */
    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     * 关闭会话
     */
    public static void closeSession(SqlSession s) {
        if (s != null) {
            s.close();
        }
    }

    /**
     * 回滚
     */
    public static void rollbackSession(SqlSession s) {
        if (s != null) {
            s.rollback();
        }
    }

}
