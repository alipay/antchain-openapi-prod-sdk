// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class ExtendData extends TeaModel {
    // user_id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // cert_name
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    public static ExtendData build(java.util.Map<String, ?> map) throws Exception {
        ExtendData self = new ExtendData();
        return TeaModel.build(map, self);
    }

    public ExtendData setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ExtendData setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

}
