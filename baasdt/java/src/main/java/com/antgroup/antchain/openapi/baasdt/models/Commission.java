// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Commission extends TeaModel {
    // 要更新的手续费状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 手续费生效时间（时间戳 ms）
    @NameInMap("begin_time")
    public Long beginTime;

    // 手续费结束时间
    @NameInMap("end_time")
    public Long endTime;

    // 手续费
    @NameInMap("commission")
    @Validation(required = true)
    public String commission;

    public static Commission build(java.util.Map<String, ?> map) throws Exception {
        Commission self = new Commission();
        return TeaModel.build(map, self);
    }

    public Commission setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public Commission setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public Commission setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public Commission setCommission(String commission) {
        this.commission = commission;
        return this;
    }
    public String getCommission() {
        return this.commission;
    }

}
