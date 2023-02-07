// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CheckQuotaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 检查的值
    @NameInMap("dim_groups")
    @Validation(required = true)
    public java.util.List<SingleDimGroup> dimGroups;

    public static CheckQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckQuotaRequest self = new CheckQuotaRequest();
        return TeaModel.build(map, self);
    }

    public CheckQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckQuotaRequest setDimGroups(java.util.List<SingleDimGroup> dimGroups) {
        this.dimGroups = dimGroups;
        return this;
    }
    public java.util.List<SingleDimGroup> getDimGroups() {
        return this.dimGroups;
    }

}
