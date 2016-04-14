public class MyThread extends Thread {

	private final Inventory aInventory;
	private final Item aItem;

	public MyThread(Inventory pInventory, Item pItem) {
		aInventory = pInventory;
		aItem = pItem;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			aInventory.stock(aItem, 1);
		}
	}

}
