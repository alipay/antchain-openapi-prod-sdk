// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtaupgradecheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备定位信息
    @NameInMap("device_locator")
    @Validation(required = true)
    public DeviceLocator deviceLocator;

    // 模块版本上报列表
    @NameInMap("module_versions")
    public java.util.List<ModuleVersionItem> moduleVersions;

    // 是否返回已升级完成任务，默认 false
    @NameInMap("include_success")
    public Boolean includeSuccess;

    public static QueryElectrocarOtaupgradecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtaupgradecheckRequest self = new QueryElectrocarOtaupgradecheckRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtaupgradecheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarOtaupgradecheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarOtaupgradecheckRequest setDeviceLocator(DeviceLocator deviceLocator) {
        this.deviceLocator = deviceLocator;
        return this;
    }
    public DeviceLocator getDeviceLocator() {
        return this.deviceLocator;
    }

    public QueryElectrocarOtaupgradecheckRequest setModuleVersions(java.util.List<ModuleVersionItem> moduleVersions) {
        this.moduleVersions = moduleVersions;
        return this;
    }
    public java.util.List<ModuleVersionItem> getModuleVersions() {
        return this.moduleVersions;
    }

    public QueryElectrocarOtaupgradecheckRequest setIncludeSuccess(Boolean includeSuccess) {
        this.includeSuccess = includeSuccess;
        return this;
    }
    public Boolean getIncludeSuccess() {
        return this.includeSuccess;
    }

}
