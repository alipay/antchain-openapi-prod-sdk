// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class EvidenceCertificateInfo extends TeaModel {
    // 证书编号
    /**
     * <strong>example:</strong>
     * <p>5978355373</p>
     */
    @NameInMap("certificate_no")
    @Validation(required = true)
    public String certificateNo;

    // 上链时间
    /**
     * <strong>example:</strong>
     * <p>2023-06-27T10:50:23+08:00</p>
     */
    @NameInMap("certificate_time")
    @Validation(required = true)
    public String certificateTime;

    // 链上交易hash
    /**
     * <strong>example:</strong>
     * <p>eh5a978s3553c73ee7e2cl22e</p>
     */
    @NameInMap("certificate_hash")
    @Validation(required = true)
    public String certificateHash;

    // 证书下载url（有效期3天）
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("certificate_url")
    @Validation(required = true)
    public String certificateUrl;

    public static EvidenceCertificateInfo build(java.util.Map<String, ?> map) throws Exception {
        EvidenceCertificateInfo self = new EvidenceCertificateInfo();
        return TeaModel.build(map, self);
    }

    public EvidenceCertificateInfo setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }
    public String getCertificateNo() {
        return this.certificateNo;
    }

    public EvidenceCertificateInfo setCertificateTime(String certificateTime) {
        this.certificateTime = certificateTime;
        return this;
    }
    public String getCertificateTime() {
        return this.certificateTime;
    }

    public EvidenceCertificateInfo setCertificateHash(String certificateHash) {
        this.certificateHash = certificateHash;
        return this;
    }
    public String getCertificateHash() {
        return this.certificateHash;
    }

    public EvidenceCertificateInfo setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

}
