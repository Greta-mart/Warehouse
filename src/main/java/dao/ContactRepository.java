package dao;

import dao.entity.Contact;

import java.sql.SQLException;
import java.util.Collection;

public interface ContactRepository {
    public void addContact(Contact contact) throws SQLException, Exception;
    public void updateContact(Contact contact) throws SQLException, Exception;
    public Contact getContactById(Long id) throws SQLException, Exception;
    public Collection<Contact> getAllContacts() throws SQLException, Exception;
    public void deleteContact(Contact contact) throws SQLException, Exception;
}
