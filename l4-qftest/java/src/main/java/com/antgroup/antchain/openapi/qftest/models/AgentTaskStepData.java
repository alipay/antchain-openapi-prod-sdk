// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class AgentTaskStepData extends TeaModel {
    // 步骤id
    /**
     * <strong>example:</strong>
     * <p>步骤id</p>
     */
    @NameInMap("step_id")
    @Validation(required = true)
    public String stepId;

    // 步骤名称
    /**
     * <strong>example:</strong>
     * <p>步骤名称</p>
     */
    @NameInMap("step_name")
    @Validation(required = true)
    public String stepName;

    //  PENDING,  RUNNING,COMPLETED,TERMINATED,FAILED
    /**
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-31 00:00:00</p>
     */
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    // 关联的消息id
    /**
     * <strong>example:</strong>
     * <p>关联的消息id</p>
     */
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 关联的异步任务id
    /**
     * <strong>example:</strong>
     * <p>关联的异步任务id</p>
     */
    @NameInMap("job_id")
    @Validation(required = true)
    public String jobId;

    // 异步任务结果
    /**
     * <strong>example:</strong>
     * <p>异步任务结果</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 异步任务已读标识
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("message_flag")
    @Validation(required = true)
    public Boolean messageFlag;

    public static AgentTaskStepData build(java.util.Map<String, ?> map) throws Exception {
        AgentTaskStepData self = new AgentTaskStepData();
        return TeaModel.build(map, self);
    }

    public AgentTaskStepData setStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }
    public String getStepId() {
        return this.stepId;
    }

    public AgentTaskStepData setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public AgentTaskStepData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgentTaskStepData setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public AgentTaskStepData setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public AgentTaskStepData setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AgentTaskStepData setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public AgentTaskStepData setMessageFlag(Boolean messageFlag) {
        this.messageFlag = messageFlag;
        return this;
    }
    public Boolean getMessageFlag() {
        return this.messageFlag;
    }

}
