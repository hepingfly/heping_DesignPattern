package com.hepingfly.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenheping on 2019/9/4.
 */
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

// 学校总部员工类
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
// 学院的员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    // 返回学院总部员工
    public List<CollegeEmployee> getAllCollegeEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("员工id" + i);
            list.add(employee);
        }
        return list;
    }
}

/**
 * SchoolManager 的直接朋友有：Employee   CollegeManager
 * CollegeEmployee 不是直接朋友，而是一个陌生类，违背了迪米特法则
 */
class SchoolManager {
    // 返回学校总部员工
    public List<Employee> getAllCollegeEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("员工id" + i);
            list.add(employee);
        }
        return list;
    }

    public void printAllEmployee(CollegeManager collegeManager) {
        /*
           这里的 CollegeEmployee 不是 SchoolManager 的直接朋友
           而是以局部变量的方式，出现在 SchoolManager 中
           这样就违反了迪米特法则
         */
        List<CollegeEmployee> list1 = collegeManager.getAllCollegeEmployee();
        System.out.println("---------学院员工-------");
        for (CollegeEmployee ce : list1) {
            System.out.println(ce.getId());
        }

        System.out.println("---------学校员工-------");
        List<Employee> list2 = this.getAllCollegeEmployee();
        for (Employee emp :list2) {
            System.out.println(emp.getId());
        }

    }
}
