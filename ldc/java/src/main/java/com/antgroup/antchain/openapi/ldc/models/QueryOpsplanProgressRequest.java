// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOpsplanProgressRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单序列号
    @NameInMap("time_series_id")
    @Validation(required = true)
    public String timeSeriesId;

    public static QueryOpsplanProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanProgressRequest self = new QueryOpsplanProgressRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanProgressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpsplanProgressRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

}
