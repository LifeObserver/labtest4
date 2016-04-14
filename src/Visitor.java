public interface Visitor {

	void visitCorporation(Corporation corporation);

	void visitInventory(Inventory inventory);

	void visitItem(Item item);

}
