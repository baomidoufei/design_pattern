package com.it.principles.demo5;

public class Agent {
    private Star star;
    private Company company;
    private Fans fans;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void meeting(){
        System.out.println(star.getName()+"和粉丝"+fans.getName()+"见面");
    }

    public void bussiness(){
        System.out.println(star.getName()+"和公司"+company.getName()+"洽谈");
    }

    @Override
    public String toString() {
        return "Agent{" +
                "star=" + star +
                ", company=" + company +
                ", fans=" + fans +
                '}';
    }
}
