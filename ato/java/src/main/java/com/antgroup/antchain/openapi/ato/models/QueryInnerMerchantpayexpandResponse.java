// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMerchantpayexpandResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 公司信息
    @NameInMap("company_info")
    public CompanyInfo companyInfo;

    // 法人信息
    @NameInMap("legal_info")
    public LegalInfo legalInfo;

    // 应用信息
    @NameInMap("application_info")
    public ApplicationInfo applicationInfo;

    // 审核列表
    @NameInMap("audit_infos")
    public java.util.List<AuditInfo> auditInfos;

    // 进件流水号
    @NameInMap("pay_expand_id")
    public String payExpandId;

    // 进件模式 DIRECT(直连进件) AGENT(代理进件)
    @NameInMap("expand_mode")
    public String expandMode;

    // INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
    @NameInMap("expand_status")
    public String expandStatus;

    // 进件失败描述
    @NameInMap("expand_fail_reason")
    public String expandFailReason;

    // 是否展示客服信息登记入口
    @NameInMap("show_customer_service_banner")
    public Boolean showCustomerServiceBanner;

    // 是否直付通进件已成功
    // 用于前端判断进件成功之后用户修改操作
    @NameInMap("zft_expand_successful")
    public Boolean zftExpandSuccessful;

    // 京东商户控股信息
    @NameInMap("merchant_holding_info")
    public MerchantHoldingInfo merchantHoldingInfo;

    // 京东商户结算信息
    @NameInMap("merchant_settle_info")
    public MerchantSettleInfo merchantSettleInfo;

    // 支付渠道
    // JDPAY
    // ALIPAY
    @NameInMap("pay_channel")
    public String payChannel;

    public static QueryInnerMerchantpayexpandResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMerchantpayexpandResponse self = new QueryInnerMerchantpayexpandResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerMerchantpayexpandResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerMerchantpayexpandResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerMerchantpayexpandResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerMerchantpayexpandResponse setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }
    public CompanyInfo getCompanyInfo() {
        return this.companyInfo;
    }

    public QueryInnerMerchantpayexpandResponse setLegalInfo(LegalInfo legalInfo) {
        this.legalInfo = legalInfo;
        return this;
    }
    public LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public QueryInnerMerchantpayexpandResponse setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public QueryInnerMerchantpayexpandResponse setAuditInfos(java.util.List<AuditInfo> auditInfos) {
        this.auditInfos = auditInfos;
        return this;
    }
    public java.util.List<AuditInfo> getAuditInfos() {
        return this.auditInfos;
    }

    public QueryInnerMerchantpayexpandResponse setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

    public QueryInnerMerchantpayexpandResponse setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

    public QueryInnerMerchantpayexpandResponse setExpandStatus(String expandStatus) {
        this.expandStatus = expandStatus;
        return this;
    }
    public String getExpandStatus() {
        return this.expandStatus;
    }

    public QueryInnerMerchantpayexpandResponse setExpandFailReason(String expandFailReason) {
        this.expandFailReason = expandFailReason;
        return this;
    }
    public String getExpandFailReason() {
        return this.expandFailReason;
    }

    public QueryInnerMerchantpayexpandResponse setShowCustomerServiceBanner(Boolean showCustomerServiceBanner) {
        this.showCustomerServiceBanner = showCustomerServiceBanner;
        return this;
    }
    public Boolean getShowCustomerServiceBanner() {
        return this.showCustomerServiceBanner;
    }

    public QueryInnerMerchantpayexpandResponse setZftExpandSuccessful(Boolean zftExpandSuccessful) {
        this.zftExpandSuccessful = zftExpandSuccessful;
        return this;
    }
    public Boolean getZftExpandSuccessful() {
        return this.zftExpandSuccessful;
    }

    public QueryInnerMerchantpayexpandResponse setMerchantHoldingInfo(MerchantHoldingInfo merchantHoldingInfo) {
        this.merchantHoldingInfo = merchantHoldingInfo;
        return this;
    }
    public MerchantHoldingInfo getMerchantHoldingInfo() {
        return this.merchantHoldingInfo;
    }

    public QueryInnerMerchantpayexpandResponse setMerchantSettleInfo(MerchantSettleInfo merchantSettleInfo) {
        this.merchantSettleInfo = merchantSettleInfo;
        return this;
    }
    public MerchantSettleInfo getMerchantSettleInfo() {
        return this.merchantSettleInfo;
    }

    public QueryInnerMerchantpayexpandResponse setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

}
