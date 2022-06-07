// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class QueryMerchantAgreementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 协议产品code
    @NameInMap("personal_product_code")
    public String personalProductCode;

    // 签约主体
    @NameInMap("merchant_user_id")
    public String merchantUserId;

    // 签约客户支付宝uid
    @NameInMap("customer_alipay_user_id")
    public String customerAlipayUserId;

    // 商户签约协议号
    @NameInMap("merchant_agreement_no")
    public String merchantAgreementNo;

    // 签约协议号，仅签约成功后有
    @NameInMap("agreement_no")
    public String agreementNo;

    // 实际签约时间，仅签约成功后有
    @NameInMap("sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signTime;

    // 实际生效时间，仅签约成功后有
    @NameInMap("valid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    // 实际失效时间，仅签约成功后有
    @NameInMap("invalid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invalidTime;

    // 协议状态
    // TEMP-暂存
    // NORMAL-正常
    // STOP-暂停
    @NameInMap("status")
    public String status;

    public static QueryMerchantAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantAgreementResponse self = new QueryMerchantAgreementResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantAgreementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantAgreementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantAgreementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantAgreementResponse setPersonalProductCode(String personalProductCode) {
        this.personalProductCode = personalProductCode;
        return this;
    }
    public String getPersonalProductCode() {
        return this.personalProductCode;
    }

    public QueryMerchantAgreementResponse setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public QueryMerchantAgreementResponse setCustomerAlipayUserId(String customerAlipayUserId) {
        this.customerAlipayUserId = customerAlipayUserId;
        return this;
    }
    public String getCustomerAlipayUserId() {
        return this.customerAlipayUserId;
    }

    public QueryMerchantAgreementResponse setMerchantAgreementNo(String merchantAgreementNo) {
        this.merchantAgreementNo = merchantAgreementNo;
        return this;
    }
    public String getMerchantAgreementNo() {
        return this.merchantAgreementNo;
    }

    public QueryMerchantAgreementResponse setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public QueryMerchantAgreementResponse setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public QueryMerchantAgreementResponse setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public QueryMerchantAgreementResponse setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public QueryMerchantAgreementResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
