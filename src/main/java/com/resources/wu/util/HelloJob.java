package com.resources.wu.util;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;

import java.time.LocalDateTime;

/**
 * Demo class
 *
 * @author
 * @date 2020/9/10
 */
public class HelloJob implements Job{
    public HelloJob() {
    }
    @Override
    public void execute(JobExecutionContext jobExecutionContext)
            throws JobExecutionException {
        Object tv1 = jobExecutionContext.getTrigger()
                .getJobDataMap().get("t1");
        Object tv2 = jobExecutionContext.getTrigger()
                .getJobDataMap().get("t2");
        Object jv1 = jobExecutionContext.getJobDetail()
                .getJobDataMap().get("j1");
        Object jv2 = jobExecutionContext.getJobDetail()
                .getJobDataMap().get("j2");
        Object sv = null;
        try {
            sv = jobExecutionContext.getScheduler().getContext().get("skey");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        System.out.println(tv1+":"+tv2);
        System.out.println(jv1+":"+jv2);
        System.out.println(sv);
        System.out.println("hello:"+ LocalDateTime.now());
//        System.err.println("Hello!  HelloJob is executing.");
    }
}
