// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DeleteAppsBiztypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // instanceid
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    public static DeleteAppsBiztypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppsBiztypeRequest self = new DeleteAppsBiztypeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppsBiztypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAppsBiztypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAppsBiztypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAppsBiztypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
