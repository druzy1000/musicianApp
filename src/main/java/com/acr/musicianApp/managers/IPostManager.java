package com.acr.musicianApp.managers;

import java.util.List;

import com.acr.musicianApp.domains.Post;

public interface IPostManager {
	
	List<Post> getAllPosts ();
	Post getPostById (Long postId);
	List<Post> getPostsByAuthor (String author);
	Post createPost (Post post);
	Post updatePost (Long postId, Post post);
	Post deletePost (Long postId);

}
