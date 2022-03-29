// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAppsUnifiedalarmstatsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 告警开始时间
    @NameInMap("start_time")
    public Long startTime;

    // 告警结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    public static QueryAppsUnifiedalarmstatsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppsUnifiedalarmstatsRequest self = new QueryAppsUnifiedalarmstatsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppsUnifiedalarmstatsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppsUnifiedalarmstatsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryAppsUnifiedalarmstatsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
