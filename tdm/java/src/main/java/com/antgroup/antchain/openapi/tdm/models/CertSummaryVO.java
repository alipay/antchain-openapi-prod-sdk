// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CertSummaryVO extends TeaModel {
    // 证明文件ID
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 证明文件类型
    @NameInMap("issue_cert_type")
    @Validation(required = true)
    public String issueCertType;

    // 证明文件描述
    @NameInMap("issue_cert_type_desc")
    @Validation(required = true)
    public String issueCertTypeDesc;

    // 证明开具时间
    @NameInMap("issue_time")
    @Validation(required = true)
    public String issueTime;

    // 证明图标（未使用）
    @NameInMap("issue_icon")
    public String issueIcon;

    public static CertSummaryVO build(java.util.Map<String, ?> map) throws Exception {
        CertSummaryVO self = new CertSummaryVO();
        return TeaModel.build(map, self);
    }

    public CertSummaryVO setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public CertSummaryVO setIssueCertType(String issueCertType) {
        this.issueCertType = issueCertType;
        return this;
    }
    public String getIssueCertType() {
        return this.issueCertType;
    }

    public CertSummaryVO setIssueCertTypeDesc(String issueCertTypeDesc) {
        this.issueCertTypeDesc = issueCertTypeDesc;
        return this;
    }
    public String getIssueCertTypeDesc() {
        return this.issueCertTypeDesc;
    }

    public CertSummaryVO setIssueTime(String issueTime) {
        this.issueTime = issueTime;
        return this;
    }
    public String getIssueTime() {
        return this.issueTime;
    }

    public CertSummaryVO setIssueIcon(String issueIcon) {
        this.issueIcon = issueIcon;
        return this;
    }
    public String getIssueIcon() {
        return this.issueIcon;
    }

}
