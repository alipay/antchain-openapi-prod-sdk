// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ResultCodeRequest extends TeaModel {
    // api版本
    @NameInMap("api_version")
    @Validation(required = true)
    public String apiVersion;

    // api名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // 外部返回结果码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 内部返回结果码
    @NameInMap("internal_code")
    @Validation(required = true)
    public String internalCode;

    // 结果码描述
    @NameInMap("description")
    public String description;

    // 错误解决方法
    @NameInMap("resolution")
    public String resolution;

    public static ResultCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResultCodeRequest self = new ResultCodeRequest();
        return TeaModel.build(map, self);
    }

    public ResultCodeRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ResultCodeRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ResultCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResultCodeRequest setInternalCode(String internalCode) {
        this.internalCode = internalCode;
        return this;
    }
    public String getInternalCode() {
        return this.internalCode;
    }

    public ResultCodeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResultCodeRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

}
