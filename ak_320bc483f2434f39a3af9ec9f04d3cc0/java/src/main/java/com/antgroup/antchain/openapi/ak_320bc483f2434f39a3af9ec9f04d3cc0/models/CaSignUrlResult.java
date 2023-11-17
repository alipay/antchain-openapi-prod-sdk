// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSignUrlResult extends TeaModel {
    // 签署方名称
    @NameInMap("sign_cert_name")
    public String signCertName;

    // 签署方证件号（脱敏）
    @NameInMap("sign_cert_no")
    public String signCertNo;

    // 签署方id
    @NameInMap("sign_user_id")
    public String signUserId;

    // 加密后的签署方证件号(用来关联签署方的签署链接)
    @NameInMap("encrypt_sign_cert_no")
    public String encryptSignCertNo;

    // 签署链接
    @NameInMap("sign_url")
    public String signUrl;

    public static CaSignUrlResult build(java.util.Map<String, ?> map) throws Exception {
        CaSignUrlResult self = new CaSignUrlResult();
        return TeaModel.build(map, self);
    }

    public CaSignUrlResult setSignCertName(String signCertName) {
        this.signCertName = signCertName;
        return this;
    }
    public String getSignCertName() {
        return this.signCertName;
    }

    public CaSignUrlResult setSignCertNo(String signCertNo) {
        this.signCertNo = signCertNo;
        return this;
    }
    public String getSignCertNo() {
        return this.signCertNo;
    }

    public CaSignUrlResult setSignUserId(String signUserId) {
        this.signUserId = signUserId;
        return this;
    }
    public String getSignUserId() {
        return this.signUserId;
    }

    public CaSignUrlResult setEncryptSignCertNo(String encryptSignCertNo) {
        this.encryptSignCertNo = encryptSignCertNo;
        return this;
    }
    public String getEncryptSignCertNo() {
        return this.encryptSignCertNo;
    }

    public CaSignUrlResult setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

}
