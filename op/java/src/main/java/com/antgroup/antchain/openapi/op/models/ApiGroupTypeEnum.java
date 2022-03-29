// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiGroupTypeEnum extends TeaModel {
    // API分组类型
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // api分组描述
    @NameInMap("ddescription")
    public String ddescription;

    public static ApiGroupTypeEnum build(java.util.Map<String, ?> map) throws Exception {
        ApiGroupTypeEnum self = new ApiGroupTypeEnum();
        return TeaModel.build(map, self);
    }

    public ApiGroupTypeEnum setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApiGroupTypeEnum setDdescription(String ddescription) {
        this.ddescription = ddescription;
        return this;
    }
    public String getDdescription() {
        return this.ddescription;
    }

}
