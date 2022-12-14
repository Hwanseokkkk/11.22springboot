package kr.kwangan2.springbootboard.board.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Board {
	
	public Board() {}
	
	@Id
	@GeneratedValue
	private Long seq;
	
	private String title;
	
	@Column(updatable=false)
	private String writer;
	
	private String content;
	
	@Column(insertable=false, updatable=false, columnDefinition = "date default sysdate")
	private Date createDate;
	
	@Column(insertable=false, updatable=true, columnDefinition = "number default 0")
	private Long cnt;

}
