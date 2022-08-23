// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class RetryProdsAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发布单id
    @NameInMap("ops_plan_id")
    @Validation(required = true)
    public String opsPlanId;

    public static RetryProdsAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryProdsAppopsRequest self = new RetryProdsAppopsRequest();
        return TeaModel.build(map, self);
    }

    public RetryProdsAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryProdsAppopsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryProdsAppopsRequest setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

}
