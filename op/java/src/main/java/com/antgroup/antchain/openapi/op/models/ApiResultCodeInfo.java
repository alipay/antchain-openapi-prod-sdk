// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiResultCodeInfo extends TeaModel {
    // 返回结果码
    @NameInMap("internal_code")
    @Validation(required = true)
    public String internalCode;

    // 外部结果码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 返回结果描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 返回结果码解决方案
    @NameInMap("resolution")
    @Validation(required = true)
    public String resolution;

    public static ApiResultCodeInfo build(java.util.Map<String, ?> map) throws Exception {
        ApiResultCodeInfo self = new ApiResultCodeInfo();
        return TeaModel.build(map, self);
    }

    public ApiResultCodeInfo setInternalCode(String internalCode) {
        this.internalCode = internalCode;
        return this;
    }
    public String getInternalCode() {
        return this.internalCode;
    }

    public ApiResultCodeInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApiResultCodeInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiResultCodeInfo setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

}
