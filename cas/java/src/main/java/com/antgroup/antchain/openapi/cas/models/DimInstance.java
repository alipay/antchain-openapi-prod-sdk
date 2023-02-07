// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DimInstance extends TeaModel {
    // ID字段，实际不会使用，只是数据库中的索引
    @NameInMap("dim_id")
    @Validation(required = true)
    public String dimId;

    // dim_identity
    @NameInMap("dim_identity")
    @Validation(required = true)
    public String dimIdentity;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // description
    @NameInMap("description")
    public String description;

    public static DimInstance build(java.util.Map<String, ?> map) throws Exception {
        DimInstance self = new DimInstance();
        return TeaModel.build(map, self);
    }

    public DimInstance setDimId(String dimId) {
        this.dimId = dimId;
        return this;
    }
    public String getDimId() {
        return this.dimId;
    }

    public DimInstance setDimIdentity(String dimIdentity) {
        this.dimIdentity = dimIdentity;
        return this;
    }
    public String getDimIdentity() {
        return this.dimIdentity;
    }

    public DimInstance setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DimInstance setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
