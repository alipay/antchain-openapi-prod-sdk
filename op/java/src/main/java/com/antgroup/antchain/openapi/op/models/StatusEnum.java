// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class StatusEnum extends TeaModel {
    // api状态码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // api状态码描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static StatusEnum build(java.util.Map<String, ?> map) throws Exception {
        StatusEnum self = new StatusEnum();
        return TeaModel.build(map, self);
    }

    public StatusEnum setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StatusEnum setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
