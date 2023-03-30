// Demo
public class DiscManager {
    public static void main(String[] args) {
        Disc disc1 = new Disc("The Shawshank Redemption");
        Disc disc2 = new Disc("The Dark Knight");
        Disc disc3 = new Disc("Inception");

        disc1.rent();
        disc2.rent();
        disc1.returnDisc();
        disc3.rent();
        disc2.returnDisc();
        disc3.returnDisc();
    }
}