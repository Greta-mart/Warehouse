package service;

import dao.ContactRepository;
import dao.ItemRepository;
import dao.OwnerRepository;
import dao.impl.ContactRepositoryImpl;
import dao.impl.ItemRepositoryImpl;
import dao.impl.OwnerRepositoryImpl;

public class Factory {
    private static Factory instance = null;
    private static ItemRepository itemRepository = null;
    private static OwnerRepository ownerRepository = null;
    private static ContactRepository contactRepository = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public ItemRepository getItemRepository() {
        if (itemRepository == null) {
            itemRepository = new ItemRepositoryImpl();
        }
        return itemRepository;
    }

    public OwnerRepository getOwnerRepository() {
        if (ownerRepository == null) {
            ownerRepository = new OwnerRepositoryImpl();
        }
        return ownerRepository;
    }

    public ContactRepository getContactRepository(){
        if (contactRepository == null) {
            contactRepository = new ContactRepositoryImpl();
        }
        return contactRepository;
    }
}