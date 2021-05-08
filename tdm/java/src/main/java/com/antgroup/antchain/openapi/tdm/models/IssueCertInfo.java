// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class IssueCertInfo extends TeaModel {
    // 证明文件ID
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 证明开具时间
    @NameInMap("issue_time")
    @Validation(required = true)
    public String issueTime;

    // 证明开具单位
    @NameInMap("provider_name")
    public String providerName;

    // 证明类型
    @NameInMap("issue_cert_type")
    @Validation(required = true)
    public String issueCertType;

    // 证明抬头
    @NameInMap("deposit_cert_tag")
    public String depositCertTag;

    // 证明文件png图片存储地址
    @NameInMap("deposit_cert")
    public String depositCert;

    // 证明文件pdf获取地址(不带二维码)
    @NameInMap("deposit_cert_pdf")
    public String depositCertPdf;

    // 证明文件pdf获取地址(带验真码)
    @NameInMap("deposit_cert_pdf_qr")
    public String depositCertPdfQr;

    public static IssueCertInfo build(java.util.Map<String, ?> map) throws Exception {
        IssueCertInfo self = new IssueCertInfo();
        return TeaModel.build(map, self);
    }

    public IssueCertInfo setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public IssueCertInfo setIssueTime(String issueTime) {
        this.issueTime = issueTime;
        return this;
    }
    public String getIssueTime() {
        return this.issueTime;
    }

    public IssueCertInfo setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public IssueCertInfo setIssueCertType(String issueCertType) {
        this.issueCertType = issueCertType;
        return this;
    }
    public String getIssueCertType() {
        return this.issueCertType;
    }

    public IssueCertInfo setDepositCertTag(String depositCertTag) {
        this.depositCertTag = depositCertTag;
        return this;
    }
    public String getDepositCertTag() {
        return this.depositCertTag;
    }

    public IssueCertInfo setDepositCert(String depositCert) {
        this.depositCert = depositCert;
        return this;
    }
    public String getDepositCert() {
        return this.depositCert;
    }

    public IssueCertInfo setDepositCertPdf(String depositCertPdf) {
        this.depositCertPdf = depositCertPdf;
        return this;
    }
    public String getDepositCertPdf() {
        return this.depositCertPdf;
    }

    public IssueCertInfo setDepositCertPdfQr(String depositCertPdfQr) {
        this.depositCertPdfQr = depositCertPdfQr;
        return this;
    }
    public String getDepositCertPdfQr() {
        return this.depositCertPdfQr;
    }

}
