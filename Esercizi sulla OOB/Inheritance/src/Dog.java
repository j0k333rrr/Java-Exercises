public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString(); // questo richiama anche le specifiche della superclasse
    }

    public void makeNoise() {

        if (type == "Wolf") {
            System.out.print("Ow Wooooo!");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, run and wag their tail");

        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        // possiamo definire questo metodo private
        // siccome il metodo viene usato solo all'interno di questa classe

        System.out.print("Woof! ");
    }

    private void run() {
        // possiamo definire questo metodo private
        // siccome il metodo viene usato solo all'interno di questa classe

        System.out.print("Dog Running ");
    }

    private void walk() {
        // possiamo definire questo metodo private
        // siccome il metodo viene usato solo all'interno di questa classe

        System.out.print("Dog Walking ");
    }

    private void wagTail() {
        // possiamo definire questo metodo private
        // siccome il metodo viene usato solo all'interno di questa classe

        System.out.print("Tail Wagging ");
    }
}
