package com.yuvraj.FanFollowingQuizApp.Controller;

import com.yuvraj.FanFollowingQuizApp.Model.Question;
import com.yuvraj.FanFollowingQuizApp.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController
{
    @Autowired
    QuizService quizService;
    @PostMapping("/create")
    public ResponseEntity<List<Question>> getQuestion(@RequestParam String title, @RequestParam int numQ, @RequestParam String category)
    {
        return quizService.getQuestion();
    }
}
