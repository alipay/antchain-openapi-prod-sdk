// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class IdentityInfo extends TeaModel {
    // 需要打标的税号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 授权编号
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    public static IdentityInfo build(java.util.Map<String, ?> map) throws Exception {
        IdentityInfo self = new IdentityInfo();
        return TeaModel.build(map, self);
    }

    public IdentityInfo setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public IdentityInfo setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
