// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b4701282be84b0587b5ee8a3767a528.models;

import com.aliyun.tea.*;

public class CheckAntchainDefincashierSaasPaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易前检查结果
    @NameInMap("data")
    public PaymentCreateCheckResult data;

    public static CheckAntchainDefincashierSaasPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAntchainDefincashierSaasPaymentResponse self = new CheckAntchainDefincashierSaasPaymentResponse();
        return TeaModel.build(map, self);
    }

    public CheckAntchainDefincashierSaasPaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckAntchainDefincashierSaasPaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckAntchainDefincashierSaasPaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckAntchainDefincashierSaasPaymentResponse setData(PaymentCreateCheckResult data) {
        this.data = data;
        return this;
    }
    public PaymentCreateCheckResult getData() {
        return this.data;
    }

}
