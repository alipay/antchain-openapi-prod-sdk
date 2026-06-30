// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class OfflineEvidenceWatermarkResult extends TeaModel {
    // 取证编号
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("evidence_no")
    @Validation(required = true)
    public String evidenceNo;

    // 水印链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.baidu.com">https://www.baidu.com</a></p>
     */
    @NameInMap("watermark_url")
    public String watermarkUrl;

    // 封面链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.baidu.com">https://www.baidu.com</a></p>
     */
    @NameInMap("cover_url")
    public String coverUrl;

    // 失败原因
    /**
     * <strong>example:</strong>
     * <p>失败原因</p>
     */
    @NameInMap("fail_reason")
    public String failReason;

    public static OfflineEvidenceWatermarkResult build(java.util.Map<String, ?> map) throws Exception {
        OfflineEvidenceWatermarkResult self = new OfflineEvidenceWatermarkResult();
        return TeaModel.build(map, self);
    }

    public OfflineEvidenceWatermarkResult setEvidenceNo(String evidenceNo) {
        this.evidenceNo = evidenceNo;
        return this;
    }
    public String getEvidenceNo() {
        return this.evidenceNo;
    }

    public OfflineEvidenceWatermarkResult setWatermarkUrl(String watermarkUrl) {
        this.watermarkUrl = watermarkUrl;
        return this;
    }
    public String getWatermarkUrl() {
        return this.watermarkUrl;
    }

    public OfflineEvidenceWatermarkResult setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public OfflineEvidenceWatermarkResult setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
