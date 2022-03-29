// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteSofamqRouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 路由任务 ID
    @NameInMap("router_id")
    @Validation(required = true)
    public Long routerId;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static DeleteSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSofamqRouterRequest self = new DeleteSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSofamqRouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSofamqRouterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSofamqRouterRequest setRouterId(Long routerId) {
        this.routerId = routerId;
        return this;
    }
    public Long getRouterId() {
        return this.routerId;
    }

    public DeleteSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
