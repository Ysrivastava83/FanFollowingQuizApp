package com.yuvraj.FanFollowingQuizApp.DAO;

import com.yuvraj.FanFollowingQuizApp.Model.Question;
import com.yuvraj.FanFollowingQuizApp.Model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDAO extends JpaRepository<Question,Integer>
{
    @Query("Select questiontitle from Question Q where Q.id=:id")
    String getQues(int id);
    @Query("Select option1 from Question Q where Q.id=:id")
    String getop1(int id);

    @Query("Select option2 from Question Q where Q.id=:id")
    String getop2(int id);
    @Query("Select option3 from Question Q where Q.id=:id")
    String getop3(int id);
    @Query("Select option4 from Question Q where Q.id=:id")
    String getop4(int id);
    @Query("Select answer from Question Q where Q.id=:id")
    String getans(int id);
}
