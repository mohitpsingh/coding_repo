package org.observier_design;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<Subscriber> subscriberList = new ArrayList<>();
    String title;

    public void subscriber(Subscriber sub) {
        subscriberList.add(sub);
    }

    public void upSubscribe(Subscriber sub) {
        subscriberList.remove(sub);
    }

    public void notifySub() {
        for (Subscriber s : subscriberList) {
            s.update();
        }
    }

    public void upload(String name) {
        this.title = title;
        notifySub();
    }
}
