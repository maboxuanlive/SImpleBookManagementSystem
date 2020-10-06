import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Root extends Person implements operate {  //继承了人的类，需要重写它的抽象方法operate，实现了operate接口，需要重写接口内的方法

    private String Rname;
    private String Rsex;
    private int Rage;

    public Root(String name, String sex, int age) {
        super(name, sex, age);//调用人基类的构造函数
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void operate() {   //管理员的操作
        System.out.print("请输入确认操作:");
        int i = sc.nextInt();
        switch (i) {
            case 1://整理   
                sort(books);
                break;
            case 2://查
                select(books);
                break;
            case 3://加
                add(books);
                break;
            case 4://删
                delete(books);
                break;
            case 5://列表
                list(books);
                break;
            default:
                System.out.println("输入有误！");
                break;

        }
    }
    //compareable整理，重写compare to，如果数组中有空的，则会出现空指针异常，把不空的拷到另一个新的数组，然后实现
    public void sort(Book[] books) {
        System.out.println("图书馆中的书按价格整理如下:");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o1.getPrice()-o2.getPrice());
            }
        });

        for (int i = 0; i < books.length; i++) {  //遍历数组打印书的列表
            System.out.println(books[i].getName() + "   " + books[i].getAuthor() + "   " + books[i].getPrice() + "   " + books[i].getCategory() + "   " + books[i].isState());
        }
        System.out.println("整理结束！");


    }

    @Override
    public void select(Book[] books) {
        System.out.println("请输入书名进行查询：");
        String name = sc.next();
        if(name != null) {

            for (int i = 0; i < books.length; i++) {
                if (books[i].getName().equals(name)) {
                    System.out.println("有此书籍！");
                    System.out.println("书籍信息为：（书名-作者-价格-分类-状态）");
                    System.out.println(books[i].getName() + "   "+books[i].getAuthor() + "   "+books[i].getPrice() + "   "+books[i].getCategory() + "   "+books[i].isState());
                    break;
                }
                System.out.println("暂时没有此书！");
                break;
            }
        }
    }

    @Override
    public void delete(Book[] books) {
        System.out.println("请输入要删除的书名:");
        String str = sc.next();
        if(str != null) {
            for(int i = 0;i<books.length;i++) {
                if(books[i].getName().equals(str)) {
                    books[i] = null;
                    System.out.println("删除成功！");
                    break;
                }
            }
        }
    }

    @Override
    public void add(Book[] books) {
        System.out.println("请输入书名：");
        String name = sc.next();
        System.out.println("请输入作者：");
        String author = sc.next();
        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        System.out.println("请输入分类：");
        String category = sc.next();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName() == null) {
                books[i].setName(name);
                books[i].setAuthor(author);
                books[i].setPrice(price);
                books[i].setCategory(category);
                books[i].setState(true);
                System.out.println("添加成功");
                break;
            }
        }
    }

    @Override
    public void list (Book[]books){
        System.out.println("图书列表如下：（书名-作者-价格-分类-状态）");  //打印Book数组
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getName() + "   " + books[i].getAuthor() + "   " + books[i].getPrice() + "   " + books[i].getCategory() + "   " + books[i].isState());
            }
        }
    }
}