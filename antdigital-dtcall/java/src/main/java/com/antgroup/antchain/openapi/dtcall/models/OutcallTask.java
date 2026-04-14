// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcall.models;

import com.aliyun.tea.*;

public class OutcallTask extends TeaModel {
    // 任务编码
    /**
     * <strong>example:</strong>
     * <p>task_123</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 任务名称
    /**
     * <strong>example:</strong>
     * <p>催收外呼任务</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static OutcallTask build(java.util.Map<String, ?> map) throws Exception {
        OutcallTask self = new OutcallTask();
        return TeaModel.build(map, self);
    }

    public OutcallTask setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OutcallTask setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
