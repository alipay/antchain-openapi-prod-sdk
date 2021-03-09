// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VpcVO extends TeaModel {
    // VPC的状态，取值： Pending：配置中。 Available：可用。
    @NameInMap("status")
    public String status;

    // VPC的IPv4网段
    @NameInMap("cidr_block")
    public String cidrBlock;

    // VPC路由器的ID
    @NameInMap("v_router_iaas_id")
    public String vRouterIaasId;

    // workspace id
    @NameInMap("workspace_id")
    public String workspaceId;

    // vpc name
    @NameInMap("name")
    public String name;

    // 描述信息
    @NameInMap("description")
    public String description;

    // 计费类型
    @NameInMap("instance_charge_type")
    public String instanceChargeType;

    // vpc iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // provider id
    @NameInMap("provider_id")
    public String providerId;

    // iaas 底座类型
    @NameInMap("iaas_type")
    public String iaasType;

    // region id
    @NameInMap("region_id")
    public String regionId;

    // zone id
    @NameInMap("zone_id")
    public String zoneId;

    // vpc id
    @NameInMap("id")
    public String id;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // 最近一次修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    public static VpcVO build(java.util.Map<String, ?> map) throws Exception {
        VpcVO self = new VpcVO();
        return TeaModel.build(map, self);
    }

    public VpcVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VpcVO setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VpcVO setVRouterIaasId(String vRouterIaasId) {
        this.vRouterIaasId = vRouterIaasId;
        return this;
    }
    public String getVRouterIaasId() {
        return this.vRouterIaasId;
    }

    public VpcVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public VpcVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VpcVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VpcVO setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public VpcVO setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public VpcVO setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public VpcVO setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public VpcVO setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VpcVO setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public VpcVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public VpcVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public VpcVO setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
