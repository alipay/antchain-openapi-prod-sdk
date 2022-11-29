// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CountEcarGreenoperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 绿色行为统计频率，可选值：
    // Monthly(分月统计),
    // Daily(按每日统计) 
    // 
    @NameInMap("statistic_frequence")
    @Validation(required = true)
    public String statisticFrequence;

    // 统计数据的发生起始时间，格式应如：2021-07-21 12:11:11
    @NameInMap("occurrence_start_time")
    public String occurrenceStartTime;

    // 统计数据的发生结束时间，格式应如：2021-07-21 12:11:11，不传为当日最近时间
    @NameInMap("occurrence_end_time")
    public String occurrenceEndTime;

    public static CountEcarGreenoperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CountEcarGreenoperationRequest self = new CountEcarGreenoperationRequest();
        return TeaModel.build(map, self);
    }

    public CountEcarGreenoperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountEcarGreenoperationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountEcarGreenoperationRequest setStatisticFrequence(String statisticFrequence) {
        this.statisticFrequence = statisticFrequence;
        return this;
    }
    public String getStatisticFrequence() {
        return this.statisticFrequence;
    }

    public CountEcarGreenoperationRequest setOccurrenceStartTime(String occurrenceStartTime) {
        this.occurrenceStartTime = occurrenceStartTime;
        return this;
    }
    public String getOccurrenceStartTime() {
        return this.occurrenceStartTime;
    }

    public CountEcarGreenoperationRequest setOccurrenceEndTime(String occurrenceEndTime) {
        this.occurrenceEndTime = occurrenceEndTime;
        return this;
    }
    public String getOccurrenceEndTime() {
        return this.occurrenceEndTime;
    }

}
