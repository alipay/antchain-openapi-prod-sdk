// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsNotifyhistoryRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // from
    @NameInMap("from")
    public Long from;

    // login_name
    @NameInMap("login_name")
    public String loginName;

    // to
    @NameInMap("to")
    public Long to;

    public static QueryRmsNotifyhistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsNotifyhistoryRequest self = new QueryRmsNotifyhistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsNotifyhistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsNotifyhistoryRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryRmsNotifyhistoryRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryRmsNotifyhistoryRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
