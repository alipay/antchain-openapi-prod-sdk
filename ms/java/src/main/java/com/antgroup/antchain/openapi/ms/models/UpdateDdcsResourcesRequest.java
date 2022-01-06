// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateDdcsResourcesRequest extends TeaModel {
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

    // 更新的资源自增长 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 系统字段：环境实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 资源搜索的域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 资源唯一标识
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 是否全量更新属性，默认为 false
    @NameInMap("update_attribute")
    public Boolean updateAttribute;

    public static UpdateDdcsResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDdcsResourcesRequest self = new UpdateDdcsResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDdcsResourcesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDdcsResourcesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDdcsResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateDdcsResourcesRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public UpdateDdcsResourcesRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateDdcsResourcesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDdcsResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDdcsResourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateDdcsResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateDdcsResourcesRequest setUpdateAttribute(Boolean updateAttribute) {
        this.updateAttribute = updateAttribute;
        return this;
    }
    public Boolean getUpdateAttribute() {
        return this.updateAttribute;
    }

}
