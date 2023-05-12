// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetRecoveryParticipatorsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetRecoveryParticipatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecoveryParticipatorsRequest self = new GetRecoveryParticipatorsRequest();
        return TeaModel.build(map, self);
    }

    public GetRecoveryParticipatorsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRecoveryParticipatorsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRecoveryParticipatorsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetRecoveryParticipatorsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetRecoveryParticipatorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
