// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetProdsAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发布单id
    @NameInMap("ops_plan_id")
    @Validation(required = true)
    public String opsPlanId;

    public static GetProdsAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProdsAppopsRequest self = new GetProdsAppopsRequest();
        return TeaModel.build(map, self);
    }

    public GetProdsAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetProdsAppopsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetProdsAppopsRequest setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

}
