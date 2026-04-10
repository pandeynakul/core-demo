package com.consistancy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//calculate the review of bookID
//calculate the average rating of each book
//count the number of review
//filter out review with rating below a given threshold
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookReview {

    private String bookId;
    private double rating;
    private String comment;
}
