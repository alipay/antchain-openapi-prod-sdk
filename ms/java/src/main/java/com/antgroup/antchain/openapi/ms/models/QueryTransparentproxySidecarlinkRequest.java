// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryTransparentproxySidecarlinkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static QueryTransparentproxySidecarlinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTransparentproxySidecarlinkRequest self = new QueryTransparentproxySidecarlinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTransparentproxySidecarlinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTransparentproxySidecarlinkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTransparentproxySidecarlinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
