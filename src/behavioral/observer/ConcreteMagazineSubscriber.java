package behavioral.observer;

public class ConcreteMagazineSubscriber implements MagazineSubscriber {
	private String name;
    private String observerState;
    private ConcreteMagazine subject;

    
    public ConcreteMagazineSubscriber(ConcreteMagazine subject) {
        this.subject = subject;
    }

    @Override
    public void update(String name) {
        observerState = subject.getState();
        System.out.println(name + " foi notificado da chegada da revista: " + observerState);
    }


	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
