// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CarbonAccountInfo extends TeaModel {
    // 账户did
    /**
     * <strong>example:</strong>
     * <p>did:private:xxx</p>
     */
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 账户名称
    /**
     * <strong>example:</strong>
     * <p>xxx企业</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static CarbonAccountInfo build(java.util.Map<String, ?> map) throws Exception {
        CarbonAccountInfo self = new CarbonAccountInfo();
        return TeaModel.build(map, self);
    }

    public CarbonAccountInfo setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public CarbonAccountInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
