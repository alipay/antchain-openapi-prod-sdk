// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ResourceInstance extends TeaModel {
    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // zz-rdb
    @NameInMap("resource_pool_name")
    @Validation(required = true)
    public String resourcePoolName;

    // 资源id
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 资源类型：LB、SERVER、RDB
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 区域id
    @NameInMap("region_id")
    public String regionId;

    // 可用区id
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // 部署单元标识id
    @NameInMap("deployment_unit_identity")
    @Validation(required = true)
    public String deploymentUnitIdentity;

    // 部署单元实例id
    @NameInMap("deployment_unit_instance_identity")
    @Validation(required = true)
    public String deploymentUnitInstanceIdentity;

    public static ResourceInstance build(java.util.Map<String, ?> map) throws Exception {
        ResourceInstance self = new ResourceInstance();
        return TeaModel.build(map, self);
    }

    public ResourceInstance setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ResourceInstance setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ResourceInstance setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

    public ResourceInstance setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ResourceInstance setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ResourceInstance setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResourceInstance setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public ResourceInstance setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

    public ResourceInstance setDeploymentUnitInstanceIdentity(String deploymentUnitInstanceIdentity) {
        this.deploymentUnitInstanceIdentity = deploymentUnitInstanceIdentity;
        return this;
    }
    public String getDeploymentUnitInstanceIdentity() {
        return this.deploymentUnitInstanceIdentity;
    }

}
