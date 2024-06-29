package com.yuvraj.FanFollowingQuizApp.Service;

import com.yuvraj.FanFollowingQuizApp.DAO.QuizDAO;
import com.yuvraj.FanFollowingQuizApp.Model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService
{
    @Autowired
    QuizDAO quizDAO;
    public ResponseEntity<List<Question>> getQuestion()
    {
        return new ResponseEntity<>(quizDAO.findAll(), HttpStatus.OK);
    }
}
