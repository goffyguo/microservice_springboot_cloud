package com.boot.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.boot.mapper.UserMapper;
import com.boot.pojo.User;
import com.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author guofei
 * @date 2022/5/7 1:52 PM
 */
@Service("UserServiceImpl")
@Slf4j
public class UserServiceImpl implements UserService {



  @Override
  public JSONObject getUserList() {
    JSONObject obj = new JSONObject();
    obj.put("service","I'm service");
    return obj;
  }

  @Override
  public User getUserListNew() {
    return new User(1,"scott","123456","1");
  }

  @Override
  public void save(User user) {
    log.info("--save success");
    return;
  }
}
