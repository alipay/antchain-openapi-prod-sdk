// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twoe.models;

import com.aliyun.tea.*;

public class EvidenceInfo extends TeaModel {
    // 取证类型
    // PHOTO 照片
    // VIDEO 视频
    // STREAM 流
    @NameInMap("forensic_type")
    @Validation(required = true)
    public String forensicType;

    // 取证时间戳
    @NameInMap("forensic_timestamp")
    @Validation(required = true)
    public Long forensicTimestamp;

    // 形成证据时间戳
    @NameInMap("evidence_timestamp")
    @Validation(required = true)
    public Long evidenceTimestamp;

    // 证据哈希值
    @NameInMap("evidence_file_hash")
    @Validation(required = true)
    public String evidenceFileHash;

    // 证据大小，byte
    @NameInMap("evidence_file_size")
    @Validation(required = true)
    public Long evidenceFileSize;

    // 证据视频/照片下载链接
    @NameInMap("evidence_file_url")
    @Validation(required = true)
    public String evidenceFileUrl;

    // 缩略图链接
    @NameInMap("thumbnail_url")
    @Validation(required = true)
    public String thumbnailUrl;

    // 取证经度，根据是否需要自清洁决定
    @NameInMap("longitude")
    public String longitude;

    // 取证纬度，根据是否需要自清洁决定
    @NameInMap("latitude")
    public String latitude;

    // 统一证据编号，根据是否需要上链决定
    @NameInMap("tx_hash")
    public String txHash;

    // 公证处，根据是否需要公证决定
    @NameInMap("notary_office")
    public String notaryOffice;

    // 存证证明文件链接，根据是否需要公证决定
    @NameInMap("notary_url")
    public String notaryUrl;

    // 存证证明文件编号，根据是否需要公证决定
    @NameInMap("notary_cert_no")
    public String notaryCertNo;

    // 可信时间戳，根据是否需要时间戳决定，JSON类型字符串
    @NameInMap("tsr")
    public String tsr;

    public static EvidenceInfo build(java.util.Map<String, ?> map) throws Exception {
        EvidenceInfo self = new EvidenceInfo();
        return TeaModel.build(map, self);
    }

    public EvidenceInfo setForensicType(String forensicType) {
        this.forensicType = forensicType;
        return this;
    }
    public String getForensicType() {
        return this.forensicType;
    }

    public EvidenceInfo setForensicTimestamp(Long forensicTimestamp) {
        this.forensicTimestamp = forensicTimestamp;
        return this;
    }
    public Long getForensicTimestamp() {
        return this.forensicTimestamp;
    }

    public EvidenceInfo setEvidenceTimestamp(Long evidenceTimestamp) {
        this.evidenceTimestamp = evidenceTimestamp;
        return this;
    }
    public Long getEvidenceTimestamp() {
        return this.evidenceTimestamp;
    }

    public EvidenceInfo setEvidenceFileHash(String evidenceFileHash) {
        this.evidenceFileHash = evidenceFileHash;
        return this;
    }
    public String getEvidenceFileHash() {
        return this.evidenceFileHash;
    }

    public EvidenceInfo setEvidenceFileSize(Long evidenceFileSize) {
        this.evidenceFileSize = evidenceFileSize;
        return this;
    }
    public Long getEvidenceFileSize() {
        return this.evidenceFileSize;
    }

    public EvidenceInfo setEvidenceFileUrl(String evidenceFileUrl) {
        this.evidenceFileUrl = evidenceFileUrl;
        return this;
    }
    public String getEvidenceFileUrl() {
        return this.evidenceFileUrl;
    }

    public EvidenceInfo setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public EvidenceInfo setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public EvidenceInfo setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public EvidenceInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public EvidenceInfo setNotaryOffice(String notaryOffice) {
        this.notaryOffice = notaryOffice;
        return this;
    }
    public String getNotaryOffice() {
        return this.notaryOffice;
    }

    public EvidenceInfo setNotaryUrl(String notaryUrl) {
        this.notaryUrl = notaryUrl;
        return this;
    }
    public String getNotaryUrl() {
        return this.notaryUrl;
    }

    public EvidenceInfo setNotaryCertNo(String notaryCertNo) {
        this.notaryCertNo = notaryCertNo;
        return this;
    }
    public String getNotaryCertNo() {
        return this.notaryCertNo;
    }

    public EvidenceInfo setTsr(String tsr) {
        this.tsr = tsr;
        return this;
    }
    public String getTsr() {
        return this.tsr;
    }

}
