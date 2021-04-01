// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SyncMydidcommunWorkergroupGroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 计算集群明称
    @NameInMap("worker_group")
    @Validation(required = true)
    public String workerGroup;

    // 计算集群环境
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 执行状态上报
    @NameInMap("metrics")
    @Validation(required = true)
    public String metrics;

    // 执行器code
    @NameInMap("executor_list")
    @Validation(required = true)
    public java.util.List<String> executorList;

    // 主节点名
    @NameInMap("master_node")
    @Validation(required = true)
    public String masterNode;

    public static SyncMydidcommunWorkergroupGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMydidcommunWorkergroupGroupRequest self = new SyncMydidcommunWorkergroupGroupRequest();
        return TeaModel.build(map, self);
    }

    public SyncMydidcommunWorkergroupGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncMydidcommunWorkergroupGroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncMydidcommunWorkergroupGroupRequest setWorkerGroup(String workerGroup) {
        this.workerGroup = workerGroup;
        return this;
    }
    public String getWorkerGroup() {
        return this.workerGroup;
    }

    public SyncMydidcommunWorkergroupGroupRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public SyncMydidcommunWorkergroupGroupRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public SyncMydidcommunWorkergroupGroupRequest setExecutorList(java.util.List<String> executorList) {
        this.executorList = executorList;
        return this;
    }
    public java.util.List<String> getExecutorList() {
        return this.executorList;
    }

    public SyncMydidcommunWorkergroupGroupRequest setMasterNode(String masterNode) {
        this.masterNode = masterNode;
        return this;
    }
    public String getMasterNode() {
        return this.masterNode;
    }

}
