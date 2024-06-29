package com.yuvraj.FanFollowingQuizApp.DAO;

import com.yuvraj.FanFollowingQuizApp.Model.Question;
import com.yuvraj.FanFollowingQuizApp.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDAO extends JpaRepository<Question,Integer>
{
}
