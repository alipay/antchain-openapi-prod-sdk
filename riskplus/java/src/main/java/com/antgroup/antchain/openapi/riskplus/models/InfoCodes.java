// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class InfoCodes extends TeaModel {
    // infocode
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static InfoCodes build(java.util.Map<String, ?> map) throws Exception {
        InfoCodes self = new InfoCodes();
        return TeaModel.build(map, self);
    }

    public InfoCodes setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
