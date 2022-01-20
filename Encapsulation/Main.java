public class Main{
    public static void main(String[] args) {
        Book harryPotter=new Book("Harry Potter",150);
        Book lordofTheRings=new Book("Lord Of the Ring",-156);
        //lordofTheRings.pageNumber=-1000; if we set private, we solve this problem. in this time we can not print directly.
        //System.out.println(lordofTheRings.pageNumber);
        lordofTheRings.changeName("ABC");//set
        System.out.println(lordofTheRings.showName());//get
        System.out.println(lordofTheRings.showPageNumber());//get
        
    }
}