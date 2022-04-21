// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class StandardRealPersonAuthRequest extends TeaModel {
    // 个人证件号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 名字
    @NameInMap("identity_name")
    @Validation(required = true)
    public String identityName;

    public static StandardRealPersonAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        StandardRealPersonAuthRequest self = new StandardRealPersonAuthRequest();
        return TeaModel.build(map, self);
    }

    public StandardRealPersonAuthRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public StandardRealPersonAuthRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

}
