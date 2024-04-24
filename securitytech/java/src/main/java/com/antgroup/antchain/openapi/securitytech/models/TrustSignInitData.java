// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class TrustSignInitData extends TeaModel {
    // 请求唯一标识Id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 签约秘钥
    @NameInMap("sign_key")
    @Validation(required = true)
    public String signKey;

    public static TrustSignInitData build(java.util.Map<String, ?> map) throws Exception {
        TrustSignInitData self = new TrustSignInitData();
        return TeaModel.build(map, self);
    }

    public TrustSignInitData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrustSignInitData setSignKey(String signKey) {
        this.signKey = signKey;
        return this;
    }
    public String getSignKey() {
        return this.signKey;
    }

}
