package kz.learnjava.war;

public class Merchant implements Seller {
    public String sell(Goods goods) {
        String result = "";

        if (goods == Goods.HEALTH10) {
            result = "potion";
        }

        return result;
    }

    public String bought(int id) {
        String result = "";

        for (Merchant.Goods good : Merchant.Goods.values()) {
            if ( good.getId() == id) {
            }
        }

        return result;
    }

    public enum Goods {
        HEALTH25(1, 25, "Health potion +25 health"),
        HEALTH10(2, 10, "Health potion +10 health"),
        STRENGTH50(3, 24, "Dragon sword +25 strength"),
        DEXTERITY15(4, 15, "Gold amulet +5 dexterity");

        private final int id;
        private final int price;
        private final String name;

        private Goods(int id, int price, String name) {
            this.id = id;
            this.price = price;
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
