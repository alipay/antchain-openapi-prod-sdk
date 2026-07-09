// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTaskstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备定位信息
    @NameInMap("device_locator")
    @Validation(required = true)
    public DeviceLocator deviceLocator;

    // 可选模块定位信息
    @NameInMap("module_locator")
    public ModuleLocator moduleLocator;

    // 是否返回已升级完成任务，默认 false
    @NameInMap("include_success")
    public Boolean includeSuccess;

    public static QueryElectrocarTaskstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTaskstatusRequest self = new QueryElectrocarTaskstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTaskstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarTaskstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarTaskstatusRequest setDeviceLocator(DeviceLocator deviceLocator) {
        this.deviceLocator = deviceLocator;
        return this;
    }
    public DeviceLocator getDeviceLocator() {
        return this.deviceLocator;
    }

    public QueryElectrocarTaskstatusRequest setModuleLocator(ModuleLocator moduleLocator) {
        this.moduleLocator = moduleLocator;
        return this;
    }
    public ModuleLocator getModuleLocator() {
        return this.moduleLocator;
    }

    public QueryElectrocarTaskstatusRequest setIncludeSuccess(Boolean includeSuccess) {
        this.includeSuccess = includeSuccess;
        return this;
    }
    public Boolean getIncludeSuccess() {
        return this.includeSuccess;
    }

}
