// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetGlobalStatsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 站内：租户+环境；站外：instanceId
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetGlobalStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalStatsRequest self = new GetGlobalStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetGlobalStatsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetGlobalStatsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetGlobalStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
