// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ResourcePool extends TeaModel {
    // 资源池名称, Local站点下唯一
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 资源的提供者, ALB,SLB,ALISQL,RDS,OCEANBASE,AFS,OSS,ECS,ALIYUNECS
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    // 支持的资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源池访问信息
    @NameInMap("access_info")
    @Validation(required = true)
    public String accessInfo;

    // 所属cloud的id
    @NameInMap("cloud_id")
    @Validation(required = true)
    public String cloudId;

    public static ResourcePool build(java.util.Map<String, ?> map) throws Exception {
        ResourcePool self = new ResourcePool();
        return TeaModel.build(map, self);
    }

    public ResourcePool setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResourcePool setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ResourcePool setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ResourcePool setAccessInfo(String accessInfo) {
        this.accessInfo = accessInfo;
        return this;
    }
    public String getAccessInfo() {
        return this.accessInfo;
    }

    public ResourcePool setCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }
    public String getCloudId() {
        return this.cloudId;
    }

}
