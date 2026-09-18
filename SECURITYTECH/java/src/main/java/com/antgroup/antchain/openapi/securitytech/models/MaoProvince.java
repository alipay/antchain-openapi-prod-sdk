// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoProvince extends TeaModel {
    // 省编码
    /**
     * <strong>example:</strong>
     * <p>TBJHF</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 省名称
    /**
     * <strong>example:</strong>
     * <p>省名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static MaoProvince build(java.util.Map<String, ?> map) throws Exception {
        MaoProvince self = new MaoProvince();
        return TeaModel.build(map, self);
    }

    public MaoProvince setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MaoProvince setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
