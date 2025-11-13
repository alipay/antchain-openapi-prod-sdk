// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ProductSpecOption extends TeaModel {
    // 规格key
    /**
     * <strong>example:</strong>
     * <p>规格key</p>
     */
    @NameInMap("spec_key")
    public String specKey;

    // 规格名称
    /**
     * <strong>example:</strong>
     * <p>规格名称</p>
     */
    @NameInMap("display_name")
    public String displayName;

    // 规格值
    /**
     * <strong>example:</strong>
     * <p>规格值</p>
     */
    @NameInMap("spec_value")
    public String specValue;

    public static ProductSpecOption build(java.util.Map<String, ?> map) throws Exception {
        ProductSpecOption self = new ProductSpecOption();
        return TeaModel.build(map, self);
    }

    public ProductSpecOption setSpecKey(String specKey) {
        this.specKey = specKey;
        return this;
    }
    public String getSpecKey() {
        return this.specKey;
    }

    public ProductSpecOption setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ProductSpecOption setSpecValue(String specValue) {
        this.specValue = specValue;
        return this;
    }
    public String getSpecValue() {
        return this.specValue;
    }

}
