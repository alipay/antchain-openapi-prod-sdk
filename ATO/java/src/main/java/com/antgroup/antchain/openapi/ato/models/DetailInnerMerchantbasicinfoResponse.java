// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerMerchantbasicinfoResponse extends TeaModel {
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

    // 审核信息
    @NameInMap("audit_infos")
    public java.util.List<AuditInfo> auditInfos;

    // 业务流水号id
    @NameInMap("biz_id")
    public String bizId;

    // AUDIT 审核中
    // SUCCESS 成功
    // FAIL 失败
    @NameInMap("status")
    public String status;

    // 失败描述
    @NameInMap("fail_reason")
    public String failReason;

    public static DetailInnerMerchantbasicinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerMerchantbasicinfoResponse self = new DetailInnerMerchantbasicinfoResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerMerchantbasicinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerMerchantbasicinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerMerchantbasicinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerMerchantbasicinfoResponse setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }
    public CompanyInfo getCompanyInfo() {
        return this.companyInfo;
    }

    public DetailInnerMerchantbasicinfoResponse setLegalInfo(LegalInfo legalInfo) {
        this.legalInfo = legalInfo;
        return this;
    }
    public LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public DetailInnerMerchantbasicinfoResponse setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public DetailInnerMerchantbasicinfoResponse setAuditInfos(java.util.List<AuditInfo> auditInfos) {
        this.auditInfos = auditInfos;
        return this;
    }
    public java.util.List<AuditInfo> getAuditInfos() {
        return this.auditInfos;
    }

    public DetailInnerMerchantbasicinfoResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DetailInnerMerchantbasicinfoResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DetailInnerMerchantbasicinfoResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
