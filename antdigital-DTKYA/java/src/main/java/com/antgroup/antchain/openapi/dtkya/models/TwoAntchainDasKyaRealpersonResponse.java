// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class TwoAntchainDasKyaRealpersonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 调用方业务请求号，重试时沿用
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 要素是否匹配
    @NameInMap("matched")
    @Validation(required = true)
    public Boolean matched;

    public static TwoAntchainDasKyaRealpersonResponse build(java.util.Map<String, ?> map) throws Exception {
        TwoAntchainDasKyaRealpersonResponse self = new TwoAntchainDasKyaRealpersonResponse();
        return TeaModel.build(map, self);
    }

    public TwoAntchainDasKyaRealpersonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TwoAntchainDasKyaRealpersonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TwoAntchainDasKyaRealpersonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TwoAntchainDasKyaRealpersonResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TwoAntchainDasKyaRealpersonResponse setMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    public Boolean getMatched() {
        return this.matched;
    }

}
