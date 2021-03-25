// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AliyunRamAuthContext extends TeaModel {
    // 操作名称
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 条件
    @NameInMap("conditions")
    public java.util.List<Condition> conditions;

    // 唯一ID
    @NameInMap("id")
    public String id;

    // regionId
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 资源
    @NameInMap("resources")
    @Validation(required = true)
    public java.util.List<AliyunResource> resources;

    // 服务名称
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    public static AliyunRamAuthContext build(java.util.Map<String, ?> map) throws Exception {
        AliyunRamAuthContext self = new AliyunRamAuthContext();
        return TeaModel.build(map, self);
    }

    public AliyunRamAuthContext setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public AliyunRamAuthContext setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

    public AliyunRamAuthContext setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AliyunRamAuthContext setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AliyunRamAuthContext setResources(java.util.List<AliyunResource> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<AliyunResource> getResources() {
        return this.resources;
    }

    public AliyunRamAuthContext setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
