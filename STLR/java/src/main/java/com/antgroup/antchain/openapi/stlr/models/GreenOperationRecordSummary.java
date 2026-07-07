// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GreenOperationRecordSummary extends TeaModel {
    // 绿色行为记录编码
    /**
     * <strong>example:</strong>
     * <p>20220702111231231212</p>
     */
    @NameInMap("green_operation_no")
    @Validation(required = true)
    public String greenOperationNo;

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

    // 发生绿色行为的相关业务单号
    /**
     * <strong>example:</strong>
     * <p>202211131212</p>
     */
    @NameInMap("enterprise_biz_no")
    @Validation(required = true)
    public String enterpriseBizNo;

    // 绿色行为发生时间，格式应如：2021-07-21 12:11:11
    /**
     * <strong>example:</strong>
     * <p>2021-08-09 12:22:11</p>
     */
    @NameInMap("occurrence_time")
    @Validation(required = true)
    public String occurrenceTime;

    // 绿色行为的绿色能量值
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("green_energy_amount")
    @Validation(required = true)
    public Long greenEnergyAmount;

    public static GreenOperationRecordSummary build(java.util.Map<String, ?> map) throws Exception {
        GreenOperationRecordSummary self = new GreenOperationRecordSummary();
        return TeaModel.build(map, self);
    }

    public GreenOperationRecordSummary setGreenOperationNo(String greenOperationNo) {
        this.greenOperationNo = greenOperationNo;
        return this;
    }
    public String getGreenOperationNo() {
        return this.greenOperationNo;
    }

    public GreenOperationRecordSummary setGreenOperationType(String greenOperationType) {
        this.greenOperationType = greenOperationType;
        return this;
    }
    public String getGreenOperationType() {
        return this.greenOperationType;
    }

    public GreenOperationRecordSummary setGreenOperationTypeName(String greenOperationTypeName) {
        this.greenOperationTypeName = greenOperationTypeName;
        return this;
    }
    public String getGreenOperationTypeName() {
        return this.greenOperationTypeName;
    }

    public GreenOperationRecordSummary setEnterpriseBizNo(String enterpriseBizNo) {
        this.enterpriseBizNo = enterpriseBizNo;
        return this;
    }
    public String getEnterpriseBizNo() {
        return this.enterpriseBizNo;
    }

    public GreenOperationRecordSummary setOccurrenceTime(String occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }
    public String getOccurrenceTime() {
        return this.occurrenceTime;
    }

    public GreenOperationRecordSummary setGreenEnergyAmount(Long greenEnergyAmount) {
        this.greenEnergyAmount = greenEnergyAmount;
        return this;
    }
    public Long getGreenEnergyAmount() {
        return this.greenEnergyAmount;
    }

}
