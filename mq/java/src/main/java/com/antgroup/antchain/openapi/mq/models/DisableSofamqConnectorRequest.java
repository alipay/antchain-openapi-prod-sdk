// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DisableSofamqConnectorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 租户实例
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static DisableSofamqConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSofamqConnectorRequest self = new DisableSofamqConnectorRequest();
        return TeaModel.build(map, self);
    }

    public DisableSofamqConnectorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DisableSofamqConnectorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DisableSofamqConnectorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DisableSofamqConnectorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
