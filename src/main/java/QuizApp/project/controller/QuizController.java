package QuizApp.project.controller;

import QuizApp.project.entity.Question;
import QuizApp.project.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:3000")
@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizService service;

    @GetMapping("/question")
    public List<Question> getQuestion() {
        return service.getAllQuestion();
    }

    @PostMapping("/saveQuestions")
    public ResponseEntity<List<Question>> saveQuestions(@RequestBody List<Question> questions) {
        List<Question> savedQuestions = service.saveQuestions(questions);
        return ResponseEntity.ok(savedQuestions);
    }
}
