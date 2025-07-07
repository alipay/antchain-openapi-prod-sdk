// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CertInstanceDetail extends TeaModel {
    // 主键
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 实例名称
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 版发者
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("issuer")
    @Validation(required = true)
    public String issuer;

    // 实例内容
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("claim_content")
    @Validation(required = true)
    public String claimContent;

    // 状态；-1：已删除 0：审核未通过, 1：审核通过, 2：待审核, 3：编辑中
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 审核建议
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("verify_comment")
    @Validation(required = true)
    public String verifyComment;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1701227612000</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>1701227612000</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    public static CertInstanceDetail build(java.util.Map<String, ?> map) throws Exception {
        CertInstanceDetail self = new CertInstanceDetail();
        return TeaModel.build(map, self);
    }

    public CertInstanceDetail setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CertInstanceDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CertInstanceDetail setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public CertInstanceDetail setClaimContent(String claimContent) {
        this.claimContent = claimContent;
        return this;
    }
    public String getClaimContent() {
        return this.claimContent;
    }

    public CertInstanceDetail setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CertInstanceDetail setVerifyComment(String verifyComment) {
        this.verifyComment = verifyComment;
        return this;
    }
    public String getVerifyComment() {
        return this.verifyComment;
    }

    public CertInstanceDetail setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CertInstanceDetail setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
