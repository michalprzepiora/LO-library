package service;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InFileActions {
    private final static String fileName = "books.bin";

    void saveToFile(List<Book> books) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Book book : books) {
            objectOutputStream.writeObject(book);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    List<Book> loadFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Book> result = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                result.add((Book) objectInputStream.readObject());
            }
        objectInputStream.close();
        return result;
    }

}
