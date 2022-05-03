package moe.shuvi.person.model;

import moe.shuvi.person.constants.Sex;

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
     * 循环系统
     */
    private CirculatorySystem circulatorySystem;

    public Person() {
        setSex(Math.random() < 0.5 ? Sex.XX : Sex.XY);
        setBirthday(new Date());
        setCirculatorySystem(new CirculatorySystem());
    }

    public Person(Sex sex, Date birthday, CirculatorySystem circulatorySystem) {
        this.sex = sex;
        this.birthday = birthday;
        this.circulatorySystem = circulatorySystem;
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

    public CirculatorySystem getCirculatorySystem() {
        return circulatorySystem;
    }

    public Person setCirculatorySystem(CirculatorySystem circulatorySystem) {
        this.circulatorySystem = circulatorySystem;
        return this;
    }
}
