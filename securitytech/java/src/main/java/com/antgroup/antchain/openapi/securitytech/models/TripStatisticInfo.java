// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class TripStatisticInfo extends TeaModel {
    // 总里程
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("total_mileage")
    @Validation(required = true)
    public String totalMileage;

    // 总时长
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("total_duration")
    @Validation(required = true)
    public DurationInfo totalDuration;

    // 总条数
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 时间码
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("period_code")
    @Validation(required = true)
    public Long periodCode;

    public static TripStatisticInfo build(java.util.Map<String, ?> map) throws Exception {
        TripStatisticInfo self = new TripStatisticInfo();
        return TeaModel.build(map, self);
    }

    public TripStatisticInfo setTotalMileage(String totalMileage) {
        this.totalMileage = totalMileage;
        return this;
    }
    public String getTotalMileage() {
        return this.totalMileage;
    }

    public TripStatisticInfo setTotalDuration(DurationInfo totalDuration) {
        this.totalDuration = totalDuration;
        return this;
    }
    public DurationInfo getTotalDuration() {
        return this.totalDuration;
    }

    public TripStatisticInfo setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public TripStatisticInfo setPeriodCode(Long periodCode) {
        this.periodCode = periodCode;
        return this;
    }
    public Long getPeriodCode() {
        return this.periodCode;
    }

}
