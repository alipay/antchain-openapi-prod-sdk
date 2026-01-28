// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AnyStatisticalItem extends TeaModel {
    // 统计项目编码
    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("item_code")
    @Validation(required = true)
    public String itemCode;

    // 数据值，按字符串输出，最多保留6位小数
    /**
     * <strong>example:</strong>
     * <p>222.22</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 单位编码
    /**
     * <strong>example:</strong>
     * <p>t</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    // 单位标签
    /**
     * <strong>example:</strong>
     * <p>吨</p>
     */
    @NameInMap("unit_label")
    @Validation(required = true)
    public String unitLabel;

    public static AnyStatisticalItem build(java.util.Map<String, ?> map) throws Exception {
        AnyStatisticalItem self = new AnyStatisticalItem();
        return TeaModel.build(map, self);
    }

    public AnyStatisticalItem setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public AnyStatisticalItem setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public AnyStatisticalItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public AnyStatisticalItem setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
        return this;
    }
    public String getUnitLabel() {
        return this.unitLabel;
    }

}
