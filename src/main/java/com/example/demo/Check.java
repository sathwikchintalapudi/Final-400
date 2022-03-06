package com.example.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Check {

    public static void main(String[] args) {
        Check check = new Check();
        try {
            check.getOne();
        }
        catch (Exception exp) {
            System.out.println("Sathwik - Exception occurred");
        }

        Map<String,String> details = new HashMap<>();

        List<Character> name = new ArrayList<>();
        name.add('A');
        name.add('B');
        name.add('C');
        System.out.println(name.toString());
    }

    private void getOne() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> combinationalSumClassName = Class.forName("com.example.demo.CombinationalSum");
        CombinationalSum combinationalSum2 = (CombinationalSum) combinationalSumClassName.newInstance();
        Method method = combinationalSum2.getClass().getMethod("getName");
        method.invoke(combinationalSum2);
    }

}
