// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class QueryAppmarketPrivacyresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 隐私计算模型执行状态
    @NameInMap("status")
    public String status;

    // 结果文件路径
    @NameInMap("result_url")
    public String resultUrl;

    // 失败的原因
    @NameInMap("failed_reason")
    public String failedReason;

    // 结构化出参
    @NameInMap("struct_output")
    public String structOutput;

    public static QueryAppmarketPrivacyresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppmarketPrivacyresultResponse self = new QueryAppmarketPrivacyresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppmarketPrivacyresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppmarketPrivacyresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppmarketPrivacyresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppmarketPrivacyresultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAppmarketPrivacyresultResponse setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
        return this;
    }
    public String getResultUrl() {
        return this.resultUrl;
    }

    public QueryAppmarketPrivacyresultResponse setFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }
    public String getFailedReason() {
        return this.failedReason;
    }

    public QueryAppmarketPrivacyresultResponse setStructOutput(String structOutput) {
        this.structOutput = structOutput;
        return this;
    }
    public String getStructOutput() {
        return this.structOutput;
    }

}
