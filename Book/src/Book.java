class Book{
    private String name; //书名
    private String author; //作者
    public double price; //价格
    private String category; //分类
    private boolean state; //状态  true-未借出  false-已借出

    //通过构造函数给定书的属性
    public Book(String name,String author,double price,String category,boolean state){
        this.author = author;
        this.name = name;
        this.price = price;
        this.category = category;
        this.state = state;
    }

    public Book() {  //默认10本书
        this(10);
    }
    public Book(int i) {
        Person.books = new Book[i];
    }

    //属性的获取和设置
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}