// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ResultCode extends TeaModel {
    // meta数据id
    @NameInMap("api_meta_id")
    @Validation(required = true)
    public String apiMetaId;

    // api版本id
    @NameInMap("api_version_id")
    @Validation(required = true)
    public String apiVersionId;

    // 结果码
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

    // 解决错误办法
    @NameInMap("resolution")
    @Validation(required = true)
    public String resolution;

    public static ResultCode build(java.util.Map<String, ?> map) throws Exception {
        ResultCode self = new ResultCode();
        return TeaModel.build(map, self);
    }

    public ResultCode setApiMetaId(String apiMetaId) {
        this.apiMetaId = apiMetaId;
        return this;
    }
    public String getApiMetaId() {
        return this.apiMetaId;
    }

    public ResultCode setApiVersionId(String apiVersionId) {
        this.apiVersionId = apiVersionId;
        return this;
    }
    public String getApiVersionId() {
        return this.apiVersionId;
    }

    public ResultCode setInternalCode(String internalCode) {
        this.internalCode = internalCode;
        return this;
    }
    public String getInternalCode() {
        return this.internalCode;
    }

    public ResultCode setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResultCode setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResultCode setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

}
