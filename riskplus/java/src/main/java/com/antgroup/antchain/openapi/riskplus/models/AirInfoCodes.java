// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class AirInfoCodes extends TeaModel {
    // infoCode
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    // infoCode描述
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("description")
    public String description;

    public static AirInfoCodes build(java.util.Map<String, ?> map) throws Exception {
        AirInfoCodes self = new AirInfoCodes();
        return TeaModel.build(map, self);
    }

    public AirInfoCodes setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AirInfoCodes setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
