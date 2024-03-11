// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31dc9f55b9684fe29acc7c0125a5d7a2.models;

import com.aliyun.tea.*;

public class QueryAntcloudAdomAppmarketPrivacyresultResponse extends TeaModel {
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

    public static QueryAntcloudAdomAppmarketPrivacyresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudAdomAppmarketPrivacyresultResponse self = new QueryAntcloudAdomAppmarketPrivacyresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudAdomAppmarketPrivacyresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudAdomAppmarketPrivacyresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudAdomAppmarketPrivacyresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudAdomAppmarketPrivacyresultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntcloudAdomAppmarketPrivacyresultResponse setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
        return this;
    }
    public String getResultUrl() {
        return this.resultUrl;
    }

    public QueryAntcloudAdomAppmarketPrivacyresultResponse setFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }
    public String getFailedReason() {
        return this.failedReason;
    }

    public QueryAntcloudAdomAppmarketPrivacyresultResponse setStructOutput(String structOutput) {
        this.structOutput = structOutput;
        return this;
    }
    public String getStructOutput() {
        return this.structOutput;
    }

}
