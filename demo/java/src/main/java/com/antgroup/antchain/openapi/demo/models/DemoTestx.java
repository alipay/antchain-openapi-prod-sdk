// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class DemoTestx extends TeaModel {
    // ability_id
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    public static DemoTestx build(java.util.Map<String, ?> map) throws Exception {
        DemoTestx self = new DemoTestx();
        return TeaModel.build(map, self);
    }

    public DemoTestx setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

}
