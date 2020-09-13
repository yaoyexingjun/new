package com.resources.wu.util;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

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
        System.err.println("Hello!  HelloJob is executing.");
    }
}
