package vijay.springframework.joke.jokesapp.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import vijay.springframework.joke.jokesapp.Service.*;

@Controller
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("jokes", jokesService.getJokes());
        return "chucknorris";
    }
}
