// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateQuotaInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // params
    @NameInMap("params")
    @Validation(required = true)
    public java.util.List<SingleDimGroupQuota> params;

    public static UpdateQuotaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaInstanceRequest self = new UpdateQuotaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateQuotaInstanceRequest setParams(java.util.List<SingleDimGroupQuota> params) {
        this.params = params;
        return this;
    }
    public java.util.List<SingleDimGroupQuota> getParams() {
        return this.params;
    }

}
