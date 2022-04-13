// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOpsplanDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单id
    @NameInMap("time_series_id")
    @Validation(required = true)
    public String timeSeriesId;

    public static QueryOpsplanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanDetailRequest self = new QueryOpsplanDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpsplanDetailRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

}
