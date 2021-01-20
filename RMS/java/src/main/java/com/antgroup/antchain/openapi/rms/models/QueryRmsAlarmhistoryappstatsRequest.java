// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmhistoryappstatsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_list
    @NameInMap("app_list")
    public AppStats appList;

    // from
    @NameInMap("from")
    public Long from;

    // to
    @NameInMap("to")
    public Long to;

    public static QueryRmsAlarmhistoryappstatsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmhistoryappstatsRequest self = new QueryRmsAlarmhistoryappstatsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmhistoryappstatsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsAlarmhistoryappstatsRequest setAppList(AppStats appList) {
        this.appList = appList;
        return this;
    }
    public AppStats getAppList() {
        return this.appList;
    }

    public QueryRmsAlarmhistoryappstatsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryRmsAlarmhistoryappstatsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
