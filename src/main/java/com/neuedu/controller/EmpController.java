package com.neuedu.controller;

import com.neuedu.entity.Emp;
import com.neuedu.service.EmpService;
import com.neuedu.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

//    @RequestMapping(value = "/empList")
//    public String empList(){
//        System.out.println(1);
//        System.out.println(empService.listEmp());
//        return "";
//    }


    @RequestMapping(value = "/emplist")
    @ResponseBody
    @CrossOrigin  //开放跨域
    public ResultVO empList(){
        return ResultVO.success(empService.listEmp());
    }

    @RequestMapping(value = "/empdeptlist")
    @ResponseBody
    @CrossOrigin  //开放跨域
    public ResultVO empDeptList(){
//        System.out.println(empService.listEmpDept());
        return ResultVO.success(empService.listEmpDept());
    }
    @RequestMapping(value = "/addemp")
    @ResponseBody
    @CrossOrigin  //开放跨域
    public ResultVO addemp(Emp emp){
        empService.savaEmp(emp);
        return ResultVO.success();
    }
}
