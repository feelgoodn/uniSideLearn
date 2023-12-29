package com.uniSideLearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comments
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int commentId;
	String comment;
	public Comments() {
		super();
		
	}
	public Comments(int commentId, String comment) {
		super();
		this.commentId = commentId;
		this.comment = comment;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
