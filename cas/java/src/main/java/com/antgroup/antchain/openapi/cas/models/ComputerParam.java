// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ComputerParam extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // name
    @NameInMap("name")
    public String name;

    // image_id
    @NameInMap("image_id")
    public String imageId;

    // instance_type
    @NameInMap("instance_type")
    public String instanceType;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // security_group_id
    @NameInMap("security_group_id")
    public String securityGroupId;

    // instance_name
    @NameInMap("instance_name")
    public String instanceName;

    // zone_id
    @NameInMap("zone_id")
    public String zoneId;

    public static ComputerParam build(java.util.Map<String, ?> map) throws Exception {
        ComputerParam self = new ComputerParam();
        return TeaModel.build(map, self);
    }

    public ComputerParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComputerParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ComputerParam setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ComputerParam setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ComputerParam setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ComputerParam setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ComputerParam setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ComputerParam setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
