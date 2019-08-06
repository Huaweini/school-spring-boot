package school.com.schoolconfig.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import school.com.schoolconfig.service.DicDataService;

@Controller
@RequestMapping("unit")
public class UnitController {
    @Autowired
    private DicDataService dicDataService;

    //班级结构管理
    @RequestMapping("classConfigPage")
    public String classConfigPage(){
        return "classConfigPage";
    }
}
