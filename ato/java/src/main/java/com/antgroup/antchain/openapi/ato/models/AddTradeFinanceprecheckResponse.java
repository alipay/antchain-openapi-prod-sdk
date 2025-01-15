// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AddTradeFinanceprecheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // merchant_id
    @NameInMap("merchant_id")
    public String merchantId;

    // order_id
    @NameInMap("order_id")
    public String orderId;

    // fund_candidates
    // List<FundCompanyInfo> 的jsonArray.toString
    @NameInMap("fund_candidates")
    public String fundCandidates;

    public static AddTradeFinanceprecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTradeFinanceprecheckResponse self = new AddTradeFinanceprecheckResponse();
        return TeaModel.build(map, self);
    }

    public AddTradeFinanceprecheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddTradeFinanceprecheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddTradeFinanceprecheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddTradeFinanceprecheckResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AddTradeFinanceprecheckResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AddTradeFinanceprecheckResponse setFundCandidates(String fundCandidates) {
        this.fundCandidates = fundCandidates;
        return this;
    }
    public String getFundCandidates() {
        return this.fundCandidates;
    }

}
