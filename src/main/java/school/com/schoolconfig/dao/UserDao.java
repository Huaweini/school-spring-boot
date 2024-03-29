package school.com.schoolconfig.dao;

import org.apache.ibatis.annotations.Mapper;
import school.com.schoolconfig.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao extends BaseDataDao<User> {
    User selectById(Long id);

    int del(User param);

    List<User> searchUser(@Param("keyword") String keyword);

    User findByLoginNameAndPassword(@Param("loginName") String loginName,@Param("password") String password);
}
