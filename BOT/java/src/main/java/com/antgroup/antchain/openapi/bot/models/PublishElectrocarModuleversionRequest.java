// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PublishElectrocarModuleversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备定位信息
    @NameInMap("device_locator")
    public DeviceLocator deviceLocator;

    // 模块定位信息
    @NameInMap("module_locator")
    @Validation(required = true)
    public ModuleLocator moduleLocator;

    // 当前模块版本号
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static PublishElectrocarModuleversionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishElectrocarModuleversionRequest self = new PublishElectrocarModuleversionRequest();
        return TeaModel.build(map, self);
    }

    public PublishElectrocarModuleversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishElectrocarModuleversionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishElectrocarModuleversionRequest setDeviceLocator(DeviceLocator deviceLocator) {
        this.deviceLocator = deviceLocator;
        return this;
    }
    public DeviceLocator getDeviceLocator() {
        return this.deviceLocator;
    }

    public PublishElectrocarModuleversionRequest setModuleLocator(ModuleLocator moduleLocator) {
        this.moduleLocator = moduleLocator;
        return this;
    }
    public ModuleLocator getModuleLocator() {
        return this.moduleLocator;
    }

    public PublishElectrocarModuleversionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
