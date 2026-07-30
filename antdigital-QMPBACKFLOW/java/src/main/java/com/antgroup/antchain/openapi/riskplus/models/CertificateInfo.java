// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CertificateInfo extends TeaModel {
    // 结清证明开具结果，0：有结清证明、1：无结清证明、2：开具中、3：暂不支持开具
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 用信申请订单号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("relation_no")
    public String relationNo;

    // 结清证明url
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.example.com/ffff.pdf?expire=111111">https://www.example.com/ffff.pdf?expire=111111</a></p>
     */
    @NameInMap("certificate_url")
    public String certificateUrl;

    // 结清证明文件Base64
    /**
     * <strong>example:</strong>
     * <p>BEAKENMCT...</p>
     */
    @NameInMap("certificate_base64")
    public String certificateBase64;

    // 说明
    /**
     * <strong>example:</strong>
     * <p>已开具</p>
     */
    @NameInMap("message")
    public String message;

    public static CertificateInfo build(java.util.Map<String, ?> map) throws Exception {
        CertificateInfo self = new CertificateInfo();
        return TeaModel.build(map, self);
    }

    public CertificateInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CertificateInfo setRelationNo(String relationNo) {
        this.relationNo = relationNo;
        return this;
    }
    public String getRelationNo() {
        return this.relationNo;
    }

    public CertificateInfo setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public CertificateInfo setCertificateBase64(String certificateBase64) {
        this.certificateBase64 = certificateBase64;
        return this;
    }
    public String getCertificateBase64() {
        return this.certificateBase64;
    }

    public CertificateInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
