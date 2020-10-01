package com.resources.wu.util;
import org.apache.poi.ss.formula.functions.T;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;
/**
 * Demo class
 *
 * @author
 * @date 2020/9/9
 */
public class QuartzTest {
    public static void main(String[] args) {

        try {
            // Grab the Scheduler instance from the Factory
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            scheduler.start();
//=================================
//            JobDetail job = newJob(DumbJob.class)
            //JobDetail job = newJob(Class.forName("com.resources.wu.util.DumbJob"))
            Class c = null;
            try {
                 c =  Class.forName("com.resources.wu.util.DumbJob");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            JobDetail job = JobBuilder.newJob(c)
                    .withIdentity("Job4", "group4")
                    .usingJobData("jobSays", "Hello World!")
                    .usingJobData("myFloatValue", 3.141f)
                    .build();

// Trigger the job to run now, and then every 40 seconds

            Trigger    trigger = newTrigger()
                    .withIdentity("Job4", "group4")
                    .withSchedule(cronSchedule("0/2 * * * * ?"))
                    .build();

// .forJob("myJob", "group1")

//            Trigger trigger = newTrigger()
//                    .withIdentity("myTrigger", "group1")
//                    .startNow()
//                    .withSchedule(simpleSchedule()
//                            .withIntervalInSeconds(10)
//                            .repeatForever())
//                    .build();
//            //指定时间开始出发，不重复
//            SimpleTrigger simpleTrigger = newTrigger()
//            .withIdentity("trigger1","group1")
//            .startAt(myStartTime).forJob("job1","group1"):

// Tell quartz to schedule the job using our trigger
            scheduler.scheduleJob(job, trigger);

            //========================
//            scheduler.shutdown();

        } catch (SchedulerException se) {
            se.printStackTrace();
        }
    }
}
