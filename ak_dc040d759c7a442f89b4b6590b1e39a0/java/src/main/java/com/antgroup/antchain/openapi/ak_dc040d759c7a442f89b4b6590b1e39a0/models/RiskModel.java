// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class RiskModel extends TeaModel {
    // 标签名称
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 风险值
    @NameInMap("model_value")
    @Validation(required = true)
    public String modelValue;

    // 风险标签描述
    @NameInMap("model_comment")
    @Validation(required = true)
    public String modelComment;

    public static RiskModel build(java.util.Map<String, ?> map) throws Exception {
        RiskModel self = new RiskModel();
        return TeaModel.build(map, self);
    }

    public RiskModel setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RiskModel setModelValue(String modelValue) {
        this.modelValue = modelValue;
        return this;
    }
    public String getModelValue() {
        return this.modelValue;
    }

    public RiskModel setModelComment(String modelComment) {
        this.modelComment = modelComment;
        return this;
    }
    public String getModelComment() {
        return this.modelComment;
    }

}
