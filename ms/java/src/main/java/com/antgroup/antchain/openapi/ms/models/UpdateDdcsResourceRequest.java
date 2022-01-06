// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateDdcsResourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称，长度50以内
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 应用名称，长度50以内
    @NameInMap("new_app_name")
    public String newAppName;

    // 资源描述，长度150以内
    @NameInMap("new_name")
    public String newName;

    // 机构名称，长度20以内
    @NameInMap("new_region")
    public String newRegion;

    // 配置类名称，长度150以内
    @NameInMap("new_resource_id")
    public String newResourceId;

    // 机构名称，长度20以内
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 配置类名称，长度150以内
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static UpdateDdcsResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDdcsResourceRequest self = new UpdateDdcsResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDdcsResourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDdcsResourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDdcsResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateDdcsResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDdcsResourceRequest setNewAppName(String newAppName) {
        this.newAppName = newAppName;
        return this;
    }
    public String getNewAppName() {
        return this.newAppName;
    }

    public UpdateDdcsResourceRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateDdcsResourceRequest setNewRegion(String newRegion) {
        this.newRegion = newRegion;
        return this;
    }
    public String getNewRegion() {
        return this.newRegion;
    }

    public UpdateDdcsResourceRequest setNewResourceId(String newResourceId) {
        this.newResourceId = newResourceId;
        return this;
    }
    public String getNewResourceId() {
        return this.newResourceId;
    }

    public UpdateDdcsResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateDdcsResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
