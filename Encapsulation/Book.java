public class Book {
    private String name;// for security we must choose "private".
    private int pageNumber;

    public Book(String name, int pageNumber){
        this.name=name;
        if(pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber=pageNumber;
    }
    public int showPageNumber(){
        return this.pageNumber;
    }
    public void changePageNumber(int pageNumber){
        if(pageNumber<0){
            pageNumber= 0;
        }
        this.pageNumber=pageNumber;
    }
    public String showName(){ //***getName, (getter setter methods)
        return this.name;
    }
    public void changeName(String name){ //***setName, they are all the same.
        this.name=name;

    }
    
}
