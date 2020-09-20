package com.resources.wu.util;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
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
            JobDetail job = newJob(DumbJob.class)
                    .withIdentity("myJob", "group1")
                    .usingJobData("jobSays", "Hello World!")
                    .usingJobData("myFloatValue", 3.141f)
                    .build();

// Trigger the job to run now, and then every 40 seconds
            Trigger trigger = newTrigger()
                    .withIdentity("myTrigger", "group1")
                    .startNow()
                    .withSchedule(simpleSchedule()
                            .withIntervalInSeconds(10)
                            .repeatForever())
                    .build();
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
