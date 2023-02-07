// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DimInstanceGroup extends TeaModel {
    // dim_group_id
    @NameInMap("dim_group_id")
    @Validation(required = true)
    public String dimGroupId;

    // dim_instances
    @NameInMap("dim_instances")
    @Validation(required = true)
    public java.util.List<DimInstance> dimInstances;

    public static DimInstanceGroup build(java.util.Map<String, ?> map) throws Exception {
        DimInstanceGroup self = new DimInstanceGroup();
        return TeaModel.build(map, self);
    }

    public DimInstanceGroup setDimGroupId(String dimGroupId) {
        this.dimGroupId = dimGroupId;
        return this;
    }
    public String getDimGroupId() {
        return this.dimGroupId;
    }

    public DimInstanceGroup setDimInstances(java.util.List<DimInstance> dimInstances) {
        this.dimInstances = dimInstances;
        return this;
    }
    public java.util.List<DimInstance> getDimInstances() {
        return this.dimInstances;
    }

}
