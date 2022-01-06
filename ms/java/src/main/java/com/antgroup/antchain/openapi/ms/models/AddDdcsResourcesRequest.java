// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdcsResourcesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 资源的属性信息，以 JSON 字符串格式传入
    @NameInMap("attributes")
    public String attributes;

    // 资源描述信息
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 系统字段：环境实例 ID
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 资源类所属的域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 资源 ID，类似于配置文件的文件名
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static AddDdcsResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDdcsResourcesRequest self = new AddDdcsResourcesRequest();
        return TeaModel.build(map, self);
    }

    public AddDdcsResourcesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDdcsResourcesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDdcsResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddDdcsResourcesRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public AddDdcsResourcesRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AddDdcsResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDdcsResourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddDdcsResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
