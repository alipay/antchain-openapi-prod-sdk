// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionsCityStatistics extends TeaModel {
    // 城市编码
    /**
     * <strong>example:</strong>
     * <p>637401</p>
     */
    @NameInMap("city_no")
    @Validation(required = true)
    public String cityNo;

    // 城市名称
    /**
     * <strong>example:</strong>
     * <p>南充市</p>
     */
    @NameInMap("city_name")
    @Validation(required = true)
    public String cityName;

    // 累计排放量
    /**
     * <strong>example:</strong>
     * <p>222.22</p>
     */
    @NameInMap("emission_amount")
    @Validation(required = true)
    public String emissionAmount;

    // 今日新增碳排放量
    /**
     * <strong>example:</strong>
     * <p>22.22</p>
     */
    @NameInMap("emission_amount_today")
    @Validation(required = true)
    public String emissionAmountToday;

    // 总减碳量
    /**
     * <strong>example:</strong>
     * <p>21.11</p>
     */
    @NameInMap("reduction_amount")
    @Validation(required = true)
    public String reductionAmount;

    // 今日减碳量
    /**
     * <strong>example:</strong>
     * <p>9.11</p>
     */
    @NameInMap("reduction_amount_today")
    @Validation(required = true)
    public String reductionAmountToday;

    // 总抵消量
    /**
     * <strong>example:</strong>
     * <p>9.11</p>
     */
    @NameInMap("counteraction_amount")
    @Validation(required = true)
    public String counteractionAmount;

    // 今日抵消量
    /**
     * <strong>example:</strong>
     * <p>2.11</p>
     */
    @NameInMap("counteraction_amount_today")
    @Validation(required = true)
    public String counteractionAmountToday;

    // 排放量单位，默认为：
    /**
     * <strong>example:</strong>
     * <p>tCO2e</p>
     */
    @NameInMap("data_unit")
    @Validation(required = true)
    public String dataUnit;

    public static EmissionsCityStatistics build(java.util.Map<String, ?> map) throws Exception {
        EmissionsCityStatistics self = new EmissionsCityStatistics();
        return TeaModel.build(map, self);
    }

    public EmissionsCityStatistics setCityNo(String cityNo) {
        this.cityNo = cityNo;
        return this;
    }
    public String getCityNo() {
        return this.cityNo;
    }

    public EmissionsCityStatistics setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

    public EmissionsCityStatistics setEmissionAmount(String emissionAmount) {
        this.emissionAmount = emissionAmount;
        return this;
    }
    public String getEmissionAmount() {
        return this.emissionAmount;
    }

    public EmissionsCityStatistics setEmissionAmountToday(String emissionAmountToday) {
        this.emissionAmountToday = emissionAmountToday;
        return this;
    }
    public String getEmissionAmountToday() {
        return this.emissionAmountToday;
    }

    public EmissionsCityStatistics setReductionAmount(String reductionAmount) {
        this.reductionAmount = reductionAmount;
        return this;
    }
    public String getReductionAmount() {
        return this.reductionAmount;
    }

    public EmissionsCityStatistics setReductionAmountToday(String reductionAmountToday) {
        this.reductionAmountToday = reductionAmountToday;
        return this;
    }
    public String getReductionAmountToday() {
        return this.reductionAmountToday;
    }

    public EmissionsCityStatistics setCounteractionAmount(String counteractionAmount) {
        this.counteractionAmount = counteractionAmount;
        return this;
    }
    public String getCounteractionAmount() {
        return this.counteractionAmount;
    }

    public EmissionsCityStatistics setCounteractionAmountToday(String counteractionAmountToday) {
        this.counteractionAmountToday = counteractionAmountToday;
        return this;
    }
    public String getCounteractionAmountToday() {
        return this.counteractionAmountToday;
    }

    public EmissionsCityStatistics setDataUnit(String dataUnit) {
        this.dataUnit = dataUnit;
        return this;
    }
    public String getDataUnit() {
        return this.dataUnit;
    }

}
