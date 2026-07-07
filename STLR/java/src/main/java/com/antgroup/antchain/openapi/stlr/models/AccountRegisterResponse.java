// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AccountRegisterResponse extends TeaModel {
    // 账户did
    /**
     * <strong>example:</strong>
     * <p>did:private:xxxcxxxxx</p>
     */
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    public static AccountRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountRegisterResponse self = new AccountRegisterResponse();
        return TeaModel.build(map, self);
    }

    public AccountRegisterResponse setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

}
