package com.yuvraj.FanFollowingQuizApp.Controller;
import com.yuvraj.FanFollowingQuizApp.DAO.QuestionDAO;
import com.yuvraj.FanFollowingQuizApp.DAO.QuizDAO;
import com.yuvraj.FanFollowingQuizApp.DAO.TestDAO;
import com.yuvraj.FanFollowingQuizApp.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @Autowired
    TestDAO testDAO;
    @Autowired
    TestService testService;
    int i = 1;
    int ans;

    @RequestMapping("/test")
    public String test(Model m)
    {
        ans=0;
        i = 1;
        m.addAttribute("id", i);
        m.addAttribute("ques", testDAO.getQues(i));
        m.addAttribute("op1", testDAO.getop1(i));
        m.addAttribute("op2", testDAO.getop2(i));
        m.addAttribute("op3", testDAO.getop3(i));
        m.addAttribute("op4", testDAO.getop4(i));
        i++;
        return "Hello";
    }
    @RequestMapping("/next")
    public String test(Model m,@RequestParam String option)
    {
        boolean res=testService.result(option,i-1,testDAO.getans(i-1));

        if(res==true)
        {
            ans++;
            System.out.println(ans);
        }

        m.addAttribute("id", i);
        m.addAttribute("ques", testDAO.getQues(i));
        m.addAttribute("op1", testDAO.getop1(i));
        m.addAttribute("op2", testDAO.getop2(i));
        m.addAttribute("op3", testDAO.getop3(i));
        m.addAttribute("op4", testDAO.getop4(i));
        i++;
        m.addAttribute("answer",ans);
        if(i>testDAO.count()+1)
        {
            return "Result";
        }
        return "Hello";
    }



}

