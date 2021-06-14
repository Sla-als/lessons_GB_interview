package lesson05.dao;

import lesson05.model.Student;
import lesson05.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionFactoryImpl;

import java.util.List;

public class StudentDAO {


    public void save(Student student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

    public void update(Student student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();
    }

    public void delete(Student student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(student);
        tx1.commit();
        session.close();
    }

    public Student findStudentById(int id) {
        return SessionFactoryUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public List<Student> findAll(){
        List<Student> students = SessionFactoryUtil.getSessionFactory().openSession().createQuery("From Student").list();
    return students;
    }
}
