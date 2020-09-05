package com.resources.wu;

import com.resources.wu.entity.UserDto;
import com.resources.wu.entity.UserVo;
import com.resources.wu.service.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

//@MapperScan(basePackages = "mapper")

@SpringBootApplication
public class StartMain {

    @Autowired
    Environment environment;

    public static void main(String[] args) {


        // new StartCommand(args);
        SpringApplication.run(StartMain.class, args);
        System.out.println("启动成功");
//        UserVo userVo = new UserVo();
//        userVo.setId(1);
//        userVo.setusername("a");
//        userVo.setAge("12");
//        userVo.setSex("1");
//
//        UserVo userVo1 = new UserVo();
//        userVo1.setId(2);
//        userVo1.setusername("c");
//        userVo1.setAge("12");
//        userVo1.setSex("1");
        //UserDto userDto = new UserDto();
        //BeanUtils.copyProperties(userVo,userDto);
        //UserDto userDto =  EntityConverter.entityConverter.votoDto(userVo);
       // System.out.println(userDto.getName());
//        List<UserVo> listVo = new ArrayList<>();
//        listVo.add(userVo);
//        listVo.add(userVo1);
//        List<UserDto> listDto = EntityConverter.entityConverter.votoListDto(listVo);
//        for (UserDto t:listDto) {
//            System.out.println(t.getName());
//        }
//        while (true) {
//            Scanner input = new Scanner(System.in);
//            String ss = input.nextLine();
//            System.out.println(ss);
//        }
        //input.close();


//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String s = input.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(-1);
//        arrayList.add(3);
//        arrayList.add(3);
//        arrayList.add(-5);
//        arrayList.add(7);
//        arrayList.add(4);
//        arrayList.add(-9);
//        arrayList.add(-7);
//        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
//        arrayList2.add(-3);
//        arrayList2.add(-5);
//        arrayList2.add(7);
//        System.out.println("原始数组:");
//        System.out.println(arrayList);
//
//        System.out.println("Collections.max(arrayList):");
//        System.out.println(Collections.max(arrayList));
//
//        System.out.println("Collections.min(arrayList):");
//        System.out.println(Collections.min(arrayList));
//
//        System.out.println("Collections.replaceAll(arrayList, 3, -3):");
//        Collections.replaceAll(arrayList, 3, -3);
//        System.out.println(arrayList);
//
//        System.out.println("Collections.frequency(arrayList, -3):");
//        System.out.println(Collections.frequency(arrayList, -3));
//
//        System.out.println("Collections.indexOfSubList(arrayList, arrayList2):");
//        System.out.println(Collections.indexOfSubList(arrayList, arrayList2));
//
//        System.out.println("Collections.binarySearch(arrayList, 7):");
//        // 对List进行二分查找，返回索引，List必须是有序的
//        Collections.sort(arrayList);
//        System.out.println(Collections.binarySearch(arrayList, 7));


//在java代码中获取JVM参数
//        long maxMemory = Runtime.getRuntime().maxMemory();
//        long totalMemory = Runtime.getRuntime().totalMemory();
//        System.out.println("-Xmx 最大分配内存 "+(maxMemory/(double)1024/1024)+"MB");
//        System.out.println("-Xms 初始分配内存 "+(totalMemory/(double)1024/1024)+"MB");
//        System.out.println(ManagementFactory.getRuntimeMXBean().getInputArguments());
//        MemoryMXBean memorymbean = ManagementFactory.getMemoryMXBean();
//        MemoryUsage usage = memorymbean.getHeapMemoryUsage();
//        System.out.println("INIT HEAP: " + usage.getInit());
//        System.out.println("MAX HEAP: " + usage.getMax());
//        System.out.println("USE HEAP: " + usage.getUsed());
//        System.out.println("\nFull Information:");
//        System.out.println("Heap Memory Usage: "
//                + memorymbean.getHeapMemoryUsage());
//        System.out.println("Non-Heap Memory Usage: "
//                + memorymbean.getNonHeapMemoryUsage());
//
//        List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
//        System.out.println("===================java options=============== ");
//        System.out.println(inputArguments);
//
//
//
//        System.out.println("=======================通过java来获取相关系统状态============================ ");
//        int i = (int)Runtime.getRuntime().totalMemory()/1024;//Java 虚拟机中的内存总量,以字节为单位
//        System.out.println("总的内存量 i is "+i);
//        int j = (int)Runtime.getRuntime().freeMemory()/1024;//Java 虚拟机中的空闲内存量
//        System.out.println("空闲内存量 j is "+j);
//        System.out.println("最大内存量 is "+Runtime.getRuntime().maxMemory()/1024);
//
//        System.out.println("=======================OperatingSystemMXBean============================ ");
//        OperatingSystemMXBean osm = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
////    System.out.println(osm.getFreeSwapSpaceSize()/1024);
////    System.out.println(osm.getFreePhysicalMemorySize()/1024);
////    System.out.println(osm.getTotalPhysicalMemorySize()/1024);
//
//        //获取操作系统相关信息
//        System.out.println("osm.getArch() "+osm.getArch());
//        System.out.println("osm.getAvailableProcessors() "+osm.getAvailableProcessors());
//        //System.out.println("osm.getCommittedVirtualMemorySize() "+osm.getCommittedVirtualMemorySize());
//        System.out.println("osm.getName() "+osm.getName());
//        //System.out.println("osm.getProcessCpuTime() "+osm.getProcessCpuTime());
//        System.out.println("osm.getVersion() "+osm.getVersion());
//        //获取整个虚拟机内存使用情况
//        System.out.println("=======================MemoryMXBean============================ ");
//        MemoryMXBean mm=(MemoryMXBean)ManagementFactory.getMemoryMXBean();
//        System.out.println("getHeapMemoryUsage "+mm.getHeapMemoryUsage());
//        System.out.println("getNonHeapMemoryUsage "+mm.getNonHeapMemoryUsage());
//        //获取各个线程的各种状态，CPU 占用情况，以及整个系统中的线程状况
//        System.out.println("=======================ThreadMXBean============================ ");
//        ThreadMXBean tm=(ThreadMXBean)ManagementFactory.getThreadMXBean();
//        System.out.println("getThreadCount "+tm.getThreadCount());
//        System.out.println("getPeakThreadCount "+tm.getPeakThreadCount());
//        System.out.println("getCurrentThreadCpuTime "+tm.getCurrentThreadCpuTime());
//        System.out.println("getDaemonThreadCount "+tm.getDaemonThreadCount());
//        System.out.println("getCurrentThreadUserTime "+tm.getCurrentThreadUserTime());
//
//        //当前编译器情况
//        System.out.println("=======================CompilationMXBean============================ ");
//        CompilationMXBean gm=(CompilationMXBean)ManagementFactory.getCompilationMXBean();
//        System.out.println("getName "+gm.getName());
//        System.out.println("getTotalCompilationTime "+gm.getTotalCompilationTime());
//
//        //获取多个内存池的使用情况
//        System.out.println("=======================MemoryPoolMXBean============================ ");
//        List<MemoryPoolMXBean> mpmList=ManagementFactory.getMemoryPoolMXBeans();
//        for(MemoryPoolMXBean mpm:mpmList){
//            System.out.println("getUsage "+mpm.getUsage());
//            System.out.println("getMemoryManagerNames "+mpm.getMemoryManagerNames().toString());
//        }
//        //获取GC的次数以及花费时间之类的信息
//        System.out.println("=======================MemoryPoolMXBean============================ ");
//        List<GarbageCollectorMXBean> gcmList=ManagementFactory.getGarbageCollectorMXBeans();
//        for(GarbageCollectorMXBean gcm:gcmList){
//            System.out.println("getName "+gcm.getName());
//            System.out.println("getMemoryPoolNames "+gcm.getMemoryPoolNames());
//        }
//        //获取运行时信息
//        System.out.println("=======================RuntimeMXBean============================ ");
//        RuntimeMXBean rmb=(RuntimeMXBean)ManagementFactory.getRuntimeMXBean();
//        System.out.println("getClassPath "+rmb.getClassPath());
//        System.out.println("getLibraryPath "+rmb.getLibraryPath());
//        Systemnjia.out.println("getVmVersion "+rmb.getVmVersion());
//        //新建一个ThreadLocal
//        ThreadLocal<String> local = new ThreadLocal<>();
//        //新建一个随机数
//        Random random = new Random();
//        //使用java8中的stream新建五个线程
//        IntStream.range(0,5).forEach(a-> new Thread(()->{
//            //為每一個線程設置local值
//            local.set(a+" "+random.nextInt(10));
//            System.out.println("线程和local值分别是"+local.get());
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start());
        //双亲委派模型
//        System.out.println("StartMain's ClassLoader is " +
//                StartMain.class.getClassLoader());
//        System.out.println("The Parent of StartMain's ClassLoader is " +
//                StartMain.class.getClassLoader().getParent());
//        System.out.println("The GrandParent of StartMain's ClassLoader is " +
//                        StartMain.class.getClassLoader().getParent().getParent());
    }
}
