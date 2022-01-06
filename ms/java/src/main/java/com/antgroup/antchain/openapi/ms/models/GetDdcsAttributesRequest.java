// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetDdcsAttributesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 属性自增长 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 系统字段：环境实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetDdcsAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDdcsAttributesRequest self = new GetDdcsAttributesRequest();
        return TeaModel.build(map, self);
    }

    public GetDdcsAttributesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDdcsAttributesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDdcsAttributesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDdcsAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
