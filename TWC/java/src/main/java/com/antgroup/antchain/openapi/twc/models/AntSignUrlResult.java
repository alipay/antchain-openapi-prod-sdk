// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AntSignUrlResult extends TeaModel {
    // 签署方名称
    /**
     * <strong>example:</strong>
     * <p>某某</p>
     */
    @NameInMap("sign_cert_name")
    @Validation(required = true)
    public String signCertName;

    // 签署方证件号（脱敏）
    /**
     * <strong>example:</strong>
     * <p>421011111111111111</p>
     */
    @NameInMap("sign_cert_no")
    @Validation(required = true)
    public String signCertNo;

    // 签署方 id
    /**
     * <strong>example:</strong>
     * <p>CA20220920000002</p>
     */
    @NameInMap("sign_user_id")
    @Validation(required = true)
    public String signUserId;

    // 加密后的签署方证件号(用来关联签署方的签署链接)
    /**
     * <strong>example:</strong>
     * <p>9***************3G</p>
     */
    @NameInMap("encrypt_sign_cert_no")
    @Validation(required = true)
    public String encryptSignCertNo;

    // 签署链接：电子签任务为异步任务，请确保已处于签署中（SIGNNING）状态，再给用户发送签署链接，否则用户签署会不成功
    /**
     * <strong>example:</strong>
     * <p><a href="https://p.tb.cn/_5He390eo6NzfmuCzcNhzwO">https://p.tb.cn/_5He390eo6NzfmuCzcNhzwO</a></p>
     */
    @NameInMap("sign_url")
    @Validation(required = true)
    public String signUrl;

    public static AntSignUrlResult build(java.util.Map<String, ?> map) throws Exception {
        AntSignUrlResult self = new AntSignUrlResult();
        return TeaModel.build(map, self);
    }

    public AntSignUrlResult setSignCertName(String signCertName) {
        this.signCertName = signCertName;
        return this;
    }
    public String getSignCertName() {
        return this.signCertName;
    }

    public AntSignUrlResult setSignCertNo(String signCertNo) {
        this.signCertNo = signCertNo;
        return this;
    }
    public String getSignCertNo() {
        return this.signCertNo;
    }

    public AntSignUrlResult setSignUserId(String signUserId) {
        this.signUserId = signUserId;
        return this;
    }
    public String getSignUserId() {
        return this.signUserId;
    }

    public AntSignUrlResult setEncryptSignCertNo(String encryptSignCertNo) {
        this.encryptSignCertNo = encryptSignCertNo;
        return this;
    }
    public String getEncryptSignCertNo() {
        return this.encryptSignCertNo;
    }

    public AntSignUrlResult setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

}
