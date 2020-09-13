package com.resources.wu.util;

import org.quartz.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * Demo class
 *
 * @author
 * @date 2020/9/10
 */
public class DumbJob implements Job {
    String jobSays;
    float myFloatValue;
    ArrayList state;

    public String getJobSays() {
        return jobSays;
    }

    public void setJobSays(String jobSays) {
        this.jobSays = jobSays;
    }

    public float getMyFloatValue() {
        return myFloatValue;
    }

    public void setMyFloatValue(float myFloatValue) {
        this.myFloatValue = myFloatValue;
    }

    public ArrayList getState() {
        return state;
    }

    public void setState(ArrayList state) {
        this.state = state;
    }

    public DumbJob() {
    }
    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException
    {
        JobKey key = context.getJobDetail().getKey();

        //JobDataMap dataMap = context.getJobDetail().getJobDataMap();
        JobDataMap dataMap = context.getMergedJobDataMap();
//        String jobSays = dataMap.getString("jobSays");
//        float myFloatValue = dataMap.getFloat("myFloatValue");
//        ArrayList state = (ArrayList) dataMap.get("myStateDate");
//        state.add(new Date());

        System.err.println("Instance " + key + " of DumbJob says: " + jobSays + ", and val is: " + myFloatValue);
    }

}
