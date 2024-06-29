package com.yuvraj.FanFollowingQuizApp.Service;

import com.yuvraj.FanFollowingQuizApp.Model.Question;
import com.yuvraj.FanFollowingQuizApp.DAO.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService
{
    @Autowired
    QuestionDAO questionDAO;

    public ResponseEntity<List<Question>> getAllQuestion()
    {
        try {
            return new ResponseEntity<>(questionDAO.findAll(), HttpStatus.OK);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    };

    public ResponseEntity<List<Question>>getQuestionByCategory(String Category)
    {
        try {
            return new ResponseEntity<>(questionDAO.findBycategory(Category), HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String>addQuestion(Question question)
    {
        try {
            questionDAO.save(question);
            return new ResponseEntity<>("Successfully Added", HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Error...User is not added", HttpStatus.FAILED_DEPENDENCY);
    }
}
