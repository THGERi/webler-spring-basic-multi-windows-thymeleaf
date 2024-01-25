package hu.webler.weblerspringbasicmultiwindowsthymeleaf.controller;

import hu.webler.weblerspringbasicmultiwindowsthymeleaf.bootstrap.DataInitializer;
import hu.webler.weblerspringbasicmultiwindowsthymeleaf.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StudentController {

    private final DataInitializer dataInitializer;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return dataInitializer.getStudents();
    }
}
