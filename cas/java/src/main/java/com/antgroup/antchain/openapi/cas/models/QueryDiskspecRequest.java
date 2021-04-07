// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDiskspecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // provider id
    @NameInMap("provider_id")
    public String providerId;

    // enable
    @NameInMap("enable")
    public Boolean enable;

    public static QueryDiskspecRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDiskspecRequest self = new QueryDiskspecRequest();
        return TeaModel.build(map, self);
    }

    public QueryDiskspecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDiskspecRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public QueryDiskspecRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
