// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DeleteDdcsResourceRequest extends TeaModel {
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

    // 机构名称，长度20以内
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 配置类名称，长度150以内
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static DeleteDdcsResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDdcsResourceRequest self = new DeleteDdcsResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDdcsResourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDdcsResourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDdcsResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteDdcsResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDdcsResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteDdcsResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
