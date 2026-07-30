package mini.book.project;

class MiniBookProject 
{
     int bookID ;
     String title ;
     String author ;
     boolean isAvailable ; 
     
     MiniBookProject (){
         
         
     }
     
     MiniBookProject(int bookID,String title,String author,boolean isAvailable)
     {
         this.bookID = bookID;
         this.author = author;
         this.isAvailable = isAvailable;
         this.title = title;
     }
     
     void display()
     {
         System.out.println("THE BOOK ID ="+bookID);
         System.out.println("THE TITLE OF BOOK = "+title);
         System.out.println("THE AUTHOR OF BOOK = "+author);
         System.out.println("THE BOOK IS :"+isAvailable);
     }
     
     
     void borrowBook()
     {
         
     }
     
     
     void returnBook()
     {
     
     }

     
}
