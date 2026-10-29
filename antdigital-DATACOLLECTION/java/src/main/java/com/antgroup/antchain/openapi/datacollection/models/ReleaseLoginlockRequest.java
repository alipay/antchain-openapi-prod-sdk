// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class ReleaseLoginlockRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 站点代码
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // 持锁实例id
    @NameInMap("inst_id")
    @Validation(required = true)
    public String instId;

    public static ReleaseLoginlockRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLoginlockRequest self = new ReleaseLoginlockRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseLoginlockRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReleaseLoginlockRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public ReleaseLoginlockRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

}
