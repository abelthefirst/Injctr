package houtbecke.rs.injctr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ ElementType.TYPE })
public @interface Image {
    int value() default -1;
}
