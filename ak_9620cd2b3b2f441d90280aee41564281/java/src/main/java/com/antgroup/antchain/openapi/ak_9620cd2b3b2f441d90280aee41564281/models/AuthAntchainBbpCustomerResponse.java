// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9620cd2b3b2f441d90280aee41564281.models;

import com.aliyun.tea.*;

public class AuthAntchainBbpCustomerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客户认证结果
    @NameInMap("result")
    public CustomerAuthResult result;

    public static AuthAntchainBbpCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthAntchainBbpCustomerResponse self = new AuthAntchainBbpCustomerResponse();
        return TeaModel.build(map, self);
    }

    public AuthAntchainBbpCustomerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthAntchainBbpCustomerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthAntchainBbpCustomerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthAntchainBbpCustomerResponse setResult(CustomerAuthResult result) {
        this.result = result;
        return this;
    }
    public CustomerAuthResult getResult() {
        return this.result;
    }

}
