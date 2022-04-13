// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class EmergencyPlan extends TeaModel {
    // 预案id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 预案名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static EmergencyPlan build(java.util.Map<String, ?> map) throws Exception {
        EmergencyPlan self = new EmergencyPlan();
        return TeaModel.build(map, self);
    }

    public EmergencyPlan setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EmergencyPlan setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
