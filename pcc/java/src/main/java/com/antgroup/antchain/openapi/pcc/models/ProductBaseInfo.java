// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class ProductBaseInfo extends TeaModel {
    // 产品码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 产品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品英文名称
    @NameInMap("name_en")
    public String nameEn;

    public static ProductBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductBaseInfo self = new ProductBaseInfo();
        return TeaModel.build(map, self);
    }

    public ProductBaseInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProductBaseInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProductBaseInfo setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }
    public String getNameEn() {
        return this.nameEn;
    }

}
