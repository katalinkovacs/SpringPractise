package pizza;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {

    public static void main(String ... args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaPackageConfig.class);

        // gets CD player from context
        // in CD player there is an autowired which means that spring automatically inject  a CD object from there
        // which CD ? becuase we have 2 FF and SB -- SB is marked Primary otherwise spring would not know which one to
        //inject
        Pizza pizza = context.getBean(Pizza.class);

        System.out.print(pizza.put());




    }
}
