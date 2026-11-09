// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class GetTrackingTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户侧用户id
    @NameInMap("out_user_id")
    @Validation(required = true)
    public String outUserId;

    public static GetTrackingTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrackingTokenRequest self = new GetTrackingTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTrackingTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTrackingTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTrackingTokenRequest setOutUserId(String outUserId) {
        this.outUserId = outUserId;
        return this;
    }
    public String getOutUserId() {
        return this.outUserId;
    }

}
