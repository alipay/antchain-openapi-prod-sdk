// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class VerifyMiniNfcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 动态秘钥字符串信息
    @NameInMap("code")
    @Validation(required = true, maxLength = 250)
    public String code;

    // NFC UID
    @NameInMap("uid")
    public String uid;

    public static VerifyMiniNfcRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyMiniNfcRequest self = new VerifyMiniNfcRequest();
        return TeaModel.build(map, self);
    }

    public VerifyMiniNfcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyMiniNfcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyMiniNfcRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyMiniNfcRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
