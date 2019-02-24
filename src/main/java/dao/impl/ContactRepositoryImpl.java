package dao.impl;

import dao.ContactRepository;
import dao.entity.Contact;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository {

    private Session session;

    public ContactRepositoryImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    public void addContact(Contact contact) throws SQLException, Exception {
        session.beginTransaction();
        session.save(contact);
        session.getTransaction().commit();
    }

    public void updateContact(Contact contact) throws SQLException, Exception {
        session.beginTransaction();
        session.update(contact);
        session.getTransaction().commit();
    }

    public Contact getContactById(Long id) throws SQLException, Exception {
        Contact contact = null;
        contact = (Contact) session.load(Contact.class, id);
        return contact;
    }

    public Collection<Contact> getAllContacts() throws SQLException, Exception {
        List<Contact> contacts = new ArrayList<Contact>();
        contacts = session.createCriteria(Contact.class).list();
        return contacts;
    }

    public void deleteContact(Contact contact) throws SQLException, Exception {
        session.beginTransaction();
        session.delete(contact);
        session.getTransaction().commit();
    }
}
