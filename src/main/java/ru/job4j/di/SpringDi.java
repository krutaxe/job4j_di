package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDi {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(StartUI.class);
        context.register(ConsoleInput.class);
        context.refresh();

        StartUI ui = context.getBean(StartUI.class);
        ConsoleInput consoleInput = new ConsoleInput();
        ui.add("Petr Arsentev");
        ui.add(consoleInput.askStr("You name?"));
        ui.print();
    }
}
