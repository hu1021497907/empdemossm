package com.neuedu.controller;

import com.neuedu.service.DeptService;
import com.neuedu.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/deptlist")
    @ResponseBody
    @CrossOrigin  //开放跨域
    public ResultVO deptlist(){
        return ResultVO.success(deptService.listDept());
    }

}
