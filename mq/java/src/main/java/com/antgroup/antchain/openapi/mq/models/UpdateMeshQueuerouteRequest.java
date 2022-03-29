// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateMeshQueuerouteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 路由规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 版本
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<QueueRouteEditionDTO> list;

    // 方法
    @NameInMap("meth")
    @Validation(required = true)
    public String meth;

    // 路由规则名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 队列id
    @NameInMap("queue_id")
    @Validation(required = true)
    public Long queueId;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 分流开关
    @NameInMap("switch_status")
    @Validation(required = true)
    public Long switchStatus;

    // 路由类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static UpdateMeshQueuerouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshQueuerouteRequest self = new UpdateMeshQueuerouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshQueuerouteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeshQueuerouteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeshQueuerouteRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateMeshQueuerouteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMeshQueuerouteRequest setList(java.util.List<QueueRouteEditionDTO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueueRouteEditionDTO> getList() {
        return this.list;
    }

    public UpdateMeshQueuerouteRequest setMeth(String meth) {
        this.meth = meth;
        return this;
    }
    public String getMeth() {
        return this.meth;
    }

    public UpdateMeshQueuerouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMeshQueuerouteRequest setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public UpdateMeshQueuerouteRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateMeshQueuerouteRequest setSwitchStatus(Long switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }
    public Long getSwitchStatus() {
        return this.switchStatus;
    }

    public UpdateMeshQueuerouteRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
