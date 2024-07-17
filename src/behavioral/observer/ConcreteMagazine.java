package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMagazine implements Magazine {
    private String state;
    private List<MagazineSubscriber> observers = new ArrayList<>();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void attach(MagazineSubscriber observer) {
        observers.add(observer);
    }

    @Override
    public void detach(MagazineSubscriber observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (MagazineSubscriber observer : observers) {
            observer.update(observer.getName());
        }
    }
}
