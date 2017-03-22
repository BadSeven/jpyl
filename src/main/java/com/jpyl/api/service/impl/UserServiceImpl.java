package com.jpyl.api.service.impl;

import com.jpyl.api.service.def.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/22.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    SqlSessionTemplate sqlSession;

    public Object firstTest()throws Exception{

        return sqlSession.selectList("firstTest");
    }
}
