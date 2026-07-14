// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class ApplyFinanceBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 身份识别号（一级）
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 业务产品码（二级）
    @NameInMap("biz_pd_code")
    @Validation(required = true)
    public String bizPdCode;

    // 业务事件码（三级）
    @NameInMap("biz_event_code")
    @Validation(required = true)
    public String bizEventCode;

    // 外部单据号（唯一幂等号）
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 来源系统
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 业务发生时间
    @NameInMap("gmt_service")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtService;

    // 应收时间
    @NameInMap("gmt_receive")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtReceive;

    // 支付时间
    @NameInMap("gmt_pay")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtPay;

    // 账单金额
    @NameInMap("bill_amount")
    @Validation(required = true)
    public MultiCurrencyMoney billAmount;

    // 实收金额
    @NameInMap("received_amount")
    public MultiCurrencyMoney receivedAmount;

    // 结算签约信息
    @NameInMap("settle_sign_info")
    @Validation(required = true)
    public SettleSignInfo settleSignInfo;

    // 结算用户信息
    @NameInMap("settle_user_info")
    @Validation(required = true)
    public SettleUserInfo settleUserInfo;

    // 摊销计划信息
    @NameInMap("amortization_info")
    public AmortizationInfo amortizationInfo;

    // 拓展参数
    @NameInMap("properties")
    public java.util.List<MapEntry> properties;

    public static ApplyFinanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFinanceBillRequest self = new ApplyFinanceBillRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFinanceBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyFinanceBillRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public ApplyFinanceBillRequest setBizPdCode(String bizPdCode) {
        this.bizPdCode = bizPdCode;
        return this;
    }
    public String getBizPdCode() {
        return this.bizPdCode;
    }

    public ApplyFinanceBillRequest setBizEventCode(String bizEventCode) {
        this.bizEventCode = bizEventCode;
        return this;
    }
    public String getBizEventCode() {
        return this.bizEventCode;
    }

    public ApplyFinanceBillRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public ApplyFinanceBillRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApplyFinanceBillRequest setGmtService(String gmtService) {
        this.gmtService = gmtService;
        return this;
    }
    public String getGmtService() {
        return this.gmtService;
    }

    public ApplyFinanceBillRequest setGmtReceive(String gmtReceive) {
        this.gmtReceive = gmtReceive;
        return this;
    }
    public String getGmtReceive() {
        return this.gmtReceive;
    }

    public ApplyFinanceBillRequest setGmtPay(String gmtPay) {
        this.gmtPay = gmtPay;
        return this;
    }
    public String getGmtPay() {
        return this.gmtPay;
    }

    public ApplyFinanceBillRequest setBillAmount(MultiCurrencyMoney billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public MultiCurrencyMoney getBillAmount() {
        return this.billAmount;
    }

    public ApplyFinanceBillRequest setReceivedAmount(MultiCurrencyMoney receivedAmount) {
        this.receivedAmount = receivedAmount;
        return this;
    }
    public MultiCurrencyMoney getReceivedAmount() {
        return this.receivedAmount;
    }

    public ApplyFinanceBillRequest setSettleSignInfo(SettleSignInfo settleSignInfo) {
        this.settleSignInfo = settleSignInfo;
        return this;
    }
    public SettleSignInfo getSettleSignInfo() {
        return this.settleSignInfo;
    }

    public ApplyFinanceBillRequest setSettleUserInfo(SettleUserInfo settleUserInfo) {
        this.settleUserInfo = settleUserInfo;
        return this;
    }
    public SettleUserInfo getSettleUserInfo() {
        return this.settleUserInfo;
    }

    public ApplyFinanceBillRequest setAmortizationInfo(AmortizationInfo amortizationInfo) {
        this.amortizationInfo = amortizationInfo;
        return this;
    }
    public AmortizationInfo getAmortizationInfo() {
        return this.amortizationInfo;
    }

    public ApplyFinanceBillRequest setProperties(java.util.List<MapEntry> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<MapEntry> getProperties() {
        return this.properties;
    }

}
