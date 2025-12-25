// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class CyUserInfo extends TeaModel {
    // 用户id
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户名
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("user_name")
    public String userName;

    // 证件号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("id_card")
    public String idCard;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("phone_num")
    @Validation(required = true)
    public String phoneNum;

    public static CyUserInfo build(java.util.Map<String, ?> map) throws Exception {
        CyUserInfo self = new CyUserInfo();
        return TeaModel.build(map, self);
    }

    public CyUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CyUserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CyUserInfo setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public CyUserInfo setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

}
