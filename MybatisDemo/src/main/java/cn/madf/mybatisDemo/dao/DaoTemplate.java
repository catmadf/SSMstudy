package cn.madf.mybatisDemo.dao;

import cn.madf.mybatisDemo.domain.User;
import cn.madf.mybatisDemo.util.SqlSessionUtil;
import jdk.nashorn.internal.ir.ReturnNode;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author 烛影鸾书
 * @date 2019/11/19 10:46
 * @copyright© 2019
 */
public class DaoTemplate {

    public static Object execute(MybatisCallback mcb){
        SqlSession s = null;

        try {
            s = SqlSessionUtil.openSession();
            Object ret =  mcb.doInMybatis(s);
            s.commit();
            return ret;
        } catch(Exception e) {
            SqlSessionUtil.rollbackSession(s);
        } finally {
            SqlSessionUtil.closeSession(s);
        }
        return null;
    }

}
