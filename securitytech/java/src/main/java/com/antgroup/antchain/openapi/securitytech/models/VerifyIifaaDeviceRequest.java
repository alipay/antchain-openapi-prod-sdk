// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class VerifyIifaaDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待验证的数据
    @NameInMap("cipher_text")
    @Validation(required = true)
    public String cipherText;

    public static VerifyIifaaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyIifaaDeviceRequest self = new VerifyIifaaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyIifaaDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyIifaaDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyIifaaDeviceRequest setCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }
    public String getCipherText() {
        return this.cipherText;
    }

}
