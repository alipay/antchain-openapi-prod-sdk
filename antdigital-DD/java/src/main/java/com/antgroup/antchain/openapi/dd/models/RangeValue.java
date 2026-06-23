// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class RangeValue extends TeaModel {
    // 范围类型
    /**
     * <strong>example:</strong>
     * <p>()</p>
     */
    @NameInMap("range_type")
    @Validation(required = true)
    public String rangeType;

    // 范围最小值
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("min_value")
    public Long minValue;

    // 范围最大值
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("max_value")
    public Long maxValue;

    // 范围类型时候步长
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("step")
    public Long step;

    public static RangeValue build(java.util.Map<String, ?> map) throws Exception {
        RangeValue self = new RangeValue();
        return TeaModel.build(map, self);
    }

    public RangeValue setRangeType(String rangeType) {
        this.rangeType = rangeType;
        return this;
    }
    public String getRangeType() {
        return this.rangeType;
    }

    public RangeValue setMinValue(Long minValue) {
        this.minValue = minValue;
        return this;
    }
    public Long getMinValue() {
        return this.minValue;
    }

    public RangeValue setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
        return this;
    }
    public Long getMaxValue() {
        return this.maxValue;
    }

    public RangeValue setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

}
