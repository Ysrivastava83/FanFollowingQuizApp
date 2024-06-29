package com.yuvraj.FanFollowingQuizApp.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService
{
    int res=0;
    public boolean result(String option,int id,String ans)
    {
        System.out.println(option+" "+id+" "+ans);
        if(option.equals(ans))
        {
            return true;
        }
        else
            return false;
    }
}
