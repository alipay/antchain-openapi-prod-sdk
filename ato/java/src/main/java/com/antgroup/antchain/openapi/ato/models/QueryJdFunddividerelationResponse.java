// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryJdFunddividerelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户公司名称
    @NameInMap("subject_company_name")
    public String subjectCompanyName;

    // 分账方租户8位id
    @NameInMap("divide_tenant_id")
    public String divideTenantId;

    // 分账公司社会信用代码
    @NameInMap("divide_merchant_id")
    public String divideMerchantId;

    // 分账方公司名称
    @NameInMap("divide_company_name")
    public String divideCompanyName;

    // AUDIT:审批中 
    // AUDIT_PASSED:审批通过
    // AUDIT_NOT_PASSED:审批不通过
    @NameInMap("relation_status")
    public String relationStatus;

    // 京东商户号
    @NameInMap("divide_jd_merchant_no")
    public String divideJdMerchantNo;

    // 分账关系说明
    @NameInMap("desc")
    public String desc;

    // 失败原因
    @NameInMap("fail_reason")
    public String failReason;

    // 分账协议文件
    @NameInMap("contract_files")
    public java.util.List<FileInfo> contractFiles;

    public static QueryJdFunddividerelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJdFunddividerelationResponse self = new QueryJdFunddividerelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryJdFunddividerelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryJdFunddividerelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryJdFunddividerelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryJdFunddividerelationResponse setSubjectCompanyName(String subjectCompanyName) {
        this.subjectCompanyName = subjectCompanyName;
        return this;
    }
    public String getSubjectCompanyName() {
        return this.subjectCompanyName;
    }

    public QueryJdFunddividerelationResponse setDivideTenantId(String divideTenantId) {
        this.divideTenantId = divideTenantId;
        return this;
    }
    public String getDivideTenantId() {
        return this.divideTenantId;
    }

    public QueryJdFunddividerelationResponse setDivideMerchantId(String divideMerchantId) {
        this.divideMerchantId = divideMerchantId;
        return this;
    }
    public String getDivideMerchantId() {
        return this.divideMerchantId;
    }

    public QueryJdFunddividerelationResponse setDivideCompanyName(String divideCompanyName) {
        this.divideCompanyName = divideCompanyName;
        return this;
    }
    public String getDivideCompanyName() {
        return this.divideCompanyName;
    }

    public QueryJdFunddividerelationResponse setRelationStatus(String relationStatus) {
        this.relationStatus = relationStatus;
        return this;
    }
    public String getRelationStatus() {
        return this.relationStatus;
    }

    public QueryJdFunddividerelationResponse setDivideJdMerchantNo(String divideJdMerchantNo) {
        this.divideJdMerchantNo = divideJdMerchantNo;
        return this;
    }
    public String getDivideJdMerchantNo() {
        return this.divideJdMerchantNo;
    }

    public QueryJdFunddividerelationResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public QueryJdFunddividerelationResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QueryJdFunddividerelationResponse setContractFiles(java.util.List<FileInfo> contractFiles) {
        this.contractFiles = contractFiles;
        return this;
    }
    public java.util.List<FileInfo> getContractFiles() {
        return this.contractFiles;
    }

}
