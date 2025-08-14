// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class InstitutionType extends TeaModel {
    // 机构类型编码
    // ISSUER/PLATFORM/DISTRIBUTOR
    /**
     * <strong>example:</strong>
     * <p>ISSUER</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 机构类型名称
    //  ISSUER/PLATFORM/DISTRIBUTOR
    /**
     * <strong>example:</strong>
     * <p>ISSUER</p>
     */
    @NameInMap("name")
    public String name;

    public static InstitutionType build(java.util.Map<String, ?> map) throws Exception {
        InstitutionType self = new InstitutionType();
        return TeaModel.build(map, self);
    }

    public InstitutionType setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstitutionType setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
