// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoCity extends TeaModel {
    // 市编码
    /**
     * <strong>example:</strong>
     * <p>市编码</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 市名称
    /**
     * <strong>example:</strong>
     * <p>市名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static MaoCity build(java.util.Map<String, ?> map) throws Exception {
        MaoCity self = new MaoCity();
        return TeaModel.build(map, self);
    }

    public MaoCity setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MaoCity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
