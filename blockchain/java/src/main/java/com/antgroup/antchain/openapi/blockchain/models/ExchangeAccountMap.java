// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExchangeAccountMap extends TeaModel {
    // 用户联系方式
    /**
     * <strong>example:</strong>
     * <p>13473121212</p>
     */
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 用户账户
    /**
     * <strong>example:</strong>
     * <p>testAccount</p>
     */
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    // 用户名称
    /**
     * <strong>example:</strong>
     * <p>小明</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static ExchangeAccountMap build(java.util.Map<String, ?> map) throws Exception {
        ExchangeAccountMap self = new ExchangeAccountMap();
        return TeaModel.build(map, self);
    }

    public ExchangeAccountMap setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ExchangeAccountMap setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

    public ExchangeAccountMap setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
