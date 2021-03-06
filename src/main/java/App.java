import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import dao.entity.Item;

import dao.entity.ProductOwner;
import org.hibernate.Session;
import service.Factory;

public class App {
        public static void main (String[] args)  {
            Session session = null;
            try {
                Collection<Item> items = Factory.getInstance().getItemRepository().getAllItems();
                Iterator<Item> itemIterator = items.iterator();
                System.out.println("List of product Items :");
                while (itemIterator.hasNext()) {
                    Item item = (Item) itemIterator.next();
                    System.out.println("Product owner number " + item.getId() +
                            ", Price is " + item.getPrice() +
                            ", Title is " + item.getTitle() +
                            ", Count is " + item.getCount() +
                            ", Storing Date is " + item.getStoringDate());
                    Long productOwners = item.getId();

                    /*Iterator<ProductOwner> productIterator = items.iterator();
                    while (productIterator.hasNext()) {
                        ProductOwner productOwner = (ProductOwner) productIterator.next();
                        System.out.println("    has " + productOwner.getFirstName() + ", id of this item is "
                                + productOwner.getLastName());
                        //Set<Item> providers = item.getTitle();
                        //Iterator<Item> providerIterator = providers.iterator();
                    }*/
                    System.out.println();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
        }
}
