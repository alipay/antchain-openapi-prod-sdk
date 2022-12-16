// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class Authorization extends TeaModel {
    // 授权内容的类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 要获取的授权字段
    @NameInMap("fields")
    @Validation(required = true)
    public java.util.List<String> fields;

    // 签名时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static Authorization build(java.util.Map<String, ?> map) throws Exception {
        Authorization self = new Authorization();
        return TeaModel.build(map, self);
    }

    public Authorization setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public Authorization setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public Authorization setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
