package my.spring.annotation;

import java.lang.annotation.Documented;   
import java.lang.annotation.ElementType;   
import java.lang.annotation.Retention;   
import java.lang.annotation.RetentionPolicy;   
import java.lang.annotation.Target;   
//�Զ���ע���������
@Target({ElementType.METHOD})   
@Retention(RetentionPolicy.RUNTIME)   
@Documented 

public @interface LogAnnotation {   
//�Զ���ע������ԣ�default������Ĭ��ֵ
    String desc() default "��������Ϣ";   
}  