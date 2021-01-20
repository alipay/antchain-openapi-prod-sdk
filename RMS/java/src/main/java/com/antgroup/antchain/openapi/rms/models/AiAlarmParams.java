// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AiAlarmParams extends TeaModel {
    // value_fields
    @NameInMap("value_fields")
    public java.util.List<String> valueFields;

    // ai_algo_code
    @NameInMap("ai_algo_code")
    public String aiAlgoCode;

    // ai_extra_attr
    @NameInMap("ai_extra_attr")
    public AiExtraAttr aiExtraAttr;

    public static AiAlarmParams build(java.util.Map<String, ?> map) throws Exception {
        AiAlarmParams self = new AiAlarmParams();
        return TeaModel.build(map, self);
    }

    public AiAlarmParams setValueFields(java.util.List<String> valueFields) {
        this.valueFields = valueFields;
        return this;
    }
    public java.util.List<String> getValueFields() {
        return this.valueFields;
    }

    public AiAlarmParams setAiAlgoCode(String aiAlgoCode) {
        this.aiAlgoCode = aiAlgoCode;
        return this;
    }
    public String getAiAlgoCode() {
        return this.aiAlgoCode;
    }

    public AiAlarmParams setAiExtraAttr(AiExtraAttr aiExtraAttr) {
        this.aiExtraAttr = aiExtraAttr;
        return this;
    }
    public AiExtraAttr getAiExtraAttr() {
        return this.aiExtraAttr;
    }

}
