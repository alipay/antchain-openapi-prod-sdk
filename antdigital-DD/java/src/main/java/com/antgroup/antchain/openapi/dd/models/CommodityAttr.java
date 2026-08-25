// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CommodityAttr extends TeaModel {
    // 规格属性编码
    /**
     * <strong>example:</strong>
     * <p>version</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 规格属性值
    /**
     * <strong>example:</strong>
     * <p>mytc_mini</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 规格属性单位
    /**
     * <strong>example:</strong>
     * <p>个</p>
     */
    @NameInMap("unit")
    public String unit;

    public static CommodityAttr build(java.util.Map<String, ?> map) throws Exception {
        CommodityAttr self = new CommodityAttr();
        return TeaModel.build(map, self);
    }

    public CommodityAttr setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CommodityAttr setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CommodityAttr setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
