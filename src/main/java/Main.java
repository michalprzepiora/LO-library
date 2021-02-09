import repository.BookRepository;
import repository.InFileRepository;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


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
