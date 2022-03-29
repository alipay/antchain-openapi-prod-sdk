// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasEntityFieldDto extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // display_name
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    public static TraasEntityFieldDto build(java.util.Map<String, ?> map) throws Exception {
        TraasEntityFieldDto self = new TraasEntityFieldDto();
        return TeaModel.build(map, self);
    }

    public TraasEntityFieldDto setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraasEntityFieldDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
