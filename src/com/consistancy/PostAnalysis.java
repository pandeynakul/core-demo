package com.consistancy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PostAnalysis {
    public static void main(String[] args) {
        List<Post> post = Arrays.asList(new Post(1, 50, "post 1 by user 1"),
                new Post(2, 30, "post 1 by iser 2"),
                new Post(1, 20, "post 2 by iser 1"),
                new Post(3, 70, "post 1 by iser 3"),
                new Post(2, 10, "post 2 by iser 2"),
                new Post(3, 100, "post 2 by iser 3"));

        //tweet > 50
        //perform the summation of the all user tweet/like and then print likes/tweet
        Map<Integer, Integer> result = post.stream().collect(Collectors.groupingBy(Post::getUserID,
                Collectors.summingInt(Post::getLikes)));
        List<Map.Entry<Integer, Integer>> entry = result.entrySet().stream().
                filter(e -> e.getValue() > 50).collect(Collectors.toList());
        entry.forEach((k)->{
            System.out.println("UserID "+k.getKey()+" "+ k.getValue());
        });

    }
}
