// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GreenOperationStatisticsByType extends TeaModel {
    // 绿色行为类型
    /**
     * <strong>example:</strong>
     * <p>ElectronicInvoice</p>
     */
    @NameInMap("green_operation_type")
    @Validation(required = true)
    public String greenOperationType;

    // 绿色行为类型名称
    /**
     * <strong>example:</strong>
     * <p>电子发票</p>
     */
    @NameInMap("green_operation_type_name")
    @Validation(required = true)
    public String greenOperationTypeName;

    // 绿色行为产生的绿色能量值
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("green_energy_amount")
    @Validation(required = true)
    public Long greenEnergyAmount;

    // 相关类型的绿色行为记录数
    /**
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("green_operation_records")
    @Validation(required = true)
    public Long greenOperationRecords;

    public static GreenOperationStatisticsByType build(java.util.Map<String, ?> map) throws Exception {
        GreenOperationStatisticsByType self = new GreenOperationStatisticsByType();
        return TeaModel.build(map, self);
    }

    public GreenOperationStatisticsByType setGreenOperationType(String greenOperationType) {
        this.greenOperationType = greenOperationType;
        return this;
    }
    public String getGreenOperationType() {
        return this.greenOperationType;
    }

    public GreenOperationStatisticsByType setGreenOperationTypeName(String greenOperationTypeName) {
        this.greenOperationTypeName = greenOperationTypeName;
        return this;
    }
    public String getGreenOperationTypeName() {
        return this.greenOperationTypeName;
    }

    public GreenOperationStatisticsByType setGreenEnergyAmount(Long greenEnergyAmount) {
        this.greenEnergyAmount = greenEnergyAmount;
        return this;
    }
    public Long getGreenEnergyAmount() {
        return this.greenEnergyAmount;
    }

    public GreenOperationStatisticsByType setGreenOperationRecords(Long greenOperationRecords) {
        this.greenOperationRecords = greenOperationRecords;
        return this;
    }
    public Long getGreenOperationRecords() {
        return this.greenOperationRecords;
    }

}
