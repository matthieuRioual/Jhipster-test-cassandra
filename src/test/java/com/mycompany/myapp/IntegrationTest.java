package com.mycompany.myapp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterCassandraSampleApplicationApp.class })
@Target(ElementType.TYPE)
public @interface IntegrationTest {
  public String[] properties() default {};
}
