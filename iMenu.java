import java.util.Iterator;

/**
 * iMenu
 */
interface iMenu {

    Iterator<MenuItem> createIterator();

    void addItem(MenuItem menuItem);

    MenuItem getItem(String item);
    
}