package com.acr.musicianApp.accessors;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acr.musicianApp.domains.Post;

public interface IPostAccessor extends JpaRepository<Post, Long> {

    List<Post> findAllByAuthor(String author);
    
}
