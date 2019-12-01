package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> newNumList = numberList.stream()
                .filter(a -> a % 2 == 0).collect(Collectors.toList());
        return newNumList;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> newNumList = numberList.stream()
                .filter(a -> a >= 20).collect(Collectors.toList());
        return newNumList;
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> books = new ArrayList<>();
        titles.stream()
                .forEach(title -> books.add(new Book(title)));
        return books;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> books = new ArrayList<>();
        titles.stream()
                .filter(title -> title.startsWith("Gra"))
                .forEach(title -> books.add(new Book(title)));
        return books;
    }
}
