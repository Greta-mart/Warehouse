package dao.entity;

import dao.CategorieTypes;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ItemsID")
    private Long id;

    @Column(name = "Title", nullable = false)
    private String title;

   // private List<CategorieTypes> categorieTypesList;
    private String categorieTypesList;

    public void setCategorieTypesList(String categorieTypesList) {
        this.categorieTypesList = categorieTypesList;
    }

    @Column(name = "Count", nullable = false)
    private int count;

    @Column(name = "Price", nullable = false)
    private double price;

    @Column(name = "StoringDate", nullable = false)
    private Date storingDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /*public List<CategorieTypes> getCategorieTypesList() {
        return categorieTypesList;
    }

    private void setCategorieTypesList(List<CategorieTypes> categorieTypesList) {
        this.categorieTypesList = categorieTypesList;
    }*/

    public int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public Date getStoringDate() {
        return storingDate;
    }

    private void setStoringDate(Date storingDate) {
        this.storingDate = storingDate;
    }

    @Override
    public String toString() {
        return "items{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", categorieTypesList=" + categorieTypesList +
                ", count=" + count +
                ", price=" + price +
                ", storingDate=" + storingDate +
                '}';
    }
}
