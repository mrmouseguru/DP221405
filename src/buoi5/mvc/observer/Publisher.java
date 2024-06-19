package buoi5.mvc.observer;

import java.util.LinkedList;
import java.util.List;

public class Publisher {
    //field
    private List<Subcriber> subcribers = new LinkedList<>();

    //method
    public void subcribe(Subcriber subcriber) {
        this.subcribers.add(subcriber);
    }

    public void unSubcribe(Subcriber subcriber) {
        this.subcribers.remove(subcriber);
    }

    public void notifySubcribers() {
        for (Subcriber subcriber : subcribers) {
            subcriber.update();
        }
    }

}
