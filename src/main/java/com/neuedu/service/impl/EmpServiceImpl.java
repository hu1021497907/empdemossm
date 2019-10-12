package com.neuedu.service.impl;

import com.neuedu.entity.Emp;
import com.neuedu.mapper.EmpMapper;
import com.neuedu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> listEmp() {
        return empMapper.listEmp();
    }

    @Override
    public List<Emp> listEmpDept() {
        return empMapper.listEmpDept();
    }

    @Override
    public int savaEmp(Emp emp) {
        return empMapper.savaEmp(emp);
    }
}
