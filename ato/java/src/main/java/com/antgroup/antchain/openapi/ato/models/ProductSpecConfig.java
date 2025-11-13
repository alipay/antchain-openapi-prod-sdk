// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ProductSpecConfig extends TeaModel {
    // 规格名称
    /**
     * <strong>example:</strong>
     * <p>color</p>
     */
    @NameInMap("spec_key")
    public String specKey;

    // 规格名称
    /**
     * <strong>example:</strong>
     * <p>颜色</p>
     */
    @NameInMap("display_name")
    public String displayName;

    // 允许值列表
    @NameInMap("spec_value_list")
    public java.util.List<ProductSpecValue> specValueList;

    public static ProductSpecConfig build(java.util.Map<String, ?> map) throws Exception {
        ProductSpecConfig self = new ProductSpecConfig();
        return TeaModel.build(map, self);
    }

    public ProductSpecConfig setSpecKey(String specKey) {
        this.specKey = specKey;
        return this;
    }
    public String getSpecKey() {
        return this.specKey;
    }

    public ProductSpecConfig setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ProductSpecConfig setSpecValueList(java.util.List<ProductSpecValue> specValueList) {
        this.specValueList = specValueList;
        return this;
    }
    public java.util.List<ProductSpecValue> getSpecValueList() {
        return this.specValueList;
    }

}
