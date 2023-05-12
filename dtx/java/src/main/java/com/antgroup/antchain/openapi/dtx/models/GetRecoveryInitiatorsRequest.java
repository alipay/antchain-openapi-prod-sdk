// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetRecoveryInitiatorsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetRecoveryInitiatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecoveryInitiatorsRequest self = new GetRecoveryInitiatorsRequest();
        return TeaModel.build(map, self);
    }

    public GetRecoveryInitiatorsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRecoveryInitiatorsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRecoveryInitiatorsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetRecoveryInitiatorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
