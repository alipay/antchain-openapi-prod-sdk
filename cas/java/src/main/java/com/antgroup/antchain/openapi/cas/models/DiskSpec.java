// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DiskSpec extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // description
    @NameInMap("description")
    public String description;

    // iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // providerId
    @NameInMap("provider_id")
    public String providerId;

    // iaasType
    @NameInMap("iaas_type")
    public String iaasType;

    // enable
    @NameInMap("enable")
    public Boolean enable;

    // minSize
    @NameInMap("min_size")
    public Long minSize;

    // maxSize
    @NameInMap("max_size")
    public Long maxSize;

    public static DiskSpec build(java.util.Map<String, ?> map) throws Exception {
        DiskSpec self = new DiskSpec();
        return TeaModel.build(map, self);
    }

    public DiskSpec setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DiskSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DiskSpec setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DiskSpec setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public DiskSpec setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public DiskSpec setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public DiskSpec setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public DiskSpec setMinSize(Long minSize) {
        this.minSize = minSize;
        return this;
    }
    public Long getMinSize() {
        return this.minSize;
    }

    public DiskSpec setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Long getMaxSize() {
        return this.maxSize;
    }

}
