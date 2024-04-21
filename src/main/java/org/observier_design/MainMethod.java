package org.observier_design;

public class MainMethod {
    public static void main(String[] args) {
        Channel ch = new Channel();
        Subscriber s1 = new Subscriber("AB");
        Subscriber s2 = new Subscriber("CD");
        Subscriber s3 = new Subscriber("EF");
        Subscriber s4 = new Subscriber("GH");

        ch.subscriber(s1);
        ch.subscriber(s2);
        ch.subscriber(s3);
        ch.subscriber(s4);

        s1.subscribeChannel(ch);
        s2.subscribeChannel(ch);
        s3.subscribeChannel(ch);
        s4.subscribeChannel(ch);

        ch.upload("Topic : ABCDEF");

    }
}
