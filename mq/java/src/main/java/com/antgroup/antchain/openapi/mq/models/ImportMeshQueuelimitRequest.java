// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ImportMeshQueuelimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id和rule_id为空
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

    // 规则名称
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

    // 应用名
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    public static ImportMeshQueuelimitRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMeshQueuelimitRequest self = new ImportMeshQueuelimitRequest();
        return TeaModel.build(map, self);
    }

    public ImportMeshQueuelimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportMeshQueuelimitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportMeshQueuelimitRequest setList(java.util.List<QueueLimitValueDTO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueueLimitValueDTO> getList() {
        return this.list;
    }

    public ImportMeshQueuelimitRequest setLAlgorithm(String lAlgorithm) {
        this.lAlgorithm = lAlgorithm;
        return this;
    }
    public String getLAlgorithm() {
        return this.lAlgorithm;
    }

    public ImportMeshQueuelimitRequest setLOperation(String lOperation) {
        this.lOperation = lOperation;
        return this;
    }
    public String getLOperation() {
        return this.lOperation;
    }

    public ImportMeshQueuelimitRequest setMeth(String meth) {
        this.meth = meth;
        return this;
    }
    public String getMeth() {
        return this.meth;
    }

    public ImportMeshQueuelimitRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportMeshQueuelimitRequest setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public ImportMeshQueuelimitRequest setRMode(String rMode) {
        this.rMode = rMode;
        return this;
    }
    public String getRMode() {
        return this.rMode;
    }

    public ImportMeshQueuelimitRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

}
