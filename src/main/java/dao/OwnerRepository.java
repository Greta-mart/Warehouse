package dao;

import dao.entity.ProductOwner;

import java.sql.SQLException;
import java.util.Collection;

public interface OwnerRepository {
    public void addOwner(ProductOwner owner) throws SQLException, Exception;
    public void updateOwner(ProductOwner owner) throws SQLException, Exception;
    public ProductOwner getOwnersById(Long id) throws SQLException, Exception;
    public Collection<ProductOwner> getAllOwners() throws SQLException, Exception;
    public void deleteOwner(ProductOwner owner) throws SQLException, Exception;

}
