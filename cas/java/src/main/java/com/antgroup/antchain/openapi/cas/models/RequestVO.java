// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RequestVO extends TeaModel {
    // context
    @NameInMap("context")
    public String context;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // operator
    @NameInMap("operator")
    public String operator;

    // operator_name
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // operator_type
    @NameInMap("operator_type")
    public String operatorType;

    // status
    @NameInMap("status")
    public String status;

    // token
    @NameInMap("token")
    public String token;

    // type
    @NameInMap("type")
    public String type;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // tasks
    @NameInMap("tasks")
    public java.util.List<Task> tasks;

    public static RequestVO build(java.util.Map<String, ?> map) throws Exception {
        RequestVO self = new RequestVO();
        return TeaModel.build(map, self);
    }

    public RequestVO setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public RequestVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RequestVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RequestVO setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public RequestVO setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public RequestVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RequestVO setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RequestVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RequestVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public RequestVO setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public RequestVO setTasks(java.util.List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<Task> getTasks() {
        return this.tasks;
    }

}
