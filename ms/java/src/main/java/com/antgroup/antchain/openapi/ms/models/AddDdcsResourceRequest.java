// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdcsResourceRequest extends TeaModel {
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

    public static AddDdcsResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDdcsResourceRequest self = new AddDdcsResourceRequest();
        return TeaModel.build(map, self);
    }

    public AddDdcsResourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDdcsResourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDdcsResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddDdcsResourceRequest setAttributes(java.util.List<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<Attribute> getAttributes() {
        return this.attributes;
    }

    public AddDdcsResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDdcsResourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddDdcsResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddDdcsResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
