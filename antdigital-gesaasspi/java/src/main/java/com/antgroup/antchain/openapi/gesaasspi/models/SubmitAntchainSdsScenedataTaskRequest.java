// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class SubmitAntchainSdsScenedataTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 【场景】约定的场景枚举
    @NameInMap("scene")
    @Validation(required = true, maxLength = 32)
    public String scene;

    // 【业务号类型】该字段逐步废弃，枚举-PHONE_SHA1，PHONE_MD5
    @NameInMap("biz_no_type")
    @Validation(maxLength = 32)
    public String bizNoType;

    // 【来源标识】适配客户的来源，可能是客户的任务/AK
    @NameInMap("source_mark")
    @Validation(maxLength = 32)
    public String sourceMark;

    // 【动态参数】任务动态参数信息
    @NameInMap("expect_condition")
    public java.util.List<BizNoCondition> expectCondition;

    // 【外部批次号】和任务类型组成唯一键
    @NameInMap("out_batch_no")
    public String outBatchNo;

    // 【任务类型】SDS根据类型触发异步处理流程
    @NameInMap("task_type")
    public String taskType;

    public static SubmitAntchainSdsScenedataTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainSdsScenedataTaskRequest self = new SubmitAntchainSdsScenedataTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainSdsScenedataTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntchainSdsScenedataTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAntchainSdsScenedataTaskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitAntchainSdsScenedataTaskRequest setBizNoType(String bizNoType) {
        this.bizNoType = bizNoType;
        return this;
    }
    public String getBizNoType() {
        return this.bizNoType;
    }

    public SubmitAntchainSdsScenedataTaskRequest setSourceMark(String sourceMark) {
        this.sourceMark = sourceMark;
        return this;
    }
    public String getSourceMark() {
        return this.sourceMark;
    }

    public SubmitAntchainSdsScenedataTaskRequest setExpectCondition(java.util.List<BizNoCondition> expectCondition) {
        this.expectCondition = expectCondition;
        return this;
    }
    public java.util.List<BizNoCondition> getExpectCondition() {
        return this.expectCondition;
    }

    public SubmitAntchainSdsScenedataTaskRequest setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo;
        return this;
    }
    public String getOutBatchNo() {
        return this.outBatchNo;
    }

    public SubmitAntchainSdsScenedataTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
