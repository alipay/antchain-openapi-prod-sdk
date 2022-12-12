// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionsCityStatistics extends TeaModel {
    // 城市编码
    @NameInMap("city_no")
    @Validation(required = true)
    public String cityNo;

    // 城市名称
    @NameInMap("city_name")
    @Validation(required = true)
    public String cityName;

    // 累计排放量
    @NameInMap("emission_amount")
    @Validation(required = true)
    public Long emissionAmount;

    // 今日新增碳排放量
    @NameInMap("emission_amount_today")
    @Validation(required = true)
    public Long emissionAmountToday;

    // 总减碳量
    @NameInMap("reduction_amount")
    @Validation(required = true)
    public Long reductionAmount;

    // 今日减碳量
    @NameInMap("reduction_amount_today")
    @Validation(required = true)
    public Long reductionAmountToday;

    // 总抵消量
    @NameInMap("counteraction_amount")
    @Validation(required = true)
    public Long counteractionAmount;

    // 今日抵消量
    @NameInMap("counteraction_amount_today")
    @Validation(required = true)
    public Long counteractionAmountToday;

    // 排放量单位，默认为：
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

    public EmissionsCityStatistics setEmissionAmount(Long emissionAmount) {
        this.emissionAmount = emissionAmount;
        return this;
    }
    public Long getEmissionAmount() {
        return this.emissionAmount;
    }

    public EmissionsCityStatistics setEmissionAmountToday(Long emissionAmountToday) {
        this.emissionAmountToday = emissionAmountToday;
        return this;
    }
    public Long getEmissionAmountToday() {
        return this.emissionAmountToday;
    }

    public EmissionsCityStatistics setReductionAmount(Long reductionAmount) {
        this.reductionAmount = reductionAmount;
        return this;
    }
    public Long getReductionAmount() {
        return this.reductionAmount;
    }

    public EmissionsCityStatistics setReductionAmountToday(Long reductionAmountToday) {
        this.reductionAmountToday = reductionAmountToday;
        return this;
    }
    public Long getReductionAmountToday() {
        return this.reductionAmountToday;
    }

    public EmissionsCityStatistics setCounteractionAmount(Long counteractionAmount) {
        this.counteractionAmount = counteractionAmount;
        return this;
    }
    public Long getCounteractionAmount() {
        return this.counteractionAmount;
    }

    public EmissionsCityStatistics setCounteractionAmountToday(Long counteractionAmountToday) {
        this.counteractionAmountToday = counteractionAmountToday;
        return this;
    }
    public Long getCounteractionAmountToday() {
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
