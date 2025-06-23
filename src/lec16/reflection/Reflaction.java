package lec16.reflection;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionDemo {

    public String noSecret = "인비밀";

    private String secret = "비밀입니다.";

    public ReflectionDemo() {
        System.out.println("ReflectionDemo 생성자 실행");
    }

    public String greet(String name) {
        return "Hello, " + name;
    }

    private String reveal(String code) {
        return "Access granted to:"  + code;
    }

}

public class Reflaction {
    public static void main(String[] args) {
        Class<?> clazz = ReflectionDemo.class; //객체를 리플렉션 형태로 가져온것

        System.out.println("클래스 이름: " + clazz.getName());


        System.out.println("\n[필드목록]");
        Field[] fileds = clazz.getDeclaredFields();  //getDeclare () 불러온다
        for (Field field : fileds) {
            System.out.println("필드:" + field.getName());
        }

        System.out.println("\n[메서드 목록]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("메서드:" + method.getName());
            for (Class<?> paramType : method.getParameterTypes()) {
                System.out.println("파라미터 타입:" + paramType.getSimpleName());
            }
        }


        try {
            Object instance = clazz.getDeclaredConstructor().newInstance();

            Method greetMethod = clazz.getMethod("greet", String.class); //메소드 가져오기
            Object greetResult = greetMethod.invoke(instance,"ssh");  //메소드 불러오기
            System.out.println("\n [퍼블릭 메서드 실행 결과]");
            System.out.println("greet(): " + greetResult);

            Method revealMethod = clazz.getMethod("reveal", String.class);
            revealMethod.setAccessible(true);
            Object revealResult = revealMethod.invoke(instance, "abcd");
            System.out.println("\n [프라이빗 메서드 실행 결과]");
            System.out.println("reveal(): " + revealResult);  //private 필드 접근

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
