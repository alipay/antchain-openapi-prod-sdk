// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class TryLoginlockRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 站点代码
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // 抢占实例id
    @NameInMap("inst_id")
    @Validation(required = true)
    public String instId;

    // 锁有效期秒数
    @NameInMap("ttl_seconds")
    public Long ttlSeconds;

    public static TryLoginlockRequest build(java.util.Map<String, ?> map) throws Exception {
        TryLoginlockRequest self = new TryLoginlockRequest();
        return TeaModel.build(map, self);
    }

    public TryLoginlockRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TryLoginlockRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public TryLoginlockRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

    public TryLoginlockRequest setTtlSeconds(Long ttlSeconds) {
        this.ttlSeconds = ttlSeconds;
        return this;
    }
    public Long getTtlSeconds() {
        return this.ttlSeconds;
    }

}
