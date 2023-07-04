// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetAapReleaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发布单id
    @NameInMap("release_plan_id")
    @Validation(required = true)
    public String releasePlanId;

    public static GetAapReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAapReleaseRequest self = new GetAapReleaseRequest();
        return TeaModel.build(map, self);
    }

    public GetAapReleaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAapReleaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAapReleaseRequest setReleasePlanId(String releasePlanId) {
        this.releasePlanId = releasePlanId;
        return this;
    }
    public String getReleasePlanId() {
        return this.releasePlanId;
    }

}
