package me.learning.spring;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainAPP {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext("//Users/wenchaofu/IdeaProjects/demo-springboot/src/main/resources/Bean.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        helloWorld.getMessage();
//        context.registerShutdownHook();  //有没有都一样

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}
