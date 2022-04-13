// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CellInfo extends TeaModel {
    // cell display name
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    public static CellInfo build(java.util.Map<String, ?> map) throws Exception {
        CellInfo self = new CellInfo();
        return TeaModel.build(map, self);
    }

    public CellInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
