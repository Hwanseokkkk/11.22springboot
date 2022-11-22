package kr.kwangan2.springbootboard.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.kwangan2.springbootboard.board.entity.Board;
import kr.kwangan2.springbootboard.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/listBoard")
	public String listBoard(Model model, Board board) {
		List<Board> boardList = boardService.listBoard(board);
		model.addAttribute("boardList",boardList);
		return "/board/listBoard";
	}
	
	@GetMapping("/insertBoard")
	public String insertBoard() {
		return "/board/insertBoard";
	}
	
	@PostMapping("/insertBoardProc")
	public String insertBoardProc(Board board) {
		boardService.insertBoard(board);
		return "redirect:/board/listBoard";
	}
	
	@GetMapping("/getBoard")
	public String getBoard(Board board, Model model, String action) {
			model.addAttribute("board", boardService.getBoard(board,action));
		return "/board/getBoard";
	}
	
	@PostMapping("/updateBoardProc")
	public String updateBoardProc(Board board) {
		boardService.updateBoard(board);
		return "redirect:/board/listBoard";
	}
	 
	@GetMapping("/deleteBoard")
	public String deleteBoard(Board board) {
		boardService.deleteBoard(board);
		return "redirect:/board/listBoard";
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("greeting","Hello Thymeleaf !!!!!!!!!!");
		return "/board/hello";
		
	}
}
