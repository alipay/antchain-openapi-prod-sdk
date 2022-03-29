// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAppsAlarmrulecountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 查询app清单
    @NameInMap("apps")
    @Validation(required = true)
    public java.util.List<String> apps;

    public static QueryAppsAlarmrulecountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppsAlarmrulecountRequest self = new QueryAppsAlarmrulecountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppsAlarmrulecountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppsAlarmrulecountRequest setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

}
