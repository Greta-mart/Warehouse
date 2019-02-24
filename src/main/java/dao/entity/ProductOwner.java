package dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Product_owner")
public class ProductOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Product_ownerID")
    private Long id;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "Lastname", nullable = false)
    private String lastName;

    @Column(name = "CompaneName", nullable = false)
    //private List<Contact> contactList;
    private String contactList;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*public List<Contact> getContactList() {
        return contactList;
    }

    private void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }*/


    public String getContactList() {
        return contactList;
    }

    public void setContactList(String contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "ProductOwner{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}