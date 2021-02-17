import java.util.concurrent.atomic.LongAdder;

public class Main {

    public static void main(String[] args) {
        LongAdder rezultForEachStore = new LongAdder();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                Store store = new Store();
                for (Integer value : store.cashTransactions()) {
                    rezultForEachStore.add(value);
                }
            }).start();
        }

        System.out.println(rezultForEachStore.sum());
    }
}