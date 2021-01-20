// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsTaskExecutionDetail extends TeaModel {
    // task_id
    @NameInMap("task_id")
    public String taskId;

    // request_token
    @NameInMap("request_token")
    public String requestToken;

    // node_id
    @NameInMap("node_id")
    public String nodeId;

    // request_id
    @NameInMap("request_id")
    public String requestId;

    // execution_count
    @NameInMap("execution_count")
    public Long executionCount;

    // executionState
    @NameInMap("execution_state")
    public String executionState;

    // target_id
    @NameInMap("target_id")
    public String targetId;

    // error_code
    @NameInMap("error_code")
    public String errorCode;

    // result_msg
    @NameInMap("result_msg")
    public String resultMsg;

    // startedTime
    @NameInMap("started_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String startedTime;

    // finished_time
    @NameInMap("finished_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String finishedTime;

    // standalone_executable
    @NameInMap("standalone_executable")
    public Boolean standaloneExecutable;

    // id
    @NameInMap("id")
    public String id;

    public static OpsTaskExecutionDetail build(java.util.Map<String, ?> map) throws Exception {
        OpsTaskExecutionDetail self = new OpsTaskExecutionDetail();
        return TeaModel.build(map, self);
    }

    public OpsTaskExecutionDetail setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OpsTaskExecutionDetail setRequestToken(String requestToken) {
        this.requestToken = requestToken;
        return this;
    }
    public String getRequestToken() {
        return this.requestToken;
    }

    public OpsTaskExecutionDetail setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public OpsTaskExecutionDetail setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpsTaskExecutionDetail setExecutionCount(Long executionCount) {
        this.executionCount = executionCount;
        return this;
    }
    public Long getExecutionCount() {
        return this.executionCount;
    }

    public OpsTaskExecutionDetail setExecutionState(String executionState) {
        this.executionState = executionState;
        return this;
    }
    public String getExecutionState() {
        return this.executionState;
    }

    public OpsTaskExecutionDetail setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public OpsTaskExecutionDetail setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OpsTaskExecutionDetail setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OpsTaskExecutionDetail setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public OpsTaskExecutionDetail setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public OpsTaskExecutionDetail setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public OpsTaskExecutionDetail setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
