// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class SubmitAmlcloudAnalyzeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Unique business ID for tracing purposes
    @NameInMap("request_id")
    public String requestId;

    // Screening decisions: 
    // 
    // ACCEPT: Did not hit any watchlist
    // 
    // REJECT: Hit some watchlists
    // 
    // REVIEW: Potentially hit some watchlists
    @NameInMap("decision")
    public String decision;

    // Hit details
    @NameInMap("hit_results")
    public HitResults hitResults;

    public static SubmitAmlcloudAnalyzeResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAmlcloudAnalyzeResponse self = new SubmitAmlcloudAnalyzeResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAmlcloudAnalyzeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAmlcloudAnalyzeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAmlcloudAnalyzeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAmlcloudAnalyzeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAmlcloudAnalyzeResponse setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public SubmitAmlcloudAnalyzeResponse setHitResults(HitResults hitResults) {
        this.hitResults = hitResults;
        return this;
    }
    public HitResults getHitResults() {
        return this.hitResults;
    }

}
