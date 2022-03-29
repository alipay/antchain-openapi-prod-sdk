// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateMeshQueueroutestatusconfirmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 路由规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 队列id
    @NameInMap("queue_id")
    @Validation(required = true)
    public Long queueId;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 应用
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    public static UpdateMeshQueueroutestatusconfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshQueueroutestatusconfirmRequest self = new UpdateMeshQueueroutestatusconfirmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshQueueroutestatusconfirmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeshQueueroutestatusconfirmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeshQueueroutestatusconfirmRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMeshQueueroutestatusconfirmRequest setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public UpdateMeshQueueroutestatusconfirmRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateMeshQueueroutestatusconfirmRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

}
