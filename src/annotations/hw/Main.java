package annotations.hw;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
       SumCalculate sumCalculate = new SumCalculate();
        Class <?> cls = SumCalculate.class;
        Method [] method = cls.getDeclaredMethods();
        Annotation [] annotation = cls.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotation));

        for (Method meth: method) {
            if(meth.isAnnotationPresent(MethodAnnotations.class)){
                MethodAnnotations methodAnnotations = meth.getAnnotation(MethodAnnotations.class);
                try {
                    meth.invoke(sumCalculate, methodAnnotations.param1(), methodAnnotations.param2());
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
