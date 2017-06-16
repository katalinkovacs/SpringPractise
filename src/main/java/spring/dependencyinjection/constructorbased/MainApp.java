package spring.dependencyinjection.constructorbased;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Main started...........");

        ApplicationContext context = new ClassPathXmlApplicationContext("BeansConstructorDi.xml");

        System.out.println("context created...........");

        TextEditor textEditor = (TextEditor) context.getBean("texteditor");
        System.out.println("textEditor created...........");

        textEditor.spellCheck();
        System.out.println("Mi tortenik?!");
    }
}
