package dao.impl;

import dao.OwnerRepository;
import dao.entity.ProductOwner;
import org.hibernate.Session;
import util.HibernateUtil;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OwnerRepositoryImpl implements OwnerRepository {
    private Session session;

    public OwnerRepositoryImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void addOwner(ProductOwner productOwner) throws SQLException, Exception {
        session.beginTransaction();
        session.save(productOwner);
        session.getTransaction().commit();
    }

    public void updateOwner(ProductOwner productOwner) throws SQLException, Exception {
        session.beginTransaction();
        session.update(productOwner);
        session.getTransaction().commit();
    }

    public ProductOwner getOwnersById(Long id) throws SQLException, Exception {
        ProductOwner productOwner = null;
        productOwner = (ProductOwner) session.load(ProductOwner.class, id);
        return productOwner;
    }

    public Collection<ProductOwner> getAllOwners() throws SQLException, Exception {
        List<ProductOwner> providers = new ArrayList<ProductOwner>();
        providers = session.createCriteria(ProductOwner.class).list();
        return providers;
    }

    public void deleteOwner(ProductOwner productOwner) throws SQLException, Exception {
        session.beginTransaction();
        session.delete(productOwner);
        session.getTransaction().commit();
    }
}
