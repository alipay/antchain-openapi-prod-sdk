// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmhistoryappcountRequest extends TeaModel {
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

    public static QueryRmsAlarmhistoryappcountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmhistoryappcountRequest self = new QueryRmsAlarmhistoryappcountRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmhistoryappcountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsAlarmhistoryappcountRequest setAppList(AppStats appList) {
        this.appList = appList;
        return this;
    }
    public AppStats getAppList() {
        return this.appList;
    }

    public QueryRmsAlarmhistoryappcountRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryRmsAlarmhistoryappcountRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
