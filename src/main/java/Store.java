import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    public List<Integer> cashTransactions() {
        List<Integer> cashTranzaction = new ArrayList<>();
        Random random = new Random();
        Random countTransaction = new Random();
        int quantityTransaction = 100;
        for (int i = 0; i < countTransaction.nextInt(quantityTransaction); i++) {
            int valueTransaction = 100000;
            cashTranzaction.add(random.nextInt(valueTransaction));
        }
        return cashTranzaction;
    }

}