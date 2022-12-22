// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class CreateAntiQrcodeimageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要生成图片二维码的字符串信息
    @NameInMap("qr_code")
    @Validation(required = true)
    public String qrCode;

    public static CreateAntiQrcodeimageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntiQrcodeimageRequest self = new CreateAntiQrcodeimageRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntiQrcodeimageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntiQrcodeimageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntiQrcodeimageRequest setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

}
