package com.yuvraj.FanFollowingQuizApp.Controller;

import com.yuvraj.FanFollowingQuizApp.Model.Question;
import com.yuvraj.FanFollowingQuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    QuestionService questionService;


    @RequestMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestion()
    {

        return questionService.getAllQuestion();
    }


    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category)
    {
        return questionService.getQuestionByCategory(category);
    }


    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question)
    {

        return questionService.addQuestion(question);
    }


    @RequestMapping("/test")
    public String test()
    {

        return "Working";
    }
}
