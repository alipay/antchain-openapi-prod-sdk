// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmPauseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryAlarmPauseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmPauseRequest self = new QueryAlarmPauseRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmPauseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
