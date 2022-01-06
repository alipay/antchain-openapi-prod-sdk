// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DrmResource extends TeaModel {
    // appName
    @NameInMap("app_name")
    public String appName;

    // 资源属性列表
    @NameInMap("attributes")
    public java.util.List<DrmAttribute> attributes;

    // drm资源id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
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

    public static DrmResource build(java.util.Map<String, ?> map) throws Exception {
        DrmResource self = new DrmResource();
        return TeaModel.build(map, self);
    }

    public DrmResource setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DrmResource setAttributes(java.util.List<DrmAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<DrmAttribute> getAttributes() {
        return this.attributes;
    }

    public DrmResource setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DrmResource setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DrmResource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DrmResource setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DrmResource setResourceDomain(String resourceDomain) {
        this.resourceDomain = resourceDomain;
        return this;
    }
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    public DrmResource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DrmResource setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public DrmResource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
