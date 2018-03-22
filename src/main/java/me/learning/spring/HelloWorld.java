package me.learning.spring;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("your message is "+ message);
    }

    public void init(){
        System.out.println("... Init ...");
    }

    public void destory(){
        System.out.println("... Destory ...");
    }
}
