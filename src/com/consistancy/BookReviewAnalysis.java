package com.consistancy;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//calculate the review of bookID
//calculate the average rating of each book
//count the number of review
//filter out review with rating below a given threshold
public class BookReviewAnalysis {

    public static void main(String[] args) {
        List<BookReview> bookReviews = Arrays.asList(
                new BookReview("book1", 4.5, "Great book"),
                new BookReview("book1", 3.8, "Good read"),
                new BookReview("book2", 2.5, "Not an favorite"),
                new BookReview("book2", 3.0, "was ok"),
                new BookReview("book3", 5.0, "Excellent"),
                new BookReview("book3", 4.8, "Amazing read"),
                new BookReview("book3", 4.2, "vry informative")
        );

        Map<String, List<BookReview>> reviewMap = bookReviews.stream().filter(r -> r.getRating() >= 3.0).
                collect(Collectors.groupingBy(BookReview::getBookId));
        //
        reviewMap.forEach((bookId,bookReviewList)->{

            int count =bookReviewList.size();
            Double avgRating = bookReviewList.stream().collect(Collectors.averagingDouble(BookReview::getRating));
            //print the
            System.out.println("BookId ::"+bookId+" average_rating ::  "+avgRating+" Number of review ::"+count);
        });

    }
}
