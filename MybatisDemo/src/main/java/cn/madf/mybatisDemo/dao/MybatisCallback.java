package cn.madf.mybatisDemo.dao;

import org.apache.ibatis.session.SqlSession;

/**
 * @author 烛影鸾书<3 7 5 1 7 4 1 0 2 @ qq.com>
 * @date 2019/11/19 11:13
 * @copyright© 2019
 */
public interface MybatisCallback {

    public Object doInMybatis(SqlSession s);
}
