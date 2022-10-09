// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class VerifyIotbasicIdentifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备认证参数
    @NameInMap("verify_param")
    @Validation(required = true)
    public String verifyParam;

    public static VerifyIotbasicIdentifyRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyIotbasicIdentifyRequest self = new VerifyIotbasicIdentifyRequest();
        return TeaModel.build(map, self);
    }

    public VerifyIotbasicIdentifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyIotbasicIdentifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyIotbasicIdentifyRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public VerifyIotbasicIdentifyRequest setVerifyParam(String verifyParam) {
        this.verifyParam = verifyParam;
        return this;
    }
    public String getVerifyParam() {
        return this.verifyParam;
    }

}
