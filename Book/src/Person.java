abstract  class Person  {
    public String name;  //姓名
    public String sex;  //性别
    public int age;   // 年龄

    public static Book[] books = new Book[]{  //默认定义书籍

            new Book("西游记","吴承恩",10,"名著",true),
            new Book("红楼梦","曹雪芹",20,"名著",true),
            new Book("三国演义","罗贯中",15,"名著",true),
            new Book("小茗同学","小明",5,"杂志",true),
            new Book()

    };

    public Person(String name,String sex,int age) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    //get，set方法。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void operate();//抽象类中的抽象方法

}
