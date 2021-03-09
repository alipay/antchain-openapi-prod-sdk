// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VSwitch extends TeaModel {
    // 交换机的IPv4网段
    @NameInMap("cidr_block")
    public String cidrBlock;

    // 交换机的创建时间
    @NameInMap("creation_time")
    public String creationTime;

    // 交换机的描述信息
    @NameInMap("description")
    public String description;

    // cn-hangzhou
    @NameInMap("region_id")
    public String regionId;

    // 交换机的状态，取值：
    // 
    // Pending：配置中。
    // Available：可用。
    @NameInMap("status")
    public String status;

    // 交换机所属VPC的ID
    @NameInMap("vpc_id")
    public String vpcId;

    // 交换机的ID
    @NameInMap("v_switch_id")
    public String vSwitchId;

    // 交换机的名称
    @NameInMap("v_switch_name")
    public String vSwitchName;

    // 交换机所属的可用区
    @NameInMap("zone_id")
    public String zoneId;

    // zone iaas id
    @NameInMap("zone_iaas_id")
    public String zoneIaasId;

    public static VSwitch build(java.util.Map<String, ?> map) throws Exception {
        VSwitch self = new VSwitch();
        return TeaModel.build(map, self);
    }

    public VSwitch setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VSwitch setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public VSwitch setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VSwitch setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VSwitch setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VSwitch setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public VSwitch setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public VSwitch setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public VSwitch setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public VSwitch setZoneIaasId(String zoneIaasId) {
        this.zoneIaasId = zoneIaasId;
        return this;
    }
    public String getZoneIaasId() {
        return this.zoneIaasId;
    }

}
