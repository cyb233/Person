package moe.shuvi.person.model;

import moe.shuvi.person.constants.Sex;
import moe.shuvi.person.model.organ.Heart;
import moe.shuvi.person.model.system.CirculatorySystem;

import java.util.Date;

/**
 * 首先,这是一个人
 *
 * @author schwi
 * @date 2022/05/03 21:32
 */

public class Person {
    /**
     * 性别
     */
    private Sex sex;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 心脏
     */
    private CirculatorySystem heart;

    public Person() {
        setSex(Math.random() < 0.5 ? Sex.XX : Sex.XY);
        setBirthday(new Date());
        setHeart(new Heart());
    }

    public Person(Sex sex, Date birthday, CirculatorySystem heart) {
        this.sex = sex;
        this.birthday = birthday;
        this.heart = heart;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public CirculatorySystem getHeart() {
        return heart;
    }

    public void setHeart(CirculatorySystem heart) {
        this.heart = heart;
    }
}
