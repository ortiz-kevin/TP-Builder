public class CoffeeOrder {
    private final String coffeeType;
    private final boolean withMilk;
    private final boolean withSugar;
    private final boolean withWhippedCream;

    private CoffeeOrder(Builder builder) {
        this.coffeeType = builder.coffeeType;
        this.withMilk = builder.withMilk;
        this.withSugar = builder.withSugar;
        this.withWhippedCream = builder.withWhippedCream;
    }

    public void displayOrderDetails() {
        System.out.println("Type de café : " + coffeeType);
        System.out.println("Avec lait : " + withMilk);
        System.out.println("Avec sucre : " + withSugar);
        System.out.println("Avec chantilly : " + withWhippedCream);
    }

    public static class Builder {
        private final String coffeeType;
        private boolean withMilk = false;
        private boolean withSugar = false;
        private boolean withWhippedCream = false;

        public Builder(String coffeeType) {
            this.coffeeType = coffeeType;
        }

        public Builder withMilk() {
            this.withMilk = true;
            return this;
        }

        public Builder withSugar() {
            this.withSugar = true;
            return this;
        }

        public Builder withWhippedCream() {
            this.withWhippedCream = true;
            return this;
        }

        public CoffeeOrder build() {
            return new CoffeeOrder(this);
        }
    }

    public static void main(String[] args) {
        // Création de commandes de café avec différentes configurations
        CoffeeOrder order1 = new CoffeeOrder.Builder("Latte").withMilk().withSugar().build();
        CoffeeOrder order2 = new CoffeeOrder.Builder("Espresso").withSugar().build();
        CoffeeOrder order3 = new CoffeeOrder.Builder("Cappuccino").withMilk().withWhippedCream().build();

        // Affichage des détails des commandes de café
        System.out.println("Commande 1 :");
        order1.displayOrderDetails();

        System.out.println("\nCommande 2 :");
        order2.displayOrderDetails();

        System.out.println("\nCommande 3 :");
        order3.displayOrderDetails();
    }
}
