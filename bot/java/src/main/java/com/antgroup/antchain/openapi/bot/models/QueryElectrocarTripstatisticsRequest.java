// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTripstatisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tuid
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // String	MONTH（月）
    // WEEK（周）
    // DAY（日）
    @NameInMap("time_dimension")
    @Validation(required = true)
    public String timeDimension;

    // 时间戳（每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
    @NameInMap("time_value")
    @Validation(required = true)
    public Long timeValue;

    // 前 n 月/周/日， 包含当前月/周/日（默认9）
    @NameInMap("past_days")
    @Validation(required = true)
    public Long pastDays;

    public static QueryElectrocarTripstatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTripstatisticsRequest self = new QueryElectrocarTripstatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTripstatisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarTripstatisticsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarTripstatisticsRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarTripstatisticsRequest setTimeDimension(String timeDimension) {
        this.timeDimension = timeDimension;
        return this;
    }
    public String getTimeDimension() {
        return this.timeDimension;
    }

    public QueryElectrocarTripstatisticsRequest setTimeValue(Long timeValue) {
        this.timeValue = timeValue;
        return this;
    }
    public Long getTimeValue() {
        return this.timeValue;
    }

    public QueryElectrocarTripstatisticsRequest setPastDays(Long pastDays) {
        this.pastDays = pastDays;
        return this;
    }
    public Long getPastDays() {
        return this.pastDays;
    }

}
