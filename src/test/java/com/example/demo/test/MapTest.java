package com.example.demo.test;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class MapTest {

    @Test
    public void keySet(){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"red");
        map.put(2,"yellow");
        map.put(3,"blue");
        map.put(4,"green");
        map.put(5,"purple");
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Object id = iterator.next();
            System.out.println(map.get(id)+","+id);
        }


    }

    @Test
    public void entrySet(){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"red");
        map.put(2,"yellow");
        map.put(3,"blue");
        map.put(4,"green");
        map.put(5,"purple");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
