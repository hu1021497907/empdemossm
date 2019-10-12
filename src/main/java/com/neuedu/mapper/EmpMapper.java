package com.neuedu.mapper;

import com.neuedu.entity.Emp;

import java.util.List;

public interface EmpMapper {

    List<Emp> listEmp();

    List<Emp>listEmpDept();

    int savaEmp(Emp emp);
}
