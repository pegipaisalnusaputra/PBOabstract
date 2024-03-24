package bangaundatar;
public abstract class BangunDatar {
    Double luas;
    Double keliling;

    abstract double luas();
    abstract double keliling();

    public void printluas() {
        System.out.println("Luas: " + luas());
    }

    public void printKeliling() {
        System.out.println("Keliling: " + keliling());
    }
}