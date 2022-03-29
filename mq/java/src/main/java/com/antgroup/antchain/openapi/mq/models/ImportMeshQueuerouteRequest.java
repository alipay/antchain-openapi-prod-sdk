// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ImportMeshQueuerouteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 队列版本
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

    // 路由类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ImportMeshQueuerouteRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMeshQueuerouteRequest self = new ImportMeshQueuerouteRequest();
        return TeaModel.build(map, self);
    }

    public ImportMeshQueuerouteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportMeshQueuerouteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportMeshQueuerouteRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public ImportMeshQueuerouteRequest setList(java.util.List<QueueRouteEditionDTO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueueRouteEditionDTO> getList() {
        return this.list;
    }

    public ImportMeshQueuerouteRequest setMeth(String meth) {
        this.meth = meth;
        return this;
    }
    public String getMeth() {
        return this.meth;
    }

    public ImportMeshQueuerouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportMeshQueuerouteRequest setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public ImportMeshQueuerouteRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
