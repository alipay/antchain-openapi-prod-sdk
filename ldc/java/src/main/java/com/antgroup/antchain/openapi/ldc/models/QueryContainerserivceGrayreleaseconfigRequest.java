// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryContainerserivceGrayreleaseconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单的time_series_id
    @NameInMap("time_series_id")
    public String timeSeriesId;

    // lks service的id，如果time_series_id与lks_service_id同时指定，后者生效
    @NameInMap("lks_service_id")
    public String lksServiceId;

    public static QueryContainerserivceGrayreleaseconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContainerserivceGrayreleaseconfigRequest self = new QueryContainerserivceGrayreleaseconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryContainerserivceGrayreleaseconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContainerserivceGrayreleaseconfigRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public QueryContainerserivceGrayreleaseconfigRequest setLksServiceId(String lksServiceId) {
        this.lksServiceId = lksServiceId;
        return this;
    }
    public String getLksServiceId() {
        return this.lksServiceId;
    }

}
