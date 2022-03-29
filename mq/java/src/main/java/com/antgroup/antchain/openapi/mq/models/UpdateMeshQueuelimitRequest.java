// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateMeshQueuelimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 限流规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 队列限流域值
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<QueueLimitValueDTO> list;

    // 限流算法
    @NameInMap("l_algorithm")
    @Validation(required = true)
    public String lAlgorithm;

    // 限流后操作
    @NameInMap("l_operation")
    @Validation(required = true)
    public String lOperation;

    // 方法
    @NameInMap("meth")
    @Validation(required = true)
    public String meth;

    // 限流规则名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 队列id
    @NameInMap("queue_id")
    @Validation(required = true)
    public Long queueId;

    // 运行模式
    @NameInMap("r_mode")
    @Validation(required = true)
    public String rMode;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 应用名
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    public static UpdateMeshQueuelimitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshQueuelimitRequest self = new UpdateMeshQueuelimitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshQueuelimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeshQueuelimitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeshQueuelimitRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMeshQueuelimitRequest setList(java.util.List<QueueLimitValueDTO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueueLimitValueDTO> getList() {
        return this.list;
    }

    public UpdateMeshQueuelimitRequest setLAlgorithm(String lAlgorithm) {
        this.lAlgorithm = lAlgorithm;
        return this;
    }
    public String getLAlgorithm() {
        return this.lAlgorithm;
    }

    public UpdateMeshQueuelimitRequest setLOperation(String lOperation) {
        this.lOperation = lOperation;
        return this;
    }
    public String getLOperation() {
        return this.lOperation;
    }

    public UpdateMeshQueuelimitRequest setMeth(String meth) {
        this.meth = meth;
        return this;
    }
    public String getMeth() {
        return this.meth;
    }

    public UpdateMeshQueuelimitRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMeshQueuelimitRequest setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public UpdateMeshQueuelimitRequest setRMode(String rMode) {
        this.rMode = rMode;
        return this;
    }
    public String getRMode() {
        return this.rMode;
    }

    public UpdateMeshQueuelimitRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateMeshQueuelimitRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

}
