package com.notesapp.main;

public class Threads {
	   public static void main(String[] args) throws InterruptedException {
	        long start = System.currentTimeMillis();
	        Thread.sleep(2000);
	        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
	        
	    }

}
