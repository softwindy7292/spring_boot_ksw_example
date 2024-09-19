package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.page.PageVO;
import edu.ict.ex.service.EmpService;
import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		log.info("list()..");
		
		model.addAttribute("empList", empService.empList());
		
		return "emp/list";
	}
	
	@GetMapping("/list2")
	public String list2(Criteria criteria, Model model) {
		
		log.info("list2()..");
		
		model.addAttribute("empList", empService.getListWithPaging(criteria));
		int total = empService.getTotal();
		
		PageVO vo = new PageVO(criteria, total);
		
		model.addAttribute("pageMaker", vo);
		
		System.out.println(vo);
		
		
		return "emp/list2";
	}
	
	@GetMapping("/join_view")
	public String join_view(Model model) {
		
		log.info("join_view()..");
		
		model.addAttribute("empList", empService.empList());
		model.addAttribute("deptList", empService.deptList());
		
		return "emp/join_view";
	}
	
	@PostMapping("/join")
	public String join(EmpVO empVO) {
		
		log.info("join()..");
		
		empService.join(empVO);
				
		return "redirect:/emp/list";
	}
	
}
