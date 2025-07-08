// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class TrustSignInitData extends TeaModel {
    // 请求唯一标识Id
    /**
     * <strong>example:</strong>
     * <p>111111111111111</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 签约秘钥
    /**
     * <strong>example:</strong>
     * <p>g9y47yjs</p>
     */
    @NameInMap("sign_unique_id")
    @Validation(required = true)
    public String signUniqueId;

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

    public TrustSignInitData setSignUniqueId(String signUniqueId) {
        this.signUniqueId = signUniqueId;
        return this;
    }
    public String getSignUniqueId() {
        return this.signUniqueId;
    }

}
