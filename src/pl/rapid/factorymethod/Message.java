package pl.rapid.factorymethod;

public abstract class Message {

    public abstract String getMessage();

    public void addDefaultHandlers() {};

    public void encrypt() {};
}
