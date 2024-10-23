// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerInsuresignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 保司社会统一信用代码
    @NameInMap("insure_merchant_id")
    public String insureMerchantId;

    // 外部代扣协议号
    @NameInMap("external_agreement_no")
    public String externalAgreementNo;

    // 合同未签署：CONTRACT_UN_SIGNED
    // 合同已签署：CONTRACT_SIGNED
    // 代扣已签署：WITHHOLD_SIGNED
    // 代扣已解约：WITHHOLD_UN_SIGNED
    @NameInMap("status")
    public String status;

    public static QueryInnerInsuresignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerInsuresignResponse self = new QueryInnerInsuresignResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerInsuresignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerInsuresignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerInsuresignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerInsuresignResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryInnerInsuresignResponse setInsureMerchantId(String insureMerchantId) {
        this.insureMerchantId = insureMerchantId;
        return this;
    }
    public String getInsureMerchantId() {
        return this.insureMerchantId;
    }

    public QueryInnerInsuresignResponse setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public QueryInnerInsuresignResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
