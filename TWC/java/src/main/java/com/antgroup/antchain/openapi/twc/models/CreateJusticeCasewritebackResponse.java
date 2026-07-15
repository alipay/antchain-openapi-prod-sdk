// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateJusticeCasewritebackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建成功状态
    // success, fail
    @NameInMap("create_status")
    public String createStatus;

    // 创建状态说明
    @NameInMap("create_status_message")
    public String createStatusMessage;

    // 创建时间（如创建成功，则返回创建日期时间）
    @NameInMap("create_time")
    public String createTime;

    // 业务来源主键
    @NameInMap("input_source_id")
    public String inputSourceId;

    // 案件ID
    @NameInMap("case_id")
    public String caseId;

    // 业务码 0表示成功
    @NameInMap("code")
    public Long code;

    // 业务码描述
    @NameInMap("message")
    public String message;

    public static CreateJusticeCasewritebackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJusticeCasewritebackResponse self = new CreateJusticeCasewritebackResponse();
        return TeaModel.build(map, self);
    }

    public CreateJusticeCasewritebackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateJusticeCasewritebackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateJusticeCasewritebackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateJusticeCasewritebackResponse setCreateStatus(String createStatus) {
        this.createStatus = createStatus;
        return this;
    }
    public String getCreateStatus() {
        return this.createStatus;
    }

    public CreateJusticeCasewritebackResponse setCreateStatusMessage(String createStatusMessage) {
        this.createStatusMessage = createStatusMessage;
        return this;
    }
    public String getCreateStatusMessage() {
        return this.createStatusMessage;
    }

    public CreateJusticeCasewritebackResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateJusticeCasewritebackResponse setInputSourceId(String inputSourceId) {
        this.inputSourceId = inputSourceId;
        return this;
    }
    public String getInputSourceId() {
        return this.inputSourceId;
    }

    public CreateJusticeCasewritebackResponse setCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }
    public String getCaseId() {
        return this.caseId;
    }

    public CreateJusticeCasewritebackResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateJusticeCasewritebackResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
