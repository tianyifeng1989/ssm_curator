package my.spring.annotation;

import java.lang.annotation.Documented;   
import java.lang.annotation.ElementType;   
import java.lang.annotation.Retention;   
import java.lang.annotation.RetentionPolicy;   
import java.lang.annotation.Target;   
//自定义注解相关设置
@Target({ElementType.METHOD})   
@Retention(RetentionPolicy.RUNTIME)   
@Documented 

public @interface LogAnnotation {   
//自定义注解的属性，default是设置默认值
    String desc() default "无描述信息";   
}  