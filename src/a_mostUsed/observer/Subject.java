package a_mostUsed.observer;


public interface Subject {
	public void registerObserver(Observer obs);
	public void deregisterObserver(Observer obs);
	public void notifyObservers();
}

