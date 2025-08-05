package com.study.info.manger.service;

import com.study.info.manger.dao.StudentDao;
import com.study.info.manger.domain.Student;

public class StudentService {
    StudentDao studentDao=new StudentDao();
    public  boolean addStudent (Student student) {
        return studentDao.addStudent(student);
    }

    public boolean sidExist (String sid) {
        return  studentDao.fundAllStudent(sid);
    }

    public Student[] fundAllStudent () {
        Student[] students=studentDao.getAllStudent();
        boolean isNull=false;
        for (Student student : students) {
            if (student != null) {
                isNull = true;
                break;
            }
        }
        if(isNull){
            return students;
        }else {
            return null;
        }
    }

    public boolean deleteStudent (String sid) {
        return studentDao.deleteStudent(sid);
    }

    public boolean updateStudent (Student student) {
        return studentDao.updateStudent(student);
    }
}
