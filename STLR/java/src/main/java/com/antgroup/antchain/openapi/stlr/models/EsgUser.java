// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EsgUser extends TeaModel {
    // 当前操作员 ID
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 当前登录账号。
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 操作员昵称
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    // 操作员真实姓名
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("real_name")
    public String realName;

    // 操作员手机号
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("phone_number")
    public String phoneNumber;

    public static EsgUser build(java.util.Map<String, ?> map) throws Exception {
        EsgUser self = new EsgUser();
        return TeaModel.build(map, self);
    }

    public EsgUser setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public EsgUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public EsgUser setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public EsgUser setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public EsgUser setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
