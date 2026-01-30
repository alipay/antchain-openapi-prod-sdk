// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CommodityAttribute extends TeaModel {
    // 属性编码
    /**
     * <strong>example:</strong>
     * <p>CAPACITY</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 属性名
    /**
     * <strong>example:</strong>
     * <p>资源包容量</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 默认值
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("default_value")
    @Validation(required = true)
    public String defaultValue;

    // 属性值类型，离散值：DISCRETE，数值：NUMBER
    /**
     * <strong>example:</strong>
     * <p>DISCRETE</p>
     */
    @NameInMap("value_type")
    @Validation(required = true)
    public String valueType;

    // 当是离散值类型时，为多个离散值逗号分隔
    // 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
    /**
     * <strong>example:</strong>
     * <p>100,200</p>
     */
    @NameInMap("value_range")
    @Validation(required = true)
    public String valueRange;

    // 展示类型
    /**
     * <strong>example:</strong>
     * <p>RadioGroup</p>
     */
    @NameInMap("display_type")
    @Validation(required = true)
    public String displayType;

    // 提示文案
    /**
     * <strong>example:</strong>
     * <p>这是一个属性</p>
     */
    @NameInMap("tips")
    @Validation(required = true)
    public String tips;

    // 单位
    /**
     * <strong>example:</strong>
     * <p>次、分钟</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static CommodityAttribute build(java.util.Map<String, ?> map) throws Exception {
        CommodityAttribute self = new CommodityAttribute();
        return TeaModel.build(map, self);
    }

    public CommodityAttribute setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CommodityAttribute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CommodityAttribute setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public CommodityAttribute setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public CommodityAttribute setValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }
    public String getValueRange() {
        return this.valueRange;
    }

    public CommodityAttribute setDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }
    public String getDisplayType() {
        return this.displayType;
    }

    public CommodityAttribute setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

    public CommodityAttribute setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
