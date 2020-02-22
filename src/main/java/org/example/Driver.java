package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Dao dao = applicationContext.getBean(Dao.class);
        Service service = applicationContext.getBean(Service.class);

        service.save();
//        dao.create();

    }
}
