// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SingleDimGroup extends TeaModel {
    // 维度标识, 如: WORKSPACE
    @NameInMap("dim_identity")
    @Validation(required = true)
    public String dimIdentity;

    // 维度实例的值, 如: 0000000001
    @NameInMap("dim_ins_value")
    @Validation(required = true)
    public String dimInsValue;

    // resource_identity
    @NameInMap("resource_identity")
    @Validation(required = true)
    public String resourceIdentity;

    // 申请的数量，要注意quota_factor，比如当quota_factor=0.1时，申请实际为1的资源时，这里要填10
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static SingleDimGroup build(java.util.Map<String, ?> map) throws Exception {
        SingleDimGroup self = new SingleDimGroup();
        return TeaModel.build(map, self);
    }

    public SingleDimGroup setDimIdentity(String dimIdentity) {
        this.dimIdentity = dimIdentity;
        return this;
    }
    public String getDimIdentity() {
        return this.dimIdentity;
    }

    public SingleDimGroup setDimInsValue(String dimInsValue) {
        this.dimInsValue = dimInsValue;
        return this;
    }
    public String getDimInsValue() {
        return this.dimInsValue;
    }

    public SingleDimGroup setResourceIdentity(String resourceIdentity) {
        this.resourceIdentity = resourceIdentity;
        return this;
    }
    public String getResourceIdentity() {
        return this.resourceIdentity;
    }

    public SingleDimGroup setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
