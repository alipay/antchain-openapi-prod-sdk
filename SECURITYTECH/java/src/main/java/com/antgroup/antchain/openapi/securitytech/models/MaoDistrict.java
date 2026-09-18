// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoDistrict extends TeaModel {
    // 区编码
    /**
     * <strong>example:</strong>
     * <p>区编码</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 区名称
    /**
     * <strong>example:</strong>
     * <p>区名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static MaoDistrict build(java.util.Map<String, ?> map) throws Exception {
        MaoDistrict self = new MaoDistrict();
        return TeaModel.build(map, self);
    }

    public MaoDistrict setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MaoDistrict setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
