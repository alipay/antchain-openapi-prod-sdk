// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class ActivityRecordVO extends TeaModel {
    // 捐赠类型
    @NameInMap("donate_type")
    public String donateType;

    // 捐赠详细（如：积分、金币、豆子）
    @NameInMap("donate_goods_name")
    public String donateGoodsName;

    // 数量
    @NameInMap("amount")
    public Long amount;

    // 单位
    @NameInMap("unit")
    public String unit;

    // 捐赠时间
    @NameInMap("donate_time")
    public Long donateTime;

    public static ActivityRecordVO build(java.util.Map<String, ?> map) throws Exception {
        ActivityRecordVO self = new ActivityRecordVO();
        return TeaModel.build(map, self);
    }

    public ActivityRecordVO setDonateType(String donateType) {
        this.donateType = donateType;
        return this;
    }
    public String getDonateType() {
        return this.donateType;
    }

    public ActivityRecordVO setDonateGoodsName(String donateGoodsName) {
        this.donateGoodsName = donateGoodsName;
        return this;
    }
    public String getDonateGoodsName() {
        return this.donateGoodsName;
    }

    public ActivityRecordVO setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ActivityRecordVO setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public ActivityRecordVO setDonateTime(Long donateTime) {
        this.donateTime = donateTime;
        return this;
    }
    public Long getDonateTime() {
        return this.donateTime;
    }

}
