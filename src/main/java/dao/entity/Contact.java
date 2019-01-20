package dao.entity;

import dao.ContactTypes;

import javax.persistence.*;

@Entity
@Table(name="Product_owner_contacts")
public class Contact {

    @ManyToOne
    @JoinColumn(name = "Product_ownerID")
    private long id;

    @Column(name = "Type", nullable = false)
    private ContactTypes type;

    @Column(name = "Value", nullable = false)
    private String data;

    public Contact(ContactTypes type, String data) {
        this.type = type;
        this.data = data;
    }

    public ContactTypes getType() {
        return type;
    }

    private void setType(ContactTypes type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    private void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", type=" + type +
                ", data='" + data + '\'' +
                '}';
    }
}
