// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProductInstanceMeta extends TeaModel {
    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 产品Code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 实例名称，同一个ns下不可重复
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ProductInstanceMeta build(java.util.Map<String, ?> map) throws Exception {
        ProductInstanceMeta self = new ProductInstanceMeta();
        return TeaModel.build(map, self);
    }

    public ProductInstanceMeta setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ProductInstanceMeta setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ProductInstanceMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
