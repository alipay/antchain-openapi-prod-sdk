// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class FinishMydidcommunWorkergroupSyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 部署ID
    @NameInMap("pod_id")
    @Validation(required = true)
    public Long podId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    // 是否同步成功
    @NameInMap("is_success")
    @Validation(required = true)
    public Boolean isSuccess;

    // 处理消息
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    // 负责更新的节点名
    @NameInMap("master_node")
    @Validation(required = true)
    public String masterNode;

    public static FinishMydidcommunWorkergroupSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishMydidcommunWorkergroupSyncRequest self = new FinishMydidcommunWorkergroupSyncRequest();
        return TeaModel.build(map, self);
    }

    public FinishMydidcommunWorkergroupSyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishMydidcommunWorkergroupSyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishMydidcommunWorkergroupSyncRequest setPodId(Long podId) {
        this.podId = podId;
        return this;
    }
    public Long getPodId() {
        return this.podId;
    }

    public FinishMydidcommunWorkergroupSyncRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public FinishMydidcommunWorkergroupSyncRequest setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public FinishMydidcommunWorkergroupSyncRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public FinishMydidcommunWorkergroupSyncRequest setMasterNode(String masterNode) {
        this.masterNode = masterNode;
        return this;
    }
    public String getMasterNode() {
        return this.masterNode;
    }

}
