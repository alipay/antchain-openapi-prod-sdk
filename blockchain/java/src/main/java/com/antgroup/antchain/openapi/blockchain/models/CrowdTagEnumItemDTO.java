// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CrowdTagEnumItemDTO extends TeaModel {
    // 枚举名称
    /**
     * <strong>example:</strong>
     * <p>性别</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 枚举值
    /**
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("val")
    @Validation(required = true)
    public String val;

    public static CrowdTagEnumItemDTO build(java.util.Map<String, ?> map) throws Exception {
        CrowdTagEnumItemDTO self = new CrowdTagEnumItemDTO();
        return TeaModel.build(map, self);
    }

    public CrowdTagEnumItemDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CrowdTagEnumItemDTO setVal(String val) {
        this.val = val;
        return this;
    }
    public String getVal() {
        return this.val;
    }

}
