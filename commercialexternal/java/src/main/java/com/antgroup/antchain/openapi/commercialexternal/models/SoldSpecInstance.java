// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercialexternal.models;

import com.aliyun.tea.*;

public class SoldSpecInstance extends TeaModel {
    // 规格码
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // 规格实例id
    @NameInMap("spec_instance_id")
    @Validation(required = true)
    public String specInstanceId;

    // 规格实例运行状态. 
    // STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中......
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 实例生效时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 实例计划停服时间
    @NameInMap("plan_stop_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String planStopTime;

    // 实例实际停服时间
    @NameInMap("actual_stop_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String actualStopTime;

    // 购买规格实例的商户id(商业中台用来唯一标识商户的id)
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    public static SoldSpecInstance build(java.util.Map<String, ?> map) throws Exception {
        SoldSpecInstance self = new SoldSpecInstance();
        return TeaModel.build(map, self);
    }

    public SoldSpecInstance setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public SoldSpecInstance setSpecInstanceId(String specInstanceId) {
        this.specInstanceId = specInstanceId;
        return this;
    }
    public String getSpecInstanceId() {
        return this.specInstanceId;
    }

    public SoldSpecInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SoldSpecInstance setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SoldSpecInstance setPlanStopTime(String planStopTime) {
        this.planStopTime = planStopTime;
        return this;
    }
    public String getPlanStopTime() {
        return this.planStopTime;
    }

    public SoldSpecInstance setActualStopTime(String actualStopTime) {
        this.actualStopTime = actualStopTime;
        return this;
    }
    public String getActualStopTime() {
        return this.actualStopTime;
    }

    public SoldSpecInstance setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
