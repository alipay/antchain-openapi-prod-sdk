// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionsReductionStatistics extends TeaModel {
    // 减排方法
    /**
     * <strong>example:</strong>
     * <p>EnergySubstitution</p>
     */
    @NameInMap("reduction_method")
    @Validation(required = true)
    public String reductionMethod;

    // 减排方法名称
    /**
     * <strong>example:</strong>
     * <p>使用绿电</p>
     */
    @NameInMap("reduction_method_name")
    @Validation(required = true)
    public String reductionMethodName;

    // 减排量
    /**
     * <strong>example:</strong>
     * <p>123123.11</p>
     */
    @NameInMap("reduction_amount")
    @Validation(required = true)
    public String reductionAmount;

    // 减排量占比
    /**
     * <strong>example:</strong>
     * <p>0.22</p>
     */
    @NameInMap("reduction_ratio")
    @Validation(required = true)
    public String reductionRatio;

    // 减排量单位
    /**
     * <strong>example:</strong>
     * <p>tCO2e</p>
     */
    @NameInMap("data_unit")
    @Validation(required = true)
    public String dataUnit;

    public static EmissionsReductionStatistics build(java.util.Map<String, ?> map) throws Exception {
        EmissionsReductionStatistics self = new EmissionsReductionStatistics();
        return TeaModel.build(map, self);
    }

    public EmissionsReductionStatistics setReductionMethod(String reductionMethod) {
        this.reductionMethod = reductionMethod;
        return this;
    }
    public String getReductionMethod() {
        return this.reductionMethod;
    }

    public EmissionsReductionStatistics setReductionMethodName(String reductionMethodName) {
        this.reductionMethodName = reductionMethodName;
        return this;
    }
    public String getReductionMethodName() {
        return this.reductionMethodName;
    }

    public EmissionsReductionStatistics setReductionAmount(String reductionAmount) {
        this.reductionAmount = reductionAmount;
        return this;
    }
    public String getReductionAmount() {
        return this.reductionAmount;
    }

    public EmissionsReductionStatistics setReductionRatio(String reductionRatio) {
        this.reductionRatio = reductionRatio;
        return this;
    }
    public String getReductionRatio() {
        return this.reductionRatio;
    }

    public EmissionsReductionStatistics setDataUnit(String dataUnit) {
        this.dataUnit = dataUnit;
        return this;
    }
    public String getDataUnit() {
        return this.dataUnit;
    }

}
