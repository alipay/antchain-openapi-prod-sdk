// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class SignUserInfo extends TeaModel {
    // 签约记录id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50)
    public String id;

    // 支付宝代扣账号
    @NameInMap("alipay_account")
    @Validation(required = true, maxLength = 100)
    public String alipayAccount;

    public static SignUserInfo build(java.util.Map<String, ?> map) throws Exception {
        SignUserInfo self = new SignUserInfo();
        return TeaModel.build(map, self);
    }

    public SignUserInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SignUserInfo setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public String getAlipayAccount() {
        return this.alipayAccount;
    }

}
