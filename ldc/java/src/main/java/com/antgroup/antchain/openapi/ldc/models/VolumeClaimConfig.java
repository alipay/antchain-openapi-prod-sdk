// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class VolumeClaimConfig extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    // storage_class
    @NameInMap("storage_class")
    public String storageClass;

    // resourceRequirementConfig
    @NameInMap("resource_requirement_config")
    public ResourceRequirementConfig resourceRequirementConfig;

    public static VolumeClaimConfig build(java.util.Map<String, ?> map) throws Exception {
        VolumeClaimConfig self = new VolumeClaimConfig();
        return TeaModel.build(map, self);
    }

    public VolumeClaimConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VolumeClaimConfig setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public VolumeClaimConfig setResourceRequirementConfig(ResourceRequirementConfig resourceRequirementConfig) {
        this.resourceRequirementConfig = resourceRequirementConfig;
        return this;
    }
    public ResourceRequirementConfig getResourceRequirementConfig() {
        return this.resourceRequirementConfig;
    }

}
