// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddMsDdcsResourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称，长度50以内
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 属性列表，类型是数组
    @NameInMap("attributes")
    public java.util.List<Attribute> attributes;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 资源描述，长度150以内
    @NameInMap("name")
    public String name;

    // 机构名称，长度20以内
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 配置类名称，长度150以内
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static AddMsDdcsResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsDdcsResourceRequest self = new AddMsDdcsResourceRequest();
        return TeaModel.build(map, self);
    }

    public AddMsDdcsResourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddMsDdcsResourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddMsDdcsResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddMsDdcsResourceRequest setAttributes(java.util.List<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<Attribute> getAttributes() {
        return this.attributes;
    }

    public AddMsDdcsResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsDdcsResourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMsDdcsResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddMsDdcsResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
