package com.javalec.VoteThread;

public class MainClass {
    public static void main(String[] args) {
        VoteThread voteLoaction1 = new VoteThread();
        VoteThread voteLoaction2 = new VoteThread();
        VoteThread voteLoaction3 = new VoteThread();
    
        Thread location1 = new Thread(voteLoaction1, "Location1");
        Thread location2 = new Thread(voteLoaction2, "Location2");
        Thread location3 = new Thread(voteLoaction3, "Location3");
        
        location1.start();
        location2.start();
        location3.start();
    }
}
