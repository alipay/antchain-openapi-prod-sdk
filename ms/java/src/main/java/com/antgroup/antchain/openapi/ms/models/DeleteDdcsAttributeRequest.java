// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DeleteDdcsAttributeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    @NameInMap("attribute_name")
    @Validation(required = true)
    public String attributeName;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("region")
    @Validation(required = true)
    public String region;

    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static DeleteDdcsAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDdcsAttributeRequest self = new DeleteDdcsAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDdcsAttributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDdcsAttributeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDdcsAttributeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteDdcsAttributeRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public DeleteDdcsAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDdcsAttributeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteDdcsAttributeRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
