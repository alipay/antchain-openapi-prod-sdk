// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class EvidentialCheckList extends TeaModel {
    // 证据名称英文 
    /**
     * <strong>example:</strong>
     * <p>LEGAL_IDENETITY_CERT</p>
     */
    @NameInMap("evidential_name_en")
    @Validation(required = true)
    public String evidentialNameEn;

    // 文件名称
    /**
     * <strong>example:</strong>
     * <p>a.txt</p>
     */
    @NameInMap("oss_file_name")
    @Validation(required = true)
    public String ossFileName;

    // 文件fileKey ，调用获取文件上传链接时对应的fileKey
    /**
     * <strong>example:</strong>
     * <p>201906182149291c15e6c2d400fc3323b09f44a4e79bdf2db867a3fb9400a168de3325205519.jpg</p>
     */
    @NameInMap("oss_file_key")
    @Validation(required = true)
    public String ossFileKey;

    // 证据来源
    // BUSINESS_UPLOAD	业务传入
    // ADD_MANULLY	手动添加
    /**
     * <strong>example:</strong>
     * <p>BUSINESS_UPLOAD</p>
     */
    @NameInMap("sources_of_evidence")
    @Validation(required = true)
    public String sourcesOfEvidence;

    // 证据类型
    // BLOCKCHAIN_DEPOSIT	区块链存证
    // USER_UPLOAD	用户上传
    /**
     * <strong>example:</strong>
     * <p>BLOCKCHAIN_DEPOSIT</p>
     */
    @NameInMap("evidence_type")
    @Validation(required = true)
    public String evidenceType;

    // 存证类型
    // TEXT	文本
    // FILE	文件
    /**
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("deposit_type")
    @Validation(required = true)
    public String depositType;

    // 存证哈希 当为区块链存证必填
    /**
     * <strong>example:</strong>
     * <p>1234545676575675673</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    // 存证时间 当为区块链存证必填
    /**
     * <strong>example:</strong>
     * <p>2021-05-07 17:13:50</p>
     */
    @NameInMap("deposit_time")
    public String depositTime;

    public static EvidentialCheckList build(java.util.Map<String, ?> map) throws Exception {
        EvidentialCheckList self = new EvidentialCheckList();
        return TeaModel.build(map, self);
    }

    public EvidentialCheckList setEvidentialNameEn(String evidentialNameEn) {
        this.evidentialNameEn = evidentialNameEn;
        return this;
    }
    public String getEvidentialNameEn() {
        return this.evidentialNameEn;
    }

    public EvidentialCheckList setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public EvidentialCheckList setOssFileKey(String ossFileKey) {
        this.ossFileKey = ossFileKey;
        return this;
    }
    public String getOssFileKey() {
        return this.ossFileKey;
    }

    public EvidentialCheckList setSourcesOfEvidence(String sourcesOfEvidence) {
        this.sourcesOfEvidence = sourcesOfEvidence;
        return this;
    }
    public String getSourcesOfEvidence() {
        return this.sourcesOfEvidence;
    }

    public EvidentialCheckList setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }
    public String getEvidenceType() {
        return this.evidenceType;
    }

    public EvidentialCheckList setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public EvidentialCheckList setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public EvidentialCheckList setDepositTime(String depositTime) {
        this.depositTime = depositTime;
        return this;
    }
    public String getDepositTime() {
        return this.depositTime;
    }

}
