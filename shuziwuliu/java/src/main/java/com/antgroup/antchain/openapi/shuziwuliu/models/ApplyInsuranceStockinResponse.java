// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceStockinResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 入库交易流水号
    @NameInMap("trade_no")
    public String tradeNo;

    // 入库单号
    // 
    // 
    @NameInMap("stockin_no")
    public String stockinNo;

    public static ApplyInsuranceStockinResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceStockinResponse self = new ApplyInsuranceStockinResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceStockinResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInsuranceStockinResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInsuranceStockinResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInsuranceStockinResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceStockinResponse setStockinNo(String stockinNo) {
        this.stockinNo = stockinNo;
        return this;
    }
    public String getStockinNo() {
        return this.stockinNo;
    }

}
