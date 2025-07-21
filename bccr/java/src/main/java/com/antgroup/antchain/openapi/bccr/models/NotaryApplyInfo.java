// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryApplyInfo extends TeaModel {
    // 公证处ID
    /**
     * <strong>example:</strong>
     * <p>公证处ID</p>
     */
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 取证人和取证信息列表
    @NameInMap("evid_infos")
    @Validation(required = true)
    public java.util.List<EvidInfo> evidInfos;

    // 申办事由
    @NameInMap("bid_reason")
    @Validation(required = true)
    public BidReason bidReason;

    // 申请人信息
    @NameInMap("applicant_infos")
    @Validation(required = true)
    public java.util.List<NotaryUser> applicantInfos;

    // 经办人信息
    @NameInMap("operator_info")
    @Validation(required = true)
    public NotaryUser operatorInfo;

    // 授权书
    @NameInMap("warrant_file_list")
    @Validation(required = true)
    public java.util.List<String> warrantFileList;

    // 权利证明材料
    @NameInMap("testify_file_list")
    @Validation(required = true)
    public java.util.List<String> testifyFileList;

    // 保全内容
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("preservation_content")
    @Validation(required = true)
    public String preservationContent;

    // 用户申办备注
    /**
     * <strong>example:</strong>
     * <p>用户申办备注</p>
     */
    @NameInMap("comments")
    public String comments;

    public static NotaryApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        NotaryApplyInfo self = new NotaryApplyInfo();
        return TeaModel.build(map, self);
    }

    public NotaryApplyInfo setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public NotaryApplyInfo setEvidInfos(java.util.List<EvidInfo> evidInfos) {
        this.evidInfos = evidInfos;
        return this;
    }
    public java.util.List<EvidInfo> getEvidInfos() {
        return this.evidInfos;
    }

    public NotaryApplyInfo setBidReason(BidReason bidReason) {
        this.bidReason = bidReason;
        return this;
    }
    public BidReason getBidReason() {
        return this.bidReason;
    }

    public NotaryApplyInfo setApplicantInfos(java.util.List<NotaryUser> applicantInfos) {
        this.applicantInfos = applicantInfos;
        return this;
    }
    public java.util.List<NotaryUser> getApplicantInfos() {
        return this.applicantInfos;
    }

    public NotaryApplyInfo setOperatorInfo(NotaryUser operatorInfo) {
        this.operatorInfo = operatorInfo;
        return this;
    }
    public NotaryUser getOperatorInfo() {
        return this.operatorInfo;
    }

    public NotaryApplyInfo setWarrantFileList(java.util.List<String> warrantFileList) {
        this.warrantFileList = warrantFileList;
        return this;
    }
    public java.util.List<String> getWarrantFileList() {
        return this.warrantFileList;
    }

    public NotaryApplyInfo setTestifyFileList(java.util.List<String> testifyFileList) {
        this.testifyFileList = testifyFileList;
        return this;
    }
    public java.util.List<String> getTestifyFileList() {
        return this.testifyFileList;
    }

    public NotaryApplyInfo setPreservationContent(String preservationContent) {
        this.preservationContent = preservationContent;
        return this;
    }
    public String getPreservationContent() {
        return this.preservationContent;
    }

    public NotaryApplyInfo setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

}
