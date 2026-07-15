// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CommodityOrderAttribute extends TeaModel {
    // 属性编码
    /**
     * <strong>example:</strong>
     * <p>SYS_USAGE_AMOUNT</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 属性值
    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
    /**
     * <strong>example:</strong>
     * <p>MB</p>
     */
    @NameInMap("value_unit")
    @Validation(required = true)
    public String valueUnit;

    public static CommodityOrderAttribute build(java.util.Map<String, ?> map) throws Exception {
        CommodityOrderAttribute self = new CommodityOrderAttribute();
        return TeaModel.build(map, self);
    }

    public CommodityOrderAttribute setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CommodityOrderAttribute setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CommodityOrderAttribute setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
        return this;
    }
    public String getValueUnit() {
        return this.valueUnit;
    }

}
