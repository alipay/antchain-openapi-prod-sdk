// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class TwoAntchainDasKyaRealenterprisev2Response extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 要素是否匹配
    @NameInMap("matched")
    @Validation(required = true)
    public Boolean matched;

    public static TwoAntchainDasKyaRealenterprisev2Response build(java.util.Map<String, ?> map) throws Exception {
        TwoAntchainDasKyaRealenterprisev2Response self = new TwoAntchainDasKyaRealenterprisev2Response();
        return TeaModel.build(map, self);
    }

    public TwoAntchainDasKyaRealenterprisev2Response setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TwoAntchainDasKyaRealenterprisev2Response setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TwoAntchainDasKyaRealenterprisev2Response setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TwoAntchainDasKyaRealenterprisev2Response setMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    public Boolean getMatched() {
        return this.matched;
    }

}
