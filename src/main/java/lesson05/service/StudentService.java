package lesson05.service;

import lesson05.dao.StudentDAO;
import lesson05.model.Student;
import lesson05.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentService {
    StudentDAO studentDAO = new StudentDAO();


    public Student findById(int id) {
        return studentDAO.findStudentById(id);
    }

    public void save(Student student) {
        studentDAO.save(student);
    }

    public void update(Student student) {
        studentDAO.update(student);
    }

    public void delete(Student student) {
        studentDAO.delete(student);
    }

    public List<Student> findAll() {
        return studentDAO.findAll();
    }

}

