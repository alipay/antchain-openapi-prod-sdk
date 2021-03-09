// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VSwitchParam extends TeaModel {
    // cidr_block
    @NameInMap("cidr_block")
    public String cidrBlock;

    // description
    @NameInMap("description")
    public String description;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // vpc_id
    @NameInMap("vpc_id")
    public String vpcId;

    // vswitch_name
    @NameInMap("vswitch_name")
    public String vswitchName;

    // zone_id
    @NameInMap("zone_id")
    public String zoneId;

    public static VSwitchParam build(java.util.Map<String, ?> map) throws Exception {
        VSwitchParam self = new VSwitchParam();
        return TeaModel.build(map, self);
    }

    public VSwitchParam setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VSwitchParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VSwitchParam setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VSwitchParam setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public VSwitchParam setVswitchName(String vswitchName) {
        this.vswitchName = vswitchName;
        return this;
    }
    public String getVswitchName() {
        return this.vswitchName;
    }

    public VSwitchParam setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
