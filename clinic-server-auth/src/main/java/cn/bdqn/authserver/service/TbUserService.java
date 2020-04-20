package cn.bdqn.authserver.service;

import cn.bdqn.authserver.domain.TbUser;
import cn.bdqn.authserver.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbUserService {

    @Autowired
    private TbUserMapper userMapper;

    public TbUser getUserByUsername(String username){
        return userMapper.getByUsername(username);
    }
}
