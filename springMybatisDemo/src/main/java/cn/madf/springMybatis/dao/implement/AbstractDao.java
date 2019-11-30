package cn.madf.springMybatis.dao.implement;

import cn.madf.springMybatis.dao.BaseDao;
import com.sun.org.apache.regexp.internal.REUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/25 21:29
 * @copyright© 2019
 */
public abstract class AbstractDao<T> extends SqlSessionDaoSupport implements BaseDao<T> {
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
