package school.com.schoolconfig.service.impl;


import org.springframework.stereotype.Service;
import school.com.schoolconfig.dao.DicDataDao;
import school.com.schoolconfig.service.DicDataService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DicDataServiceImpl implements DicDataService {
    @Resource
    private DicDataDao dicDataDao;
    @Override
    public List<Object> getClassList() {
        return dicDataDao.getClassList();
    }
}
