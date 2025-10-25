package QuizApp.project.service;

import QuizApp.project.entity.Question;
import QuizApp.project.repo.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizRepo quizRepo;
    public List<Question> getAllQuestion(){
        List<Question>allQuestion=quizRepo.findAll();
        return allQuestion;
    }
    public List<Question> saveQuestions(List<Question> questions) {
        return quizRepo.saveAll(questions);
    }
}
