package behavioral.observer.main;

import behavioral.observer.ConcreteMagazine;
import behavioral.observer.ConcreteMagazineSubscriber;

public class Main {
    public static void main(String[] args) {
        ConcreteMagazine magazine = new ConcreteMagazine();

        ConcreteMagazineSubscriber magazineSubscriber1 = new ConcreteMagazineSubscriber(magazine);
        magazineSubscriber1.setName("Mark Knopfler");
        ConcreteMagazineSubscriber magazineSubscriber2 = new ConcreteMagazineSubscriber(magazine);
        magazineSubscriber2.setName("B.B. King");

        magazine.attach(magazineSubscriber1);
        magazine.attach(magazineSubscriber2);

        magazine.setState("Revista 1");

        magazine.detach(magazineSubscriber2);

        magazine.setState("Revista 2");
    }
}
