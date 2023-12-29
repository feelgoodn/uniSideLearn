package com.uniSideLearn.services;

import java.util.List;

import com.uniSideLearn.entity.Comments;

public interface CommentService 
{
	List<Comments> commentList();
	String addComment(Comments comment);
 
}

