// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceCbrfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 投保响应编码
    @NameInMap("insured_receipt_no")
    public String insuredReceiptNo;

    // 投保时的标的订单号
    @NameInMap("related_order_no")
    public String relatedOrderNo;

    // 保司出具的保单编号
    @NameInMap("policy_no")
    public String policyNo;

    // 返回时间
    @NameInMap("response_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String responseTime;

    // 幂等标识；true:幂等结果；false: 非幂等结果
    @NameInMap("idem_flag")
    public Boolean idemFlag;

    public static ApplyInsuranceCbrfResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceCbrfResponse self = new ApplyInsuranceCbrfResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceCbrfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInsuranceCbrfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInsuranceCbrfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInsuranceCbrfResponse setInsuredReceiptNo(String insuredReceiptNo) {
        this.insuredReceiptNo = insuredReceiptNo;
        return this;
    }
    public String getInsuredReceiptNo() {
        return this.insuredReceiptNo;
    }

    public ApplyInsuranceCbrfResponse setRelatedOrderNo(String relatedOrderNo) {
        this.relatedOrderNo = relatedOrderNo;
        return this;
    }
    public String getRelatedOrderNo() {
        return this.relatedOrderNo;
    }

    public ApplyInsuranceCbrfResponse setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public ApplyInsuranceCbrfResponse setResponseTime(String responseTime) {
        this.responseTime = responseTime;
        return this;
    }
    public String getResponseTime() {
        return this.responseTime;
    }

    public ApplyInsuranceCbrfResponse setIdemFlag(Boolean idemFlag) {
        this.idemFlag = idemFlag;
        return this;
    }
    public Boolean getIdemFlag() {
        return this.idemFlag;
    }

}
