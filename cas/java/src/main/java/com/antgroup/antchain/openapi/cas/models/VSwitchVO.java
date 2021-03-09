// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VSwitchVO extends TeaModel {
    // 交换机的iaas ID
    @NameInMap("iaas_id")
    public String iaasId;

    // 交换机名称
    @NameInMap("name")
    public String name;

    // 交换机描述信息
    @NameInMap("description")
    public String description;

    // 交换机的状态，取值： Pending：配置中。 Available：可用。
    @NameInMap("status")
    public String status;

    // vpc id
    @NameInMap("vpc_id")
    public String vpcId;

    // workspace id
    @NameInMap("workspace_id")
    public String workspaceId;

    // zone id
    @NameInMap("zone_id")
    public String zoneId;

    // zone iaas id
    @NameInMap("zone_iaas_id")
    public String zoneIaasId;

    // region id
    @NameInMap("region_id")
    public String regionId;

    // 换机的IPv4网段
    @NameInMap("cidr_block")
    public String cidrBlock;

    // 交换机创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // 可用ip数目
    @NameInMap("available_ip_address_count")
    public Long availableIpAddressCount;

    public static VSwitchVO build(java.util.Map<String, ?> map) throws Exception {
        VSwitchVO self = new VSwitchVO();
        return TeaModel.build(map, self);
    }

    public VSwitchVO setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public VSwitchVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VSwitchVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VSwitchVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VSwitchVO setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public VSwitchVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public VSwitchVO setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public VSwitchVO setZoneIaasId(String zoneIaasId) {
        this.zoneIaasId = zoneIaasId;
        return this;
    }
    public String getZoneIaasId() {
        return this.zoneIaasId;
    }

    public VSwitchVO setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VSwitchVO setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VSwitchVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public VSwitchVO setAvailableIpAddressCount(Long availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }
    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

}
