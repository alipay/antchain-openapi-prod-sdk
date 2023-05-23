// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class ApiInfo extends TeaModel {
    // 查询不动产接口
    @NameInMap("api_code")
    @Validation(required = true)
    public String apiCode;

    // api pb文件定义
    @NameInMap("api_protobuf_definition")
    @Validation(required = true)
    public String apiProtobufDefinition;

    public static ApiInfo build(java.util.Map<String, ?> map) throws Exception {
        ApiInfo self = new ApiInfo();
        return TeaModel.build(map, self);
    }

    public ApiInfo setApiCode(String apiCode) {
        this.apiCode = apiCode;
        return this;
    }
    public String getApiCode() {
        return this.apiCode;
    }

    public ApiInfo setApiProtobufDefinition(String apiProtobufDefinition) {
        this.apiProtobufDefinition = apiProtobufDefinition;
        return this;
    }
    public String getApiProtobufDefinition() {
        return this.apiProtobufDefinition;
    }

}
