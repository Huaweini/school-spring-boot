package school.com.schoolconfig.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import school.com.schoolconfig.pojo.Teacher;

import java.util.List;

public interface TeacherDao extends BaseDataDao<Teacher> {
    Teacher selectById(Long id);

    int del(Long id);

    List<Teacher> searchTeacher(@Param("keyword")String keyword);

    List<Teacher> myTeacher(@Param("classNum")Integer classNum);

    List<Teacher> myLeader(String unit);
}
