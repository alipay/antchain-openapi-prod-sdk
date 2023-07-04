// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Product extends TeaModel {
    // 数据库变更
    @NameInMap("database")
    @Validation(required = true)
    public java.util.List<DatabaseSchema> database;

    // 产品元信息
    @NameInMap("meta")
    @Validation(required = true)
    public ProductMeta meta;

    // 产品共享参数
    @NameInMap("parameters")
    public java.util.List<Parameter> parameters;

    public static Product build(java.util.Map<String, ?> map) throws Exception {
        Product self = new Product();
        return TeaModel.build(map, self);
    }

    public Product setDatabase(java.util.List<DatabaseSchema> database) {
        this.database = database;
        return this;
    }
    public java.util.List<DatabaseSchema> getDatabase() {
        return this.database;
    }

    public Product setMeta(ProductMeta meta) {
        this.meta = meta;
        return this;
    }
    public ProductMeta getMeta() {
        return this.meta;
    }

    public Product setParameters(java.util.List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<Parameter> getParameters() {
        return this.parameters;
    }

}
