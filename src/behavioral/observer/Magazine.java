package behavioral.observer;

interface Magazine {
    void attach(MagazineSubscriber observer);
    void detach(MagazineSubscriber observer);
    void notifyObservers();
}
