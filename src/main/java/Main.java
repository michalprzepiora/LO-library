import repository.BookRepository;
import repository.InFileRepository;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        List<Book> list = new ArrayList<>();
//        list.add(new Book(89,"Java","r martin", 123,false));
//        list.add(new Book(11,"C++","xxx", 111,false));
//
        BookRepository inFileRepo = new InFileRepository();
////
//        inFileRepo.add(list);

        System.out.println(inFileRepo.getAll());
        System.out.println("----------------------------------");
        inFileRepo.remove(89);
        System.out.println(inFileRepo.getAll());





    } // end of main



}
