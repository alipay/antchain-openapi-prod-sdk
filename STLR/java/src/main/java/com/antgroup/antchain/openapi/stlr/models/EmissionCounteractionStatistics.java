// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionCounteractionStatistics extends TeaModel {
    // 碳抵消类别
    /**
     * <strong>example:</strong>
     * <p>Quota</p>
     */
    @NameInMap("assert_type")
    @Validation(required = true)
    public String assertType;

    // 碳抵消类别名称
    /**
     * <strong>example:</strong>
     * <p>配额</p>
     */
    @NameInMap("assert_type_name")
    @Validation(required = true)
    public String assertTypeName;

    // 抵消量
    /**
     * <strong>example:</strong>
     * <p>22.22</p>
     */
    @NameInMap("counteraction_amount")
    @Validation(required = true)
    public String counteractionAmount;

    // 排放量单位，默认为：tCO2e
    /**
     * <strong>example:</strong>
     * <p>tCO2e</p>
     */
    @NameInMap("data_unit")
    @Validation(required = true)
    public String dataUnit;

    public static EmissionCounteractionStatistics build(java.util.Map<String, ?> map) throws Exception {
        EmissionCounteractionStatistics self = new EmissionCounteractionStatistics();
        return TeaModel.build(map, self);
    }

    public EmissionCounteractionStatistics setAssertType(String assertType) {
        this.assertType = assertType;
        return this;
    }
    public String getAssertType() {
        return this.assertType;
    }

    public EmissionCounteractionStatistics setAssertTypeName(String assertTypeName) {
        this.assertTypeName = assertTypeName;
        return this;
    }
    public String getAssertTypeName() {
        return this.assertTypeName;
    }

    public EmissionCounteractionStatistics setCounteractionAmount(String counteractionAmount) {
        this.counteractionAmount = counteractionAmount;
        return this;
    }
    public String getCounteractionAmount() {
        return this.counteractionAmount;
    }

    public EmissionCounteractionStatistics setDataUnit(String dataUnit) {
        this.dataUnit = dataUnit;
        return this;
    }
    public String getDataUnit() {
        return this.dataUnit;
    }

}
