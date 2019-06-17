package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.Repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorController {

    AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping (value = "/authors",method = RequestMethod.GET)
    public String getAuthor(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "author";
    }
}
