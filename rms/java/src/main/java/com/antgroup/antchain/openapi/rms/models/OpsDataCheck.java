// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class OpsDataCheck extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 指标名称
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // 指标类型
    @NameInMap("target_type")
    @Validation(required = true)
    public String targetType;

    // 0：异常 1：正常
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // check_result
    @NameInMap("check_result")
    @Validation(required = true)
    public String checkResult;

    public static OpsDataCheck build(java.util.Map<String, ?> map) throws Exception {
        OpsDataCheck self = new OpsDataCheck();
        return TeaModel.build(map, self);
    }

    public OpsDataCheck setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OpsDataCheck setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public OpsDataCheck setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public OpsDataCheck setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public OpsDataCheck setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

}
