// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsurancepolicyUniversalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 保单号
    @NameInMap("pol_no")
    public String polNo;

    // 电子保单下载地址
    @NameInMap("pol_url")
    public String polUrl;

    // 总保费
    @NameInMap("total_premium")
    public String totalPremium;

    // 订单号
    @NameInMap("trade_no")
    public String tradeNo;

    public static ApplyInsurancepolicyUniversalResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsurancepolicyUniversalResponse self = new ApplyInsurancepolicyUniversalResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInsurancepolicyUniversalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInsurancepolicyUniversalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInsurancepolicyUniversalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInsurancepolicyUniversalResponse setPolNo(String polNo) {
        this.polNo = polNo;
        return this;
    }
    public String getPolNo() {
        return this.polNo;
    }

    public ApplyInsurancepolicyUniversalResponse setPolUrl(String polUrl) {
        this.polUrl = polUrl;
        return this;
    }
    public String getPolUrl() {
        return this.polUrl;
    }

    public ApplyInsurancepolicyUniversalResponse setTotalPremium(String totalPremium) {
        this.totalPremium = totalPremium;
        return this;
    }
    public String getTotalPremium() {
        return this.totalPremium;
    }

    public ApplyInsurancepolicyUniversalResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
