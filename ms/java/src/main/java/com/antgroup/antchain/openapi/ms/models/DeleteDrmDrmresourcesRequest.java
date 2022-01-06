// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DeleteDrmDrmresourcesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app name
    @NameInMap("app_name")
    public String appName;

    // drm资源id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 描述字段
    @NameInMap("name")
    public String name;

    // 资源域
    @NameInMap("region")
    public String region;

    // 资源域和应用名
    @NameInMap("resource_domain")
    public String resourceDomain;

    // 资源类路径
    @NameInMap("resource_id")
    public String resourceId;

    // 资源版本
    @NameInMap("resource_version")
    public String resourceVersion;

    // type
    @NameInMap("type")
    public String type;

    public static DeleteDrmDrmresourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDrmDrmresourcesRequest self = new DeleteDrmDrmresourcesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDrmDrmresourcesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDrmDrmresourcesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDrmDrmresourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteDrmDrmresourcesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDrmDrmresourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDrmDrmresourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteDrmDrmresourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteDrmDrmresourcesRequest setResourceDomain(String resourceDomain) {
        this.resourceDomain = resourceDomain;
        return this;
    }
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    public DeleteDrmDrmresourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DeleteDrmDrmresourcesRequest setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public DeleteDrmDrmresourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
