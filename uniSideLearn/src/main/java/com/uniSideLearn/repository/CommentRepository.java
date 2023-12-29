package com.uniSideLearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniSideLearn.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer>
{
	

}
