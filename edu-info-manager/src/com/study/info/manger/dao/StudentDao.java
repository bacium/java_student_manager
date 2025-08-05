package com.study.info.manger.dao;

import com.study.info.manger.domain.Student;

public class StudentDao {
    public static Student[]  students = new Student[5];
    public  boolean addStudent (Student student) {
        int index=-1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index=i;
                break;
            }
        }
        if(index==-1){
            return false;
        }else {
            students[index]=student;
            return true;
        }
    }

    public boolean fundAllStudent (String sid) {
        boolean flag=false;
        for (Student student : students) {
            if (student != null && student.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return  flag;
    }

    public Student[] getAllStudent () {
        return students;
    }

    public boolean deleteStudent (String sid) {
        boolean delFlag=false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getSid().equals(sid)) {
                students[i] = null;
                delFlag=true;
            }
        }
        return delFlag;
    }

    public boolean updateStudent (Student student) {
        boolean flag=false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getSid().equals(student.getSid())) {
                students[i]=student;
                flag=true;
            }
        }
        return flag;
    }
}
