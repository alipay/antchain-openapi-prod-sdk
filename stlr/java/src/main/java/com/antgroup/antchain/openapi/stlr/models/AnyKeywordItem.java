// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AnyKeywordItem extends TeaModel {
    // 项目编码
    /**
     * <strong>example:</strong>
     * <p>CFD</p>
     */
    @NameInMap("item_code")
    @Validation(required = true)
    public String itemCode;

    // 项目值
    /**
     * <strong>example:</strong>
     * <p>各种按业务场景的取值</p>
     */
    @NameInMap("item_value")
    @Validation(required = true)
    public String itemValue;

    public static AnyKeywordItem build(java.util.Map<String, ?> map) throws Exception {
        AnyKeywordItem self = new AnyKeywordItem();
        return TeaModel.build(map, self);
    }

    public AnyKeywordItem setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public AnyKeywordItem setItemValue(String itemValue) {
        this.itemValue = itemValue;
        return this;
    }
    public String getItemValue() {
        return this.itemValue;
    }

}
