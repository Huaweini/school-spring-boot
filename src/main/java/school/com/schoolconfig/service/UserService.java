package school.com.schoolconfig.service;

import school.com.schoolconfig.pojo.User;

import java.util.List;

public interface UserService {

    int insert(User param);


    int update(User param);

    User selectById(Long id);

    int del (User param);

    List<User>  searchUser(String keyword);

    User checkLogin(String loginName,String password);
}
