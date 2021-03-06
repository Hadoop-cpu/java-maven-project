package com.opensourceteams.modules.common.gramar.集合.多种类型的数据2;

import java.util.*;

/**
 * 开发者:刘文  Email:372065525@qq.com
 * 16/3/7  下午2:36
 * 功能描述:
 */


class Student{

    private String name;
    private char sex;
    private int age;

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        return validNameAndAge(obj);

    }

    boolean validNameAndAge(Object obj){


        boolean nameB = false;
        boolean ageB = false;
        boolean sexB = false;

        if(obj == null){

            return false;

        }else if (this == obj){
            return true;
        }else{
            if(this.name == null){
                if(obj == null){
                    nameB = true;
                }else{
                    nameB = false;
                }
            }else{
                if(obj == null){
                    nameB = false;
                }else{

                    nameB = true;

                    if(obj.getClass() == this.getClass()){
                        ageB = ((Student)obj).age == this.age;
                    }else {
                        ageB = false;
                    }


                }
            }

            return nameB && ageB ;
        }

    }

    boolean validNameAndAgeAndSex(Object obj){


        boolean nameB = false;
        boolean ageB = false;
        boolean sexB = false;

        if(obj == null){

            return false;

        }else if (this == obj){
            return true;
        }else{
            if(this.name == null){
                if(obj == null){
                    nameB = true;
                }else{
                    nameB = false;
                }
            }else{
                if(obj == null){
                    nameB = false;
                }else{

                    nameB = true;

                    if(obj.getClass() == this.getClass()){
                        Student stuO = (Student)obj;
                        ageB = stuO.age == this.age;

                        //sex

                        sexB = this.sex == stuO.sex;
                    }else {
                        ageB = false;
                    }


                }
            }



            return nameB && ageB  && sexB;
        }

    }

}

public class Run {


    /**
     * 创建集合,存放String[tom,tomas,tomsLee]
     * 			存放Integer[100,200,300]
     * 			存放Student{name,sex,age,标准javabean}[tom,tomas,tomsLee]
     *
     */
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("tom");
        list.add("tomas");
        list.add("tomsLee");

        list.add(100);
        list.add(200);
        list.add(300);

        Student s1 = new Student("小明",'男',25);
        Student s2 = new Student("小红",'女',28);

        list.add(s1);
        list.add(s2);

        for(Object obj :list){
            if(obj instanceof String){
                System.out.println("字符串:" + obj);
            }else if(obj instanceof  Integer){
                System.out.println("整形:" +  obj);
            }else if(obj instanceof Student){
                Student stu = (Student)obj;
                System.out.println("姓名:" +  stu.getName()  + " 性别:"+ stu.getSex() + " 年龄:"+ stu.getAge());
            }
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);

        for(Student s: studentList){
            System.out.println(s.getName() + ":" +s.getSex()  +":" + s.getAge());
        }


        System.out.println("========LinkedList========");

        /**
         * 链表
         */

        Deque<String> dq = new LinkedList<String>();
        dq.add("tom");
        dq.add("tomasLee");
        dq.add("tomson");
        Iterator<String> itt = dq.iterator();
        while (itt.hasNext()){
            System.out.println(itt.next());
        }
        System.out.println(dq.getLast());

        List<Student> list3 = new ArrayList<Student>();

        for(int i=0;i<100;i++){
            Student s = new Student("tom" + i,'男',i);
            list3.add(s);
        }
        Student newObj = new Student("tom9",'男',9);

        System.out.println("判断两个对象相等");
        if(list3.contains(newObj)){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }


        System.out.println("两对象是否相等");

        Student newObj1 = new Student("tom9",'男',9);
        Student newObj2 = new Student("tom9",'男',9);
        System.out.println(newObj1==newObj2);
        System.out.println(newObj1.equals(newObj2));




    }
}
