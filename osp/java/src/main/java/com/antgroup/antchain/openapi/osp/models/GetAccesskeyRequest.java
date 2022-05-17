// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class GetAccesskeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 	
    // 该参数是一个instanceId
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 	
    // 该字段为AK/SK的创建名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static GetAccesskeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccesskeyRequest self = new GetAccesskeyRequest();
        return TeaModel.build(map, self);
    }

    public GetAccesskeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAccesskeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAccesskeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAccesskeyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
