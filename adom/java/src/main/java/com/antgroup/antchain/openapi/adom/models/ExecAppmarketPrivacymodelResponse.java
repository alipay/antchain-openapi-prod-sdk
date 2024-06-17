// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class ExecAppmarketPrivacymodelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行状态
    @NameInMap("status")
    public String status;

    // 结果文件url
    @NameInMap("result_url")
    public String resultUrl;

    // 执行失败原因
    @NameInMap("failed_reason")
    public String failedReason;

    // 结构化出参
    @NameInMap("struct_output")
    public String structOutput;

    public static ExecAppmarketPrivacymodelResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAppmarketPrivacymodelResponse self = new ExecAppmarketPrivacymodelResponse();
        return TeaModel.build(map, self);
    }

    public ExecAppmarketPrivacymodelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAppmarketPrivacymodelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAppmarketPrivacymodelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAppmarketPrivacymodelResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExecAppmarketPrivacymodelResponse setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
        return this;
    }
    public String getResultUrl() {
        return this.resultUrl;
    }

    public ExecAppmarketPrivacymodelResponse setFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }
    public String getFailedReason() {
        return this.failedReason;
    }

    public ExecAppmarketPrivacymodelResponse setStructOutput(String structOutput) {
        this.structOutput = structOutput;
        return this;
    }
    public String getStructOutput() {
        return this.structOutput;
    }

}
