// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAppstatspageableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_list
    @NameInMap("app_list")
    @Validation(required = true)
    public AppStats appList;

    // from
    @NameInMap("from")
    @Validation(required = true)
    public Long from;

    // to
    @NameInMap("to")
    @Validation(required = true)
    public Long to;

    public static QueryRmsAppstatspageableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAppstatspageableRequest self = new QueryRmsAppstatspageableRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAppstatspageableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsAppstatspageableRequest setAppList(AppStats appList) {
        this.appList = appList;
        return this;
    }
    public AppStats getAppList() {
        return this.appList;
    }

    public QueryRmsAppstatspageableRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryRmsAppstatspageableRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
