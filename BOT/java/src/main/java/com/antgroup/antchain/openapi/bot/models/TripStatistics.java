// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TripStatistics extends TeaModel {
    // 总里程
    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("total_mileage")
    @Validation(required = true)
    public String totalMileage;

    // 时间体
    /**
     * <strong>example:</strong>
     * <p>&quot;totalDuration&quot;:{ &quot;value&quot;:&quot;79&quot;, &quot;unit&quot;:&quot;h&quot; }</p>
     */
    @NameInMap("total_duration")
    @Validation(required = true)
    public TripDuration totalDuration;

    // 总次数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 时期码
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("period_code")
    @Validation(required = true)
    public Long periodCode;

    public static TripStatistics build(java.util.Map<String, ?> map) throws Exception {
        TripStatistics self = new TripStatistics();
        return TeaModel.build(map, self);
    }

    public TripStatistics setTotalMileage(String totalMileage) {
        this.totalMileage = totalMileage;
        return this;
    }
    public String getTotalMileage() {
        return this.totalMileage;
    }

    public TripStatistics setTotalDuration(TripDuration totalDuration) {
        this.totalDuration = totalDuration;
        return this;
    }
    public TripDuration getTotalDuration() {
        return this.totalDuration;
    }

    public TripStatistics setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public TripStatistics setPeriodCode(Long periodCode) {
        this.periodCode = periodCode;
        return this;
    }
    public Long getPeriodCode() {
        return this.periodCode;
    }

}
