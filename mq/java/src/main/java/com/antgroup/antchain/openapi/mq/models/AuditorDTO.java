// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class AuditorDTO extends TeaModel {
    // 操作名
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 资源名
    @NameInMap("resource")
    @Validation(required = true)
    public String resource;

    // 操作详情
    @NameInMap("detail")
    @Validation(required = true)
    public String detail;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 时间戳
    @NameInMap("timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String timestamp;

    public static AuditorDTO build(java.util.Map<String, ?> map) throws Exception {
        AuditorDTO self = new AuditorDTO();
        return TeaModel.build(map, self);
    }

    public AuditorDTO setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public AuditorDTO setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public AuditorDTO setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public AuditorDTO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AuditorDTO setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
