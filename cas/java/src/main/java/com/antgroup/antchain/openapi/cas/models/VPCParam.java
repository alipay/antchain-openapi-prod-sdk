// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VPCParam extends TeaModel {
    // cidr_block
    @NameInMap("cidr_block")
    public String cidrBlock;

    // description
    @NameInMap("description")
    public String description;

    // region id
    @NameInMap("region_id")
    public String regionId;

    // vpc_name
    @NameInMap("vpc_name")
    public String vpcName;

    public static VPCParam build(java.util.Map<String, ?> map) throws Exception {
        VPCParam self = new VPCParam();
        return TeaModel.build(map, self);
    }

    public VPCParam setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VPCParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VPCParam setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VPCParam setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

}
