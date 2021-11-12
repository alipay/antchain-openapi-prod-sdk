// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class RetryAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运维单id。
    @NameInMap("ops_plan_id")
    @Validation(required = true)
    public String opsPlanId;

    public static RetryAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryAppopsRequest self = new RetryAppopsRequest();
        return TeaModel.build(map, self);
    }

    public RetryAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryAppopsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryAppopsRequest setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

}
