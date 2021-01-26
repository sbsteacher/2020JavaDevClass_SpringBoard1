package com.koreait.sboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koreait.sboard.model.BoardEntity;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", service.selBoardList());
	}
	
	@GetMapping("/write")
	public void write(BoardEntity p) {
	}
	
	@PostMapping("/write")
	public String writeProc(BoardEntity p) {
		System.out.println("title : " + p.getTitle());
		System.out.println("ctnt : " + p.getCtnt());
		service.insBoard(p);
		
		return "redirect:/list";
	}
	
	@GetMapping("/detail")
	public void detail(BoardEntity p, Model model) {
		model.addAttribute("data", service.selBoard(p));
	}
	
	@GetMapping("/del")
	public String del(BoardEntity p) {
		service.delBoard(p);
		return "redirect:/list";
	}
	
	@GetMapping("/mod")
	public void mod(BoardEntity p, Model model) {
		model.addAttribute("data", service.selBoard(p));
	}
	
	@PostMapping("/mod")
	public String modProc(BoardEntity p) {
		System.out.println("i_board : " + p.getI_board());
		System.out.println("title : " + p.getTitle());
		System.out.println("ctnt : " + p.getCtnt());
		service.updBoard(p);
		
		return "redirect:/detail?i_board=" + p.getI_board();
	}
}










