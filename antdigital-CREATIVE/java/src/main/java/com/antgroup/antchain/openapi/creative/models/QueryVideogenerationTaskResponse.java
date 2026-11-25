// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class QueryVideogenerationTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务id
    @NameInMap("task_id")
    public String taskId;

    // 状态
    @NameInMap("status")
    public String status;

    // 模型
    @NameInMap("model")
    public String model;

    // 错误原因编码
    @NameInMap("error_code")
    public String errorCode;

    // 错误原因详情
    @NameInMap("error_message")
    public String errorMessage;

    // 供应商任务id
    @NameInMap("id")
    public String id;

    // 供应商原始快照
    @NameInMap("original_snapshot")
    public String originalSnapshot;

    public static QueryVideogenerationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideogenerationTaskResponse self = new QueryVideogenerationTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideogenerationTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryVideogenerationTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryVideogenerationTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryVideogenerationTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryVideogenerationTaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryVideogenerationTaskResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public QueryVideogenerationTaskResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryVideogenerationTaskResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryVideogenerationTaskResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryVideogenerationTaskResponse setOriginalSnapshot(String originalSnapshot) {
        this.originalSnapshot = originalSnapshot;
        return this;
    }
    public String getOriginalSnapshot() {
        return this.originalSnapshot;
    }

}
