package pl.rapid.factorymethod;

public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHandlers();
        msg.encrypt();
        return msg;
    }

    public abstract Message createMessage();

}
