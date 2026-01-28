// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class CheckDataphinTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // publishId
    @NameInMap("publish_id")
    @Validation(required = true)
    public String publishId;

    // tenantId
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static CheckDataphinTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataphinTaskRequest self = new CheckDataphinTaskRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataphinTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckDataphinTaskRequest setPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }
    public String getPublishId() {
        return this.publishId;
    }

    public CheckDataphinTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckDataphinTaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
