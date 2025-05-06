// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetEmbedcardUrlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易流水号
    @NameInMap("trade_no")
    public String tradeNo;

    // 险种编码
    @NameInMap("insurance_type_code")
    public String insuranceTypeCode;

    // 保司编码
    @NameInMap("insurance_company_no")
    public String insuranceCompanyNo;

    // 嵌入式产品编码
    @NameInMap("embed_product_code")
    public String embedProductCode;

    // 嵌入式产品URL地址
    @NameInMap("embed_product_url")
    public String embedProductUrl;

    // 方案名称
    @NameInMap("scheme_name")
    public String schemeName;

    // 保费
    @NameInMap("premium")
    public String premium;

    // 询价编码
    @NameInMap("inquiry_no")
    public String inquiryNo;

    public static GetEmbedcardUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmbedcardUrlResponse self = new GetEmbedcardUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetEmbedcardUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetEmbedcardUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetEmbedcardUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetEmbedcardUrlResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public GetEmbedcardUrlResponse setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
        return this;
    }
    public String getInsuranceTypeCode() {
        return this.insuranceTypeCode;
    }

    public GetEmbedcardUrlResponse setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public GetEmbedcardUrlResponse setEmbedProductCode(String embedProductCode) {
        this.embedProductCode = embedProductCode;
        return this;
    }
    public String getEmbedProductCode() {
        return this.embedProductCode;
    }

    public GetEmbedcardUrlResponse setEmbedProductUrl(String embedProductUrl) {
        this.embedProductUrl = embedProductUrl;
        return this;
    }
    public String getEmbedProductUrl() {
        return this.embedProductUrl;
    }

    public GetEmbedcardUrlResponse setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public GetEmbedcardUrlResponse setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public GetEmbedcardUrlResponse setInquiryNo(String inquiryNo) {
        this.inquiryNo = inquiryNo;
        return this;
    }
    public String getInquiryNo() {
        return this.inquiryNo;
    }

}
