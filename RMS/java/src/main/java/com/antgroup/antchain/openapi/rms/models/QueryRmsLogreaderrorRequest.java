// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsLogreaderrorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app
    @NameInMap("app")
    public String app;

    // time
    @NameInMap("time")
    public Long time;

    public static QueryRmsLogreaderrorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsLogreaderrorRequest self = new QueryRmsLogreaderrorRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsLogreaderrorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsLogreaderrorRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueryRmsLogreaderrorRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
