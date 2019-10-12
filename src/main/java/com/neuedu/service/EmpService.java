package com.neuedu.service;

import com.neuedu.entity.Emp;

import java.util.List;

public interface EmpService {


    List<Emp> listEmp();

    List<Emp>listEmpDept();

    int savaEmp(Emp emp);
}
