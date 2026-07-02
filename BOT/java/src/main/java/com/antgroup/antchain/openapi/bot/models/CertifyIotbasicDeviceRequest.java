// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CertifyIotbasicDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备序列号
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备厂商
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    public static CertifyIotbasicDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyIotbasicDeviceRequest self = new CertifyIotbasicDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CertifyIotbasicDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyIotbasicDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyIotbasicDeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public CertifyIotbasicDeviceRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
