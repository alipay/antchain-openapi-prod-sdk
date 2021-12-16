// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    // 类目id
    @NameInMap("catalog_id")
    @Validation(required = true)
    public Long catalogId;

    // 类目名称
    @NameInMap("catalog_name")
    @Validation(required = true)
    public String catalogName;

    public static Catalog build(java.util.Map<String, ?> map) throws Exception {
        Catalog self = new Catalog();
        return TeaModel.build(map, self);
    }

    public Catalog setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public Long getCatalogId() {
        return this.catalogId;
    }

    public Catalog setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

}
