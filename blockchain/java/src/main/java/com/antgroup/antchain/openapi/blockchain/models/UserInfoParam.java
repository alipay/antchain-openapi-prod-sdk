// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UserInfoParam extends TeaModel {
    // 用户手机号信息
    /**
     * <strong>example:</strong>
     * <p>13222222222</p>
     */
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 用户账号信息
    /**
     * <strong>example:</strong>
     * <p>13222222222</p>
     */
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    // 用户名称
    /**
     * <strong>example:</strong>
     * <p>wangerxiao</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static UserInfoParam build(java.util.Map<String, ?> map) throws Exception {
        UserInfoParam self = new UserInfoParam();
        return TeaModel.build(map, self);
    }

    public UserInfoParam setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UserInfoParam setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

    public UserInfoParam setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
