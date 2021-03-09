// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class TaskRequest extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // operator
    @NameInMap("operator")
    public String operator;

    // token
    @NameInMap("token")
    public String token;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // status
    @NameInMap("status")
    public String status;

    public static TaskRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskRequest self = new TaskRequest();
        return TeaModel.build(map, self);
    }

    public TaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public TaskRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public TaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
