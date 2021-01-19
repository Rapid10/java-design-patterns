package pl.rapid.factorymethod;

public class JsonMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
