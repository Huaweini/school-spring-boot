package school.com.schoolconfig.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface DicDataDao extends BaseDataDao {
    List<Object> getClassList();
}
