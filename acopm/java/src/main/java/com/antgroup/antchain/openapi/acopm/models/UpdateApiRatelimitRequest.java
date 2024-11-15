// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class UpdateApiRatelimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // update_limit_list
    @NameInMap("update_limit_list")
    @Validation(required = true)
    public java.util.List<UpdateRateLimit> updateLimitList;

    public static UpdateApiRatelimitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiRatelimitRequest self = new UpdateApiRatelimitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiRatelimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApiRatelimitRequest setUpdateLimitList(java.util.List<UpdateRateLimit> updateLimitList) {
        this.updateLimitList = updateLimitList;
        return this;
    }
    public java.util.List<UpdateRateLimit> getUpdateLimitList() {
        return this.updateLimitList;
    }

}
