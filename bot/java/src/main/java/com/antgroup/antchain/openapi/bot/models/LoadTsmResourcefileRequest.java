// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LoadTsmResourcefileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

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

    // version
    @NameInMap("file_version")
    public String fileVersion;

    public static LoadTsmResourcefileRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadTsmResourcefileRequest self = new LoadTsmResourcefileRequest();
        return TeaModel.build(map, self);
    }

    public LoadTsmResourcefileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoadTsmResourcefileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LoadTsmResourcefileRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public LoadTsmResourcefileRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public LoadTsmResourcefileRequest setDeviceModule(String deviceModule) {
        this.deviceModule = deviceModule;
        return this;
    }
    public String getDeviceModule() {
        return this.deviceModule;
    }

    public LoadTsmResourcefileRequest setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public String getFileVersion() {
        return this.fileVersion;
    }

}
