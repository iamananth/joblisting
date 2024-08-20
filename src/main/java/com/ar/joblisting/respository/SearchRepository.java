package com.ar.joblisting.respository;

import com.ar.joblisting.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository {

    List<Post> findByText(String text);
}
