public class PrintVisitor implements Visitor {

	@Override
	public void visitCorporation(Corporation corporation) {
		System.out.println("Corporation");
		for (Inventory inventory : corporation) {
			inventory.accept(this);
		}
	}

	@Override
	public void visitInventory(Inventory inventory) {
		System.out.println(" Inventory[name=" + inventory.getName() + "]");
		for (Item item : inventory) {
			item.accept(this);
			System.out.println(": amount=" + inventory.available(item));
		}
	}

	@Override
	public void visitItem(Item item) {
		System.out.print("  Item[name=" + item.getName() + "]");
	}

}
