// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeleteDigitalkeyCredRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户id
    @NameInMap("secret_id")
    @Validation(required = true)
    public String secretId;

    // 中控id，不能和deviceSn同时为空
    @NameInMap("tuid")
    public String tuid;

    // 设备sn 不能和tuid同时为空
    @NameInMap("device_sn")
    public String deviceSn;

    public static DeleteDigitalkeyCredRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDigitalkeyCredRequest self = new DeleteDigitalkeyCredRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDigitalkeyCredRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDigitalkeyCredRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDigitalkeyCredRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public DeleteDigitalkeyCredRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public DeleteDigitalkeyCredRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

}
