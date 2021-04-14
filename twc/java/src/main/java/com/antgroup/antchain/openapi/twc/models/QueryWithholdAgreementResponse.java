// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryWithholdAgreementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总授信金额
    @NameInMap("credit_amount")
    public String creditAmount;

    // 商家的支付宝uid
    @NameInMap("merchant_id")
    public String merchantId;

    // 商户名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 商户的服务名称
    @NameInMap("merchant_service_name")
    public String merchantServiceName;

    // 姓名身份证号拼接后的hash
    @NameInMap("name_cert_hash")
    public String nameCertHash;

    // 还款计划的超链接
    @NameInMap("repayment_url")
    public String repaymentUrl;

    // 协议的状态，如果签署成功返回success,未签是空
    @NameInMap("status")
    public String status;

    // 第三方的用户id
    @NameInMap("third_party_id")
    public String thirdPartyId;

    // 商家请求的协议号
    @NameInMap("external_agreement_no")
    public String externalAgreementNo;

    public static QueryWithholdAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdAgreementResponse self = new QueryWithholdAgreementResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithholdAgreementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWithholdAgreementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWithholdAgreementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWithholdAgreementResponse setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public QueryWithholdAgreementResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryWithholdAgreementResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QueryWithholdAgreementResponse setMerchantServiceName(String merchantServiceName) {
        this.merchantServiceName = merchantServiceName;
        return this;
    }
    public String getMerchantServiceName() {
        return this.merchantServiceName;
    }

    public QueryWithholdAgreementResponse setNameCertHash(String nameCertHash) {
        this.nameCertHash = nameCertHash;
        return this;
    }
    public String getNameCertHash() {
        return this.nameCertHash;
    }

    public QueryWithholdAgreementResponse setRepaymentUrl(String repaymentUrl) {
        this.repaymentUrl = repaymentUrl;
        return this;
    }
    public String getRepaymentUrl() {
        return this.repaymentUrl;
    }

    public QueryWithholdAgreementResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryWithholdAgreementResponse setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public QueryWithholdAgreementResponse setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

}
