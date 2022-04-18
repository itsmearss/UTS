import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    List<Item> items;

    public Keranjang(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        System.out.format("+------------------------------------+%n");
        System.out.format("|             TOKOPEDIA              |%n");
        System.out.format("+------------------------+-----------+%n");
        System.out.format("|        Product         |   Price   |%n");
        System.out.format("+------------------------+-----------+%n");
        double amount = calculateTotal();
        for (Item item: items){
            System.out.format(item.getNama());
        }
        paymentMethod.pay((int) amount);
    }
}
