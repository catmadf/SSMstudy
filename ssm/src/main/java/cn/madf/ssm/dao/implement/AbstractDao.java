package cn.madf.ssm.dao.implement;

import cn.madf.ssm.dao.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * @author 烛影鸾书
 * @date 2019/11/25 21:29
 * @copyright© 2019
 */
public abstract class AbstractDao<T> extends SqlSessionDaoSupport implements BaseDao<T> {
    @Override
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
