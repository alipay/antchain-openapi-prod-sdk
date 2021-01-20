// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmhistorylevelRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // from
    @NameInMap("from")
    public Long from;

    // to
    @NameInMap("to")
    public Long to;

    public static QueryRmsAlarmhistorylevelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmhistorylevelRequest self = new QueryRmsAlarmhistorylevelRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmhistorylevelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsAlarmhistorylevelRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryRmsAlarmhistorylevelRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
