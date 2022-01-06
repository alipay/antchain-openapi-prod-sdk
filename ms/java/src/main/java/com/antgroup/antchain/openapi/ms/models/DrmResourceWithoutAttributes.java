// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DrmResourceWithoutAttributes extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    public String appName;

    // id
    @NameInMap("id")
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 资源类描述
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 资源类所属的域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // Region.appName
    @NameInMap("resource_domain")
    @Validation(required = true)
    public String resourceDomain;

    // 资源id
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 资源版本号固定 3.0
    @NameInMap("resource_version")
    @Validation(required = true)
    public String resourceVersion;

    // 资源类型，tpl 表示模板类型，normal 表示普通资源
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static DrmResourceWithoutAttributes build(java.util.Map<String, ?> map) throws Exception {
        DrmResourceWithoutAttributes self = new DrmResourceWithoutAttributes();
        return TeaModel.build(map, self);
    }

    public DrmResourceWithoutAttributes setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DrmResourceWithoutAttributes setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DrmResourceWithoutAttributes setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DrmResourceWithoutAttributes setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DrmResourceWithoutAttributes setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DrmResourceWithoutAttributes setResourceDomain(String resourceDomain) {
        this.resourceDomain = resourceDomain;
        return this;
    }
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    public DrmResourceWithoutAttributes setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DrmResourceWithoutAttributes setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public DrmResourceWithoutAttributes setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
