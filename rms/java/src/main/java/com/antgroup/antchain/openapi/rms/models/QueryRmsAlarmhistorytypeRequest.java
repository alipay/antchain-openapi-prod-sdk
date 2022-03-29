// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmhistorytypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // from
    @NameInMap("from")
    @Validation(required = true)
    public Long from;

    // to
    @NameInMap("to")
    @Validation(required = true)
    public Long to;

    public static QueryRmsAlarmhistorytypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmhistorytypeRequest self = new QueryRmsAlarmhistorytypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmhistorytypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsAlarmhistorytypeRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryRmsAlarmhistorytypeRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
