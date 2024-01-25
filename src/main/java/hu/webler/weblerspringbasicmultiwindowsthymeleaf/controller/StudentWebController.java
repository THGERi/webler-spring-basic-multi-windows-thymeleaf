package hu.webler.weblerspringbasicmultiwindowsthymeleaf.controller;

import hu.webler.weblerspringbasicmultiwindowsthymeleaf.bootstrap.DataInitializer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class StudentWebController {

    private final DataInitializer dataInitializer;

    @GetMapping({"/", "", "/home", "/index", "index.html"})
    public String home() {
        return "index";
    }

    @GetMapping("/students")
    public String renderAllStudentsOnWeb(Model model) {
        model.addAttribute("students", dataInitializer.getStudents());
        return "students";
    }
}
