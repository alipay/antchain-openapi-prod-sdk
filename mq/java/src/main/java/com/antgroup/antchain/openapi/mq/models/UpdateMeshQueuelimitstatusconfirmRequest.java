// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateMeshQueuelimitstatusconfirmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 限流规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 限流规则状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 队列id
    @NameInMap("queue_id")
    @Validation(required = true)
    public Long queueId;

    // 方法
    @NameInMap("meth")
    @Validation(required = true)
    public String meth;

    public static UpdateMeshQueuelimitstatusconfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshQueuelimitstatusconfirmRequest self = new UpdateMeshQueuelimitstatusconfirmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshQueuelimitstatusconfirmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeshQueuelimitstatusconfirmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeshQueuelimitstatusconfirmRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMeshQueuelimitstatusconfirmRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateMeshQueuelimitstatusconfirmRequest setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public UpdateMeshQueuelimitstatusconfirmRequest setMeth(String meth) {
        this.meth = meth;
        return this;
    }
    public String getMeth() {
        return this.meth;
    }

}
