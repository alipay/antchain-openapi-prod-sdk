// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExecutorProgress extends TeaModel {
    // 请求 ID
    @NameInMap("request_id")
    public String requestId;

    // 请求 ID 列表
    @NameInMap("request_ids")
    public java.util.List<String> requestIds;

    // 状态
    @NameInMap("status")
    public String status;

    // 错误信息
    @NameInMap("result_msg")
    public String resultMsg;

    public static ExecutorProgress build(java.util.Map<String, ?> map) throws Exception {
        ExecutorProgress self = new ExecutorProgress();
        return TeaModel.build(map, self);
    }

    public ExecutorProgress setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecutorProgress setRequestIds(java.util.List<String> requestIds) {
        this.requestIds = requestIds;
        return this;
    }
    public java.util.List<String> getRequestIds() {
        return this.requestIds;
    }

    public ExecutorProgress setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExecutorProgress setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
