// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ChargeItemVO extends TeaModel {
    // 收费项对应的枚举编码@ProductConstraintEnum 
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("name")
    public String name;

    // 收费项对应的云产品条件code@ProductConstraintEnum
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("code")
    public String code;

    // 使用量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("value")
    public String value;

    // 度量单位
    /**
     * <strong>example:</strong>
     * <p>m</p>
     */
    @NameInMap("unit")
    public String unit;

    // 计费项类型
    /**
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("type")
    public String type;

    // 计费项名称-前端显示
    /**
     * <strong>example:</strong>
     * <p>display_name</p>
     */
    @NameInMap("display_name")
    public String displayName;

    // 计费项单位-前端显示 
    /**
     * <strong>example:</strong>
     * <p>displayUnit</p>
     */
    @NameInMap("display_unit")
    public String displayUnit;

    // 计费项值-前端显示
    /**
     * <strong>example:</strong>
     * <p>display_value</p>
     */
    @NameInMap("display_value")
    public String displayValue;

    public static ChargeItemVO build(java.util.Map<String, ?> map) throws Exception {
        ChargeItemVO self = new ChargeItemVO();
        return TeaModel.build(map, self);
    }

    public ChargeItemVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChargeItemVO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChargeItemVO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ChargeItemVO setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public ChargeItemVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChargeItemVO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ChargeItemVO setDisplayUnit(String displayUnit) {
        this.displayUnit = displayUnit;
        return this;
    }
    public String getDisplayUnit() {
        return this.displayUnit;
    }

    public ChargeItemVO setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
        return this;
    }
    public String getDisplayValue() {
        return this.displayValue;
    }

}
