// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DrmResourceTpl extends TeaModel {
    // app name
    @NameInMap("app_name")
    public String appName;

    // 资源属性列表
    @NameInMap("attributes")
    public java.util.List<DrmAttribute> attributes;

    // 描述
    @NameInMap("desc")
    public String desc;

    // 所有单元中是否存在有特殊推送过值的单元
    @NameInMap("has_instance")
    public Boolean hasInstance;

    // drm资源id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 资源域
    @NameInMap("region")
    public String region;

    // 资源类路径
    @NameInMap("resource_id")
    public String resourceId;

    public static DrmResourceTpl build(java.util.Map<String, ?> map) throws Exception {
        DrmResourceTpl self = new DrmResourceTpl();
        return TeaModel.build(map, self);
    }

    public DrmResourceTpl setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DrmResourceTpl setAttributes(java.util.List<DrmAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<DrmAttribute> getAttributes() {
        return this.attributes;
    }

    public DrmResourceTpl setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DrmResourceTpl setHasInstance(Boolean hasInstance) {
        this.hasInstance = hasInstance;
        return this;
    }
    public Boolean getHasInstance() {
        return this.hasInstance;
    }

    public DrmResourceTpl setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DrmResourceTpl setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DrmResourceTpl setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DrmResourceTpl setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
