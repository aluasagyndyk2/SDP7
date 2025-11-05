// The Subject interface — represents the streamer or event source
public interface Subject {
    // Adds an observer (subscriber)
    void attach(Observer o);
    // Removes an observer (unsubscribe)
    void detach(Observer o);
    // Sends a message to all subscribed observers
    void notifyAllObservers(String message);
}
