// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class CarUserInfo extends TeaModel {
    // 唯一标识用户的id
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>138xxxxxxx</p>
     */
    @NameInMap("phone_num")
    @Validation(required = true)
    public String phoneNum;

    // 城市编码
    /**
     * <strong>example:</strong>
     * <p>110000</p>
     */
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    // 姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("user_cert_name")
    public String userCertName;

    // 证件号码
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("user_cert_no")
    public String userCertNo;

    // 性别
    /**
     * <strong>example:</strong>
     * <p>girl</p>
     */
    @NameInMap("user_gender")
    public String userGender;

    // 昵称
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("nick")
    public String nick;

    public static CarUserInfo build(java.util.Map<String, ?> map) throws Exception {
        CarUserInfo self = new CarUserInfo();
        return TeaModel.build(map, self);
    }

    public CarUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CarUserInfo setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CarUserInfo setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public CarUserInfo setUserCertName(String userCertName) {
        this.userCertName = userCertName;
        return this;
    }
    public String getUserCertName() {
        return this.userCertName;
    }

    public CarUserInfo setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

    public CarUserInfo setUserGender(String userGender) {
        this.userGender = userGender;
        return this;
    }
    public String getUserGender() {
        return this.userGender;
    }

    public CarUserInfo setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

}
