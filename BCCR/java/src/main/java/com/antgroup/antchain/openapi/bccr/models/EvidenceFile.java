// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class EvidenceFile extends TeaModel {
    // 证据文件名称
    /**
     * <strong>example:</strong>
     * <p>文件名称</p>
     */
    @NameInMap("evidence_file_name")
    @Validation(required = true)
    public String evidenceFileName;

    // 证据文件备注
    /**
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>RECORD_SCREEN</p>
     */
    @NameInMap("evidence_file_type")
    @Validation(required = true)
    public String evidenceFileType;

    // 文件大小
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("evidence_file_size")
    @Validation(required = true)
    public Long evidenceFileSize;

    // 文件时长（单位：秒）
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("duration")
    @Validation(required = true)
    public Long duration;

    // 证据文件指纹
    /**
     * <strong>example:</strong>
     * <p>b99bd7628080f2ec55d68bfe15d62a2b</p>
     */
    @NameInMap("evidence_file_hash")
    @Validation(required = true)
    public String evidenceFileHash;

    // 文件url
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.baidu.com">https://www.baidu.com</a></p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    public static EvidenceFile build(java.util.Map<String, ?> map) throws Exception {
        EvidenceFile self = new EvidenceFile();
        return TeaModel.build(map, self);
    }

    public EvidenceFile setEvidenceFileName(String evidenceFileName) {
        this.evidenceFileName = evidenceFileName;
        return this;
    }
    public String getEvidenceFileName() {
        return this.evidenceFileName;
    }

    public EvidenceFile setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public EvidenceFile setEvidenceFileType(String evidenceFileType) {
        this.evidenceFileType = evidenceFileType;
        return this;
    }
    public String getEvidenceFileType() {
        return this.evidenceFileType;
    }

    public EvidenceFile setEvidenceFileSize(Long evidenceFileSize) {
        this.evidenceFileSize = evidenceFileSize;
        return this;
    }
    public Long getEvidenceFileSize() {
        return this.evidenceFileSize;
    }

    public EvidenceFile setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public EvidenceFile setEvidenceFileHash(String evidenceFileHash) {
        this.evidenceFileHash = evidenceFileHash;
        return this;
    }
    public String getEvidenceFileHash() {
        return this.evidenceFileHash;
    }

    public EvidenceFile setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
