// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveagent.models;

import com.aliyun.tea.*;

public class ImportTaskBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 批次号
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 导入名单列表
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<String> list;

    public static ImportTaskBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportTaskBatchRequest self = new ImportTaskBatchRequest();
        return TeaModel.build(map, self);
    }

    public ImportTaskBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportTaskBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportTaskBatchRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ImportTaskBatchRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public ImportTaskBatchRequest setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

}
