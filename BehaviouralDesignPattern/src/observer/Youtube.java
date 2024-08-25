package observer;

public class Youtube {
    public static void main(String[] args) {

        Channel channel = new Channel();

        Subscriber s1 = new Subscriber("a");
        Subscriber s2 = new Subscriber("b");
        Subscriber s3 = new Subscriber("c");
        Subscriber s4 = new Subscriber("d");
        Subscriber s5 = new Subscriber("e");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);
        channel.subscribe(s5);


        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        s4.subscribeChannel(channel);
        s5.subscribeChannel(channel);



        channel.upload("Design Patterns");

    }
}
