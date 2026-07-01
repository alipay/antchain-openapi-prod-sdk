// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.txmzspu.models;

import com.aliyun.tea.*;

public class GetBlockchainBotIdsquaredOtpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 余量
    @NameInMap("remaining")
    public Long remaining;

    // provisionData
    @NameInMap("provision_data")
    public String provisionData;

    public static GetBlockchainBotIdsquaredOtpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainBotIdsquaredOtpResponse self = new GetBlockchainBotIdsquaredOtpResponse();
        return TeaModel.build(map, self);
    }

    public GetBlockchainBotIdsquaredOtpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetBlockchainBotIdsquaredOtpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetBlockchainBotIdsquaredOtpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetBlockchainBotIdsquaredOtpResponse setRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }
    public Long getRemaining() {
        return this.remaining;
    }

    public GetBlockchainBotIdsquaredOtpResponse setProvisionData(String provisionData) {
        this.provisionData = provisionData;
        return this;
    }
    public String getProvisionData() {
        return this.provisionData;
    }

}
