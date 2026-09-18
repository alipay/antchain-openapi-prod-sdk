// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoDistrictCode extends TeaModel {
    // 行政区划编码
    /**
     * <strong>example:</strong>
     * <p>行政区划编码</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 行政区划名称
    /**
     * <strong>example:</strong>
     * <p>行政区划名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static MaoDistrictCode build(java.util.Map<String, ?> map) throws Exception {
        MaoDistrictCode self = new MaoDistrictCode();
        return TeaModel.build(map, self);
    }

    public MaoDistrictCode setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MaoDistrictCode setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
