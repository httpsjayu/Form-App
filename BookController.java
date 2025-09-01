package in.jay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.jay.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView loadForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("bookObj" , new Book());
		mav.setViewName("bookView");
		
		return mav;
		
		
	}
	
	@PostMapping("/book")
	public ModelAndView submitFormData(Book book) {
		
		System.out.println(book);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Book Saved Successfully");
		mav.setViewName("success");
		
		return mav;
		
	}

}
