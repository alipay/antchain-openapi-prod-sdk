// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RegisterElectrocarDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备名称
    @NameInMap("device_neme")
    @Validation(required = true)
    public String deviceNeme;

    // 设备名称
    @NameInMap("nick_name")
    @Validation(required = true)
    public String nickName;

    // 产品key
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // 凭证申请参数
    @NameInMap("kyt_apply_params")
    @Validation(required = true)
    public KytApplyParams kytApplyParams;

    public static RegisterElectrocarDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterElectrocarDeviceRequest self = new RegisterElectrocarDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterElectrocarDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterElectrocarDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterElectrocarDeviceRequest setDeviceNeme(String deviceNeme) {
        this.deviceNeme = deviceNeme;
        return this;
    }
    public String getDeviceNeme() {
        return this.deviceNeme;
    }

    public RegisterElectrocarDeviceRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public RegisterElectrocarDeviceRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public RegisterElectrocarDeviceRequest setKytApplyParams(KytApplyParams kytApplyParams) {
        this.kytApplyParams = kytApplyParams;
        return this;
    }
    public KytApplyParams getKytApplyParams() {
        return this.kytApplyParams;
    }

}
