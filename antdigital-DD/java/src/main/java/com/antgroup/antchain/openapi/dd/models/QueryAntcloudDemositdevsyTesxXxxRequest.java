// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudDemositdevsyTesxXxxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static QueryAntcloudDemositdevsyTesxXxxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudDemositdevsyTesxXxxRequest self = new QueryAntcloudDemositdevsyTesxXxxRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudDemositdevsyTesxXxxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudDemositdevsyTesxXxxRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
