// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateMsDdcsAttributeRequest extends TeaModel {
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

    @NameInMap("new_attribute_name")
    public String newAttributeName;

    @NameInMap("new_name")
    public String newName;

    @NameInMap("region")
    @Validation(required = true)
    public String region;

    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static UpdateMsDdcsAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDdcsAttributeRequest self = new UpdateMsDdcsAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsDdcsAttributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMsDdcsAttributeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMsDdcsAttributeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMsDdcsAttributeRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public UpdateMsDdcsAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsDdcsAttributeRequest setNewAttributeName(String newAttributeName) {
        this.newAttributeName = newAttributeName;
        return this;
    }
    public String getNewAttributeName() {
        return this.newAttributeName;
    }

    public UpdateMsDdcsAttributeRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateMsDdcsAttributeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateMsDdcsAttributeRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
