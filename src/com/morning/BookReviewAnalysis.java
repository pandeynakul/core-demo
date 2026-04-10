package com.morning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/* Group Review by bookID
 filter out reviews with rating below a given threshold
 * Calculate the average rating for each book
 * count the number of review for each book
 *
 * */
public class BookReviewAnalysis {

    public static void main(String[] args) {
        List<BookRewiew> bookRewiews = Arrays.asList(new BookRewiew("book1", 4.5, "Great book"),
                new BookRewiew("book1", 3.8, "Good read"),
                new BookRewiew("book2", 2.5, "Not my feverite"),
                new BookRewiew("book2", 3.0, "its ok"),
                new BookRewiew("book3", 5.0, "Excellent"),
                new BookRewiew("book3", 4.8, "Amezing"),
                new BookRewiew("book3", 4.2, "very informative"));

        Map<String, List<BookRewiew>> mapBookReview = bookRewiews.stream().filter(r -> r.getRating() >= 3.0).
                collect(Collectors.groupingBy(BookRewiew::getBookID));

        //Calculate the average rating for each book
        mapBookReview.forEach((bookId, reviewList) -> {

            OptionalDouble average = reviewList.stream().mapToDouble(BookRewiew::getRating).average();
            long count = reviewList.size();
            System.out.println("BookId= " + bookId + " Average= " + average + " number of Review =" + count);
        });


    }
}
