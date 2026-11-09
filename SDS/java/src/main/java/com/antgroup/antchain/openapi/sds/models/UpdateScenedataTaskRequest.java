// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class UpdateScenedataTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 【批次号】submit接口返回的批次号
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 【异步任务上下线】INIT-初始化异步任务，异步任务开始执行，同时可以修改拓展参数，必须先下线才能初始化。INVALID-下线异步任务，停止异步任务执行。传空不修改。一次只能提一个任务状态变更。
    @NameInMap("async_task_status")
    @Validation(required = true)
    public String asyncTaskStatus;

    // 【拓展参数】下线后，可以修改拓展参数，再次上线后生效。处理该拓展参数的任务，需要对参数做校验，避免参数改动太大，任务恢复异常。
    @NameInMap("expect_condition")
    public java.util.List<BizNoCondition> expectCondition;

    public static UpdateScenedataTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScenedataTaskRequest self = new UpdateScenedataTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScenedataTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateScenedataTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateScenedataTaskRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public UpdateScenedataTaskRequest setAsyncTaskStatus(String asyncTaskStatus) {
        this.asyncTaskStatus = asyncTaskStatus;
        return this;
    }
    public String getAsyncTaskStatus() {
        return this.asyncTaskStatus;
    }

    public UpdateScenedataTaskRequest setExpectCondition(java.util.List<BizNoCondition> expectCondition) {
        this.expectCondition = expectCondition;
        return this;
    }
    public java.util.List<BizNoCondition> getExpectCondition() {
        return this.expectCondition;
    }

}
