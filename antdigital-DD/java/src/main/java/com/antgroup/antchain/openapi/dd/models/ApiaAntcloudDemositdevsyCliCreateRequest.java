// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ApiaAntcloudDemositdevsyCliCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static ApiaAntcloudDemositdevsyCliCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiaAntcloudDemositdevsyCliCreateRequest self = new ApiaAntcloudDemositdevsyCliCreateRequest();
        return TeaModel.build(map, self);
    }

    public ApiaAntcloudDemositdevsyCliCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApiaAntcloudDemositdevsyCliCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
