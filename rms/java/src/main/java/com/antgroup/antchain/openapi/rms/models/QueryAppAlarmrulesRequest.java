// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAppAlarmrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 指标栈ID
    @NameInMap("stack_id")
    @Validation(required = true)
    public Long stackId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 查询所有，还是查询当前设置的告警指标。
    @NameInMap("all")
    @Validation(required = true)
    public Boolean all;

    public static QueryAppAlarmrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppAlarmrulesRequest self = new QueryAppAlarmrulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppAlarmrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppAlarmrulesRequest setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

    public QueryAppAlarmrulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppAlarmrulesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

}
