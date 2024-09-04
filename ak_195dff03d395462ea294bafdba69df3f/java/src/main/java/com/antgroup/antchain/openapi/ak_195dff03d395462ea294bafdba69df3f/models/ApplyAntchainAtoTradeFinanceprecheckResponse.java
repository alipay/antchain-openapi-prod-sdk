// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class ApplyAntchainAtoTradeFinanceprecheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // ● EXEMPTION ： 资方免预审
    // ● SUBMIT_SUCCESS: 异步预审提交成功
    @NameInMap("response_data")
    public String responseData;

    // order_id
    @NameInMap("order_id")
    public String orderId;

    // merchant_id
    @NameInMap("merchant_id")
    public String merchantId;

    public static ApplyAntchainAtoTradeFinanceprecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntchainAtoTradeFinanceprecheckResponse self = new ApplyAntchainAtoTradeFinanceprecheckResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAntchainAtoTradeFinanceprecheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyAntchainAtoTradeFinanceprecheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyAntchainAtoTradeFinanceprecheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyAntchainAtoTradeFinanceprecheckResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

    public ApplyAntchainAtoTradeFinanceprecheckResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ApplyAntchainAtoTradeFinanceprecheckResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
