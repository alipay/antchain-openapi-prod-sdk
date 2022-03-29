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

    // 购买数量
    @NameInMap("num")
    @Validation(required = true)
    public Long num;

    // 商品规格售卖类型：按量付费（POST）、资源包（BAG）、包年包月（PRE）
    @NameInMap("spec_type")
    @Validation(required = true)
    public String specType;

    // 资源（包）code
    @NameInMap("res_code")
    @Validation(maxLength = 128)
    public String resCode;

    // 其他上下文信息，kv结构，本先新增，后面有新新增可以放在这里面，不用再升级接口
    @NameInMap("context")
    @Validation(maxLength = 2048)
    public String context;

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

    public SoldSpecInstance setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public SoldSpecInstance setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public SoldSpecInstance setResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }
    public String getResCode() {
        return this.resCode;
    }

    public SoldSpecInstance setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
