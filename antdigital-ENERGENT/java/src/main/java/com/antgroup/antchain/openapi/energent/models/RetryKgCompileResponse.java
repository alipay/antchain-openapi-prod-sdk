// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class RetryKgCompileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 编译任务ID
    @NameInMap("task_id")
    public String taskId;

    // 知识库ID
    @NameInMap("kb_id")
    public String kbId;

    // 关联文档ID
    @NameInMap("document_id")
    public String documentId;

    // 任务状态
    @NameInMap("status")
    public String status;

    // 已重试次数
    @NameInMap("retry_count")
    public Long retryCount;

    // 任务进度
    @NameInMap("progress")
    public Long progress;

    // 失败原因
    @NameInMap("failed_reason")
    public String failedReason;

    public static RetryKgCompileResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryKgCompileResponse self = new RetryKgCompileResponse();
        return TeaModel.build(map, self);
    }

    public RetryKgCompileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RetryKgCompileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryKgCompileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RetryKgCompileResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RetryKgCompileResponse setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public RetryKgCompileResponse setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public RetryKgCompileResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RetryKgCompileResponse setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Long getRetryCount() {
        return this.retryCount;
    }

    public RetryKgCompileResponse setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public RetryKgCompileResponse setFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }
    public String getFailedReason() {
        return this.failedReason;
    }

}
