// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GreenOperationStatisticsByFrequence extends TeaModel {
    // 绿色行为发生时期
    /**
     * <strong>example:</strong>
     * <p>2021-09</p>
     */
    @NameInMap("occurrence_period")
    @Validation(required = true)
    public String occurrencePeriod;

    // 绿色行为产生的绿色能量值
    /**
     * <strong>example:</strong>
     * <p>11212</p>
     */
    @NameInMap("green_energy_amount")
    @Validation(required = true)
    public Long greenEnergyAmount;

    // 时期内发生绿色行为的记录条数
    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("green_operation_records")
    @Validation(required = true)
    public Long greenOperationRecords;

    public static GreenOperationStatisticsByFrequence build(java.util.Map<String, ?> map) throws Exception {
        GreenOperationStatisticsByFrequence self = new GreenOperationStatisticsByFrequence();
        return TeaModel.build(map, self);
    }

    public GreenOperationStatisticsByFrequence setOccurrencePeriod(String occurrencePeriod) {
        this.occurrencePeriod = occurrencePeriod;
        return this;
    }
    public String getOccurrencePeriod() {
        return this.occurrencePeriod;
    }

    public GreenOperationStatisticsByFrequence setGreenEnergyAmount(Long greenEnergyAmount) {
        this.greenEnergyAmount = greenEnergyAmount;
        return this;
    }
    public Long getGreenEnergyAmount() {
        return this.greenEnergyAmount;
    }

    public GreenOperationStatisticsByFrequence setGreenOperationRecords(Long greenOperationRecords) {
        this.greenOperationRecords = greenOperationRecords;
        return this;
    }
    public Long getGreenOperationRecords() {
        return this.greenOperationRecords;
    }

}
