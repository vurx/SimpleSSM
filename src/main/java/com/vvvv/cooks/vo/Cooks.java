package com.vvvv.cooks.vo;

import java.io.Serializable;
import java.util.Date;

public class Cooks implements Serializable {
    /**
     * 厨师表
     */
    private int cookid;
    private String cookname;
    private Date jobdate;

    /**
     * 食物表
     */
    private int foodid;
    private String foodname;
    private String foodsay;
    private String foodpic;

    /**
     * 厨师食物关联表
     */
    private int cafid;
    private Date makedate;

    public int getCookid() {
        return cookid;
    }

    public void setCookid(int cookid) {
        this.cookid = cookid;
    }

    public String getCookname() {
        return cookname;
    }

    public void setCookname(String cookname) {
        this.cookname = cookname;
    }

    public Date getJobdate() {
        return jobdate;
    }

    public void setJobdate(Date jobdate) {
        this.jobdate = jobdate;
    }

    public int getFoodid() {
        return foodid;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodsay() {
        return foodsay;
    }

    public void setFoodsay(String foodsay) {
        this.foodsay = foodsay;
    }

    public String getFoodpic() {
        return foodpic;
    }

    public void setFoodpic(String foodpic) {
        this.foodpic = foodpic;
    }

    public int getCafid() {
        return cafid;
    }

    public void setCafid(int cafid) {
        this.cafid = cafid;
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }
}
