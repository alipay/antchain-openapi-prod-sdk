// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomRelationStatus extends TeaModel {
    // 是否联登
    @NameInMap("reg_flag")
    public Boolean regFlag;

    public static CustomRelationStatus build(java.util.Map<String, ?> map) throws Exception {
        CustomRelationStatus self = new CustomRelationStatus();
        return TeaModel.build(map, self);
    }

    public CustomRelationStatus setRegFlag(Boolean regFlag) {
        this.regFlag = regFlag;
        return this;
    }
    public Boolean getRegFlag() {
        return this.regFlag;
    }

}
