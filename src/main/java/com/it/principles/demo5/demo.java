package com.it.principles.demo5;

public class demo {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setCompany(new Company("彭建飞传媒"));
        agent.setFans(new Fans("小黑子"));
        agent.setStar(new Star("蔡徐坤"));
        agent.meeting();
        agent.bussiness();
    }
}
