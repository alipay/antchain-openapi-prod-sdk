// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class Filter extends TeaModel {
    // join_model_id
    @NameInMap("join_model_id")
    @Validation(required = true)
    public String joinModelId;

    // conditions
    @NameInMap("conditions")
    @Validation(required = true)
    public java.util.List<Condition> conditions;

    public static Filter build(java.util.Map<String, ?> map) throws Exception {
        Filter self = new Filter();
        return TeaModel.build(map, self);
    }

    public Filter setJoinModelId(String joinModelId) {
        this.joinModelId = joinModelId;
        return this;
    }
    public String getJoinModelId() {
        return this.joinModelId;
    }

    public Filter setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

}
