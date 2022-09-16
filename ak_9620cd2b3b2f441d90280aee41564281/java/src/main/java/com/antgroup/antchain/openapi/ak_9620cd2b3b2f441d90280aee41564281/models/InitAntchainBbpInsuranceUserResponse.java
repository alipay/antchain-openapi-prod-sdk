// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9620cd2b3b2f441d90280aee41564281.models;

import com.aliyun.tea.*;

public class InitAntchainBbpInsuranceUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static InitAntchainBbpInsuranceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainBbpInsuranceUserResponse self = new InitAntchainBbpInsuranceUserResponse();
        return TeaModel.build(map, self);
    }

    public InitAntchainBbpInsuranceUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitAntchainBbpInsuranceUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitAntchainBbpInsuranceUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
