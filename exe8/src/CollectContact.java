import java.util.ArrayList;
class CollectContacts {
    static ArrayList<Contact> collectionBook = new ArrayList<>();

    static void addContact(Contact a) {
        collectionBook.add(a);
    }

    static void contactBook() {
        for (Contact b : collectionBook) {
            b.display();
        }
    }
}