package com.tr.user.VO;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *<p>
 * 用户信息VO
 *  @author  qhl
 *</p>
 */
public class UserVO implements Serializable {
    /**
     * 用户id
     */
    private  Integer uId;
    /**
     * 用户名
     */
   // private String userName
    /***
     * 账号
      */
    private  String account;

    /**
     * 密码
     */
    private  String password;
    /**
     * 昵称
     */
    private String nikeName;
    /**
     * 用户类型 1 -买 2 -卖 -3 管理员 -4游客
     */
    private Integer userType;
    /**
     * 真实姓名
     */
    private  String realName;
    /***
     * 家庭住址
     */
    private String address;
    /**
     *注册时间
     */
    private Date registTime;
    /**
     * 性别 1 男 2 女 3 未知
     */
    private Integer sex;
    /**
     * 电邮
     */
    private String email;
    /**
     * 创建时间
     */
    private  Date createDate;
    /**
     * 修改时间
     */
    private  Date modifyDate;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
