package com.ggic.jb01;

public class Worker implements Runnable{

    private Integer time;

    public Worker(Integer time) {
        this.time = time;
    }

    public void work(){
        System.out.println(Thread.currentThread().getName()+ " performing his assigned task will take time: "+ time+"s");
        try {
            Thread.sleep(time.longValue() * 1000);
        }catch (InterruptedException ex){
            System.out.println("Ex: "+ ex.getMessage());
        }
        System.out.println(Thread.currentThread().getName()+ " finished performing his assigned task");
    }

    @Override
    public void run() {
        work();
    }
}
