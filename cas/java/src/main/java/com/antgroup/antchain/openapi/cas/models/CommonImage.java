// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CommonImage extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // is enable
    @NameInMap("enable")
    public Boolean enable;

    // iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // iaas type
    @NameInMap("iaas_type")
    public String iaasType;

    // id
    @NameInMap("id")
    public String id;

    // 是否仅杭州金区 vpc 可用镜像
    @NameInMap("only_hz_fin_vpc_supported")
    public Boolean onlyHzFinVpcSupported;

    // name
    @NameInMap("name")
    public String name;

    // os
    @NameInMap("os")
    public String os;

    // os bit取值：32，64
    @NameInMap("os_bit")
    public Long osBit;

    // os version
    @NameInMap("os_version")
    public String osVersion;

    // provider id
    @NameInMap("provider_id")
    public String providerId;

    // region id
    @NameInMap("region_id")
    public String regionId;

    // status
    @NameInMap("status")
    public String status;

    // system disk size(GB)
    @NameInMap("system_disk_size")
    public Long systemDiskSize;

    public static CommonImage build(java.util.Map<String, ?> map) throws Exception {
        CommonImage self = new CommonImage();
        return TeaModel.build(map, self);
    }

    public CommonImage setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CommonImage setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CommonImage setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public CommonImage setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public CommonImage setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CommonImage setOnlyHzFinVpcSupported(Boolean onlyHzFinVpcSupported) {
        this.onlyHzFinVpcSupported = onlyHzFinVpcSupported;
        return this;
    }
    public Boolean getOnlyHzFinVpcSupported() {
        return this.onlyHzFinVpcSupported;
    }

    public CommonImage setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CommonImage setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CommonImage setOsBit(Long osBit) {
        this.osBit = osBit;
        return this;
    }
    public Long getOsBit() {
        return this.osBit;
    }

    public CommonImage setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public CommonImage setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public CommonImage setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CommonImage setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CommonImage setSystemDiskSize(Long systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Long getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
