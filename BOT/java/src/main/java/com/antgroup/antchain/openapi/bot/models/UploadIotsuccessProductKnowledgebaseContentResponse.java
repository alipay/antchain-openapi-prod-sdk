// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UploadIotsuccessProductKnowledgebaseContentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // 已有ai_knowledge_document.doc_id
    @NameInMap("doc_id")
    @Validation(required = true)
    public String docId;

    // 已有解析任务关联，接纳时可能尚未分配
    @NameInMap("parse_task_id")
    @Validation(required = true)
    public String parseTaskId;

    // 枚举:PENDING,PROCESSING,COMPLETED,FAILED
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 现有文档error_message，脱敏返回
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static UploadIotsuccessProductKnowledgebaseContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadIotsuccessProductKnowledgebaseContentResponse self = new UploadIotsuccessProductKnowledgebaseContentResponse();
        return TeaModel.build(map, self);
    }

    public UploadIotsuccessProductKnowledgebaseContentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadIotsuccessProductKnowledgebaseContentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadIotsuccessProductKnowledgebaseContentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadIotsuccessProductKnowledgebaseContentResponse setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public UploadIotsuccessProductKnowledgebaseContentResponse setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public UploadIotsuccessProductKnowledgebaseContentResponse setParseTaskId(String parseTaskId) {
        this.parseTaskId = parseTaskId;
        return this;
    }
    public String getParseTaskId() {
        return this.parseTaskId;
    }

    public UploadIotsuccessProductKnowledgebaseContentResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UploadIotsuccessProductKnowledgebaseContentResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
