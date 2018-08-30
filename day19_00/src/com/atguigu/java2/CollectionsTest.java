package com.atguigu.java2;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {

    @Test
    public void test(){
       ArrayList list = new ArrayList();
       list.add("bbb");
       list.add("eee");
       list.add("aaa");
       list.add("ddd");
       list.add("ddd");
        System.out.println(list);
//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.sort(list);
       /* Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String str = (String)o1;
                    String str2 = (String)o2;
                    return -(str.compareTo(str2));
                }
                return 0;
            }
        });*/
//       Collections.swap(list,1,2);
//        Object max = Collections.max(list);
//        System.out.println(max);
//        int frequency = Collections.frequency(list,"ddd");
//        System.out.println(frequency);

        Collections.replaceAll(list,"ddd","aaa");
        System.out.println(list);

    }

    @Test
    public void test2(){

        ArrayList list = new ArrayList();
        List synchronizedList = Collections.synchronizedList(list);
        System.out.println(synchronizedList.getClass().getName());
        System.out.println(list.getClass().getName());
    }

    @Test
    public void test3(){
        Enumeration stringEnum = new StringTokenizer("a-b*c-d-e-g", "-");
        while(stringEnum.hasMoreElements()){
            Object obj = stringEnum.nextElement();
            System.out.println(obj);
        }
    }
}
