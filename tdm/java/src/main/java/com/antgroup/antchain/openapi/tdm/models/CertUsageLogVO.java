// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CertUsageLogVO extends TeaModel {
    // 使用方名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 使用时间
    @NameInMap("usage_time")
    @Validation(required = true)
    public String usageTime;

    // 证明类型
    @NameInMap("issue_cert_type")
    @Validation(required = true)
    public String issueCertType;

    // 证明类型描述
    @NameInMap("issue_cert_type_desc")
    @Validation(required = true)
    public String issueCertTypeDesc;

    // 证明开具时间
    @NameInMap("issue_time")
    @Validation(required = true)
    public String issueTime;

    // 用途
    @NameInMap("purpose")
    @Validation(required = true)
    public String purpose;

    // 业务流水号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    public static CertUsageLogVO build(java.util.Map<String, ?> map) throws Exception {
        CertUsageLogVO self = new CertUsageLogVO();
        return TeaModel.build(map, self);
    }

    public CertUsageLogVO setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CertUsageLogVO setUsageTime(String usageTime) {
        this.usageTime = usageTime;
        return this;
    }
    public String getUsageTime() {
        return this.usageTime;
    }

    public CertUsageLogVO setIssueCertType(String issueCertType) {
        this.issueCertType = issueCertType;
        return this;
    }
    public String getIssueCertType() {
        return this.issueCertType;
    }

    public CertUsageLogVO setIssueCertTypeDesc(String issueCertTypeDesc) {
        this.issueCertTypeDesc = issueCertTypeDesc;
        return this;
    }
    public String getIssueCertTypeDesc() {
        return this.issueCertTypeDesc;
    }

    public CertUsageLogVO setIssueTime(String issueTime) {
        this.issueTime = issueTime;
        return this;
    }
    public String getIssueTime() {
        return this.issueTime;
    }

    public CertUsageLogVO setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public CertUsageLogVO setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
