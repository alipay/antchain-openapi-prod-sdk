// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LoadTsmCertificatetsmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // certificate
    @NameInMap("certificate")
    public String certificate;

    // BOT
    @NameInMap("device_code")
    @Validation(required = true)
    public String deviceCode;

    // H0
    @NameInMap("device_model")
    @Validation(required = true)
    public String deviceModel;

    // SE
    @NameInMap("device_module")
    @Validation(required = true)
    public String deviceModule;

    public static LoadTsmCertificatetsmRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadTsmCertificatetsmRequest self = new LoadTsmCertificatetsmRequest();
        return TeaModel.build(map, self);
    }

    public LoadTsmCertificatetsmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoadTsmCertificatetsmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LoadTsmCertificatetsmRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public LoadTsmCertificatetsmRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public LoadTsmCertificatetsmRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public LoadTsmCertificatetsmRequest setDeviceModule(String deviceModule) {
        this.deviceModule = deviceModule;
        return this;
    }
    public String getDeviceModule() {
        return this.deviceModule;
    }

}
