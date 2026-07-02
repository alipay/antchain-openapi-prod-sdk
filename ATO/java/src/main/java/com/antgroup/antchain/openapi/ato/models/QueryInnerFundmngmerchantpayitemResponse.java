// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundmngmerchantpayitemResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户付款项目
    @NameInMap("payment_item")
    public String paymentItem;

    public static QueryInnerFundmngmerchantpayitemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundmngmerchantpayitemResponse self = new QueryInnerFundmngmerchantpayitemResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundmngmerchantpayitemResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerFundmngmerchantpayitemResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerFundmngmerchantpayitemResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerFundmngmerchantpayitemResponse setPaymentItem(String paymentItem) {
        this.paymentItem = paymentItem;
        return this;
    }
    public String getPaymentItem() {
        return this.paymentItem;
    }

}
