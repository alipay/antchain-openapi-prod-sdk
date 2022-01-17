// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowOutputVO extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    // mapping_name
    @NameInMap("mapping_name")
    public String mappingName;

    public static ApiflowOutputVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowOutputVO self = new ApiflowOutputVO();
        return TeaModel.build(map, self);
    }

    public ApiflowOutputVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiflowOutputVO setMappingName(String mappingName) {
        this.mappingName = mappingName;
        return this;
    }
    public String getMappingName() {
        return this.mappingName;
    }

}
