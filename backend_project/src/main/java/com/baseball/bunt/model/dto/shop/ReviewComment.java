package com.baseball.bunt.model.dto.shop;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Tag(name = "리뷰 댓글 DTO")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReviewComment {

	private int reviewCommentId;
	private int userId;
	private int boardId;
	private String content;
	private String regDate;
	private String modDate;
}
