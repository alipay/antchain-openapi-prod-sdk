// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDigitalkeyDeviceinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备DID，注册蚂蚁链返回的设备唯一ID
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 使用deviceSecret对deviceDid进行加签
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static GetDigitalkeyDeviceinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalkeyDeviceinfoRequest self = new GetDigitalkeyDeviceinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDigitalkeyDeviceinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDigitalkeyDeviceinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDigitalkeyDeviceinfoRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public GetDigitalkeyDeviceinfoRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
