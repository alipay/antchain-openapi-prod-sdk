// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFunddividerelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分账公司名称
    @NameInMap("company_name")
    public String companyName;

    // 分账主体企业统一社会信用代码
    @NameInMap("subject_merchant_id")
    public String subjectMerchantId;

    // 分账主体公司名称
    @NameInMap("subject_company_name")
    public String subjectCompanyName;

    // 分账对象统一社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 分账合同或协议
    @NameInMap("contract_files")
    public java.util.List<FileInfo> contractFiles;

    // 分账关系说明
    @NameInMap("desc")
    public String desc;

    // 分账方企业pid
    @NameInMap("alipay_pid")
    public String alipayPid;

    // 分账方企业支付宝账号
    @NameInMap("alipay_account")
    public String alipayAccount;

    // 审核列表
    @NameInMap("audit_infos")
    public java.util.List<AuditInfo> auditInfos;

    // INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
    @NameInMap("relation_status")
    public String relationStatus;

    // 分账关系绑定失败原因
    @NameInMap("relation_fail_reason")
    public String relationFailReason;

    public static QueryInnerFunddividerelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFunddividerelationResponse self = new QueryInnerFunddividerelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerFunddividerelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerFunddividerelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerFunddividerelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerFunddividerelationResponse setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public QueryInnerFunddividerelationResponse setSubjectMerchantId(String subjectMerchantId) {
        this.subjectMerchantId = subjectMerchantId;
        return this;
    }
    public String getSubjectMerchantId() {
        return this.subjectMerchantId;
    }

    public QueryInnerFunddividerelationResponse setSubjectCompanyName(String subjectCompanyName) {
        this.subjectCompanyName = subjectCompanyName;
        return this;
    }
    public String getSubjectCompanyName() {
        return this.subjectCompanyName;
    }

    public QueryInnerFunddividerelationResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryInnerFunddividerelationResponse setContractFiles(java.util.List<FileInfo> contractFiles) {
        this.contractFiles = contractFiles;
        return this;
    }
    public java.util.List<FileInfo> getContractFiles() {
        return this.contractFiles;
    }

    public QueryInnerFunddividerelationResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public QueryInnerFunddividerelationResponse setAlipayPid(String alipayPid) {
        this.alipayPid = alipayPid;
        return this;
    }
    public String getAlipayPid() {
        return this.alipayPid;
    }

    public QueryInnerFunddividerelationResponse setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public String getAlipayAccount() {
        return this.alipayAccount;
    }

    public QueryInnerFunddividerelationResponse setAuditInfos(java.util.List<AuditInfo> auditInfos) {
        this.auditInfos = auditInfos;
        return this;
    }
    public java.util.List<AuditInfo> getAuditInfos() {
        return this.auditInfos;
    }

    public QueryInnerFunddividerelationResponse setRelationStatus(String relationStatus) {
        this.relationStatus = relationStatus;
        return this;
    }
    public String getRelationStatus() {
        return this.relationStatus;
    }

    public QueryInnerFunddividerelationResponse setRelationFailReason(String relationFailReason) {
        this.relationFailReason = relationFailReason;
        return this;
    }
    public String getRelationFailReason() {
        return this.relationFailReason;
    }

}
