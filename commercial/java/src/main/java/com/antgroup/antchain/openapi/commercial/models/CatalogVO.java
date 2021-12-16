// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CatalogVO extends TeaModel {
    // 类目Id
    @NameInMap("catalog_id")
    @Validation(required = true)
    public Long catalogId;

    // 类目名称
    @NameInMap("catalog_name")
    @Validation(required = true)
    public String catalogName;

    // 子类目列表
    @NameInMap("child_catalogs")
    @Validation(required = true)
    public java.util.List<Catalog> childCatalogs;

    public static CatalogVO build(java.util.Map<String, ?> map) throws Exception {
        CatalogVO self = new CatalogVO();
        return TeaModel.build(map, self);
    }

    public CatalogVO setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public Long getCatalogId() {
        return this.catalogId;
    }

    public CatalogVO setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public CatalogVO setChildCatalogs(java.util.List<Catalog> childCatalogs) {
        this.childCatalogs = childCatalogs;
        return this;
    }
    public java.util.List<Catalog> getChildCatalogs() {
        return this.childCatalogs;
    }

}
