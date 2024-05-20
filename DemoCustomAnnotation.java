import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented // for documention
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
    // String os();
    // int version();

    String os() default "Ms";
    int version() default 1;
}


@SmartPhone (os="android",version=6)
class Nokia{
    String model;
    int size;
    public Nokia(String model, int size) {
        this.model = model;
        this.size = size;
    }


}

// class NokiaASeries extends Nokia{
//     String model;
//     int size;
   

// }





public class DemoCustomAnnotation {
    public static void main(String[] args) {
        Nokia n=new Nokia("Fire",10);

        //refelction api -used to values or features of objects
        Class c=n.getClass();
        Annotation an=c.getAnnotation(SmartPhone.class);
        SmartPhone sp=(SmartPhone)an;
        System.out.println(sp.os());
        System.out.println(sp.version());
    
    }
}
