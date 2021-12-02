// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class AuditLog extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 操作者
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 操作的对象类别
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 动作
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 对象的ID
    @NameInMap("targets")
    @Validation(required = true)
    public java.util.List<String> targets;

    // operation_time
    @NameInMap("operation_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String operationTime;

    public static AuditLog build(java.util.Map<String, ?> map) throws Exception {
        AuditLog self = new AuditLog();
        return TeaModel.build(map, self);
    }

    public AuditLog setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AuditLog setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AuditLog setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AuditLog setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public AuditLog setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public AuditLog setOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }
    public String getOperationTime() {
        return this.operationTime;
    }

}
