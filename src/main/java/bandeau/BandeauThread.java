package bandeau;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BandeauThread extends Bandeau {
    
    private final Lock verrou = new ReentrantLock();
    
    public void verrouiller() {
        verrou.lock();
    }

    public void deverrouiller() {
        verrou.unlock();
    }
}
