// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class VerifyAntchainMytcMiniNfcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 动态秘钥字符串信息
    @NameInMap("code")
    @Validation(required = true, maxLength = 160)
    public String code;

    // NFC UID
    @NameInMap("uid")
    public String uid;

    public static VerifyAntchainMytcMiniNfcRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainMytcMiniNfcRequest self = new VerifyAntchainMytcMiniNfcRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainMytcMiniNfcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainMytcMiniNfcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainMytcMiniNfcRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyAntchainMytcMiniNfcRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
