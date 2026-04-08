// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class ReportAdDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 广告主账号Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 报表级别level
    @NameInMap("level")
    @Validation(required = true)
    public String level;

    // 回传数据，json array
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static ReportAdDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportAdDataRequest self = new ReportAdDataRequest();
        return TeaModel.build(map, self);
    }

    public ReportAdDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReportAdDataRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ReportAdDataRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public ReportAdDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
