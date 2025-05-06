// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class IssueEmbedcardPaysucResponse extends TeaModel {
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

    // 方案名称
    @NameInMap("scheme_name")
    public String schemeName;

    // 保险起期
    @NameInMap("insure_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureStart;

    // 保险止期
    @NameInMap("insure_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureEnd;

    // 保费，保留2位小数
    @NameInMap("premium")
    public String premium;

    // 保额，保留2位小数
    @NameInMap("amount")
    public String amount;

    // 询价编码
    @NameInMap("inquiry_no")
    public String inquiryNo;

    // 保险凭证号
    @NameInMap("voucher_no")
    public String voucherNo;

    public static IssueEmbedcardPaysucResponse build(java.util.Map<String, ?> map) throws Exception {
        IssueEmbedcardPaysucResponse self = new IssueEmbedcardPaysucResponse();
        return TeaModel.build(map, self);
    }

    public IssueEmbedcardPaysucResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public IssueEmbedcardPaysucResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IssueEmbedcardPaysucResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public IssueEmbedcardPaysucResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public IssueEmbedcardPaysucResponse setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
        return this;
    }
    public String getInsuranceTypeCode() {
        return this.insuranceTypeCode;
    }

    public IssueEmbedcardPaysucResponse setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public IssueEmbedcardPaysucResponse setEmbedProductCode(String embedProductCode) {
        this.embedProductCode = embedProductCode;
        return this;
    }
    public String getEmbedProductCode() {
        return this.embedProductCode;
    }

    public IssueEmbedcardPaysucResponse setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public IssueEmbedcardPaysucResponse setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public IssueEmbedcardPaysucResponse setInsureEnd(String insureEnd) {
        this.insureEnd = insureEnd;
        return this;
    }
    public String getInsureEnd() {
        return this.insureEnd;
    }

    public IssueEmbedcardPaysucResponse setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public IssueEmbedcardPaysucResponse setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public IssueEmbedcardPaysucResponse setInquiryNo(String inquiryNo) {
        this.inquiryNo = inquiryNo;
        return this;
    }
    public String getInquiryNo() {
        return this.inquiryNo;
    }

    public IssueEmbedcardPaysucResponse setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
        return this;
    }
    public String getVoucherNo() {
        return this.voucherNo;
    }

}
