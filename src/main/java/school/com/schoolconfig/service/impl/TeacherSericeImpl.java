package school.com.schoolconfig.service.impl;

import school.com.schoolconfig.dao.TeacherDao;
import school.com.schoolconfig.pojo.Teacher;
import school.com.schoolconfig.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherSericeImpl implements TeacherService {
    @Resource
    protected TeacherDao teacherDao;

    @Override
    public List<Teacher> selectList() {
        return teacherDao.selectByParam(null);
    }

    @Override
    public int insert(Teacher param) {
        return teacherDao.insertSelective(param);
    }

    @Override
    public Teacher selectById(Long id) {
        return teacherDao.selectById(id);
    }

    @Override
    public int del(Long id) {
        return teacherDao.del(id);
    }

    @Override
    public int update(Teacher teacher) {
        return teacherDao.updateSelective(teacher);
    }

    @Override
    public List<Teacher> searchTeacher(String keyword) {
        return teacherDao.searchTeacher(keyword);
    }

    @Override
    public List<Teacher> myTeacher(Integer classNum) {
        return teacherDao.myTeacher(classNum);
    }

    @Override
    public List<Teacher> myLeader(String unit) {
        return teacherDao.myLeader(unit);
    }
}

