package spring.innerbeaninjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppSpellText {

    public static void main(String[] args) {

        System.out.println("MAIN started.");

        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBeans.xml");
        System.out.println("CONTEXT created.");

        TextEditor texteditor1 = (TextEditor) context.getBean("texteditor");
        System.out.println("texteditor1 created.");

        texteditor1.spellCheck();
    }
}
