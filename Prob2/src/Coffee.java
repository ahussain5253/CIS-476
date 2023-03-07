public abstract class Coffee {
    protected static Coffee instance;
    String Type;
    String Size;
    String Extras;

    public void show() {
        System.out.println("Type: " + Type);
        System.out.println("Size: " + Size);
        System.out.println("Extras: " + Extras);
    }
}
