// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetSofamqLdcbynamespaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // namespace_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetSofamqLdcbynamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSofamqLdcbynamespaceRequest self = new GetSofamqLdcbynamespaceRequest();
        return TeaModel.build(map, self);
    }

    public GetSofamqLdcbynamespaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSofamqLdcbynamespaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetSofamqLdcbynamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
