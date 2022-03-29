// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ProcessQueryDTO extends TeaModel {
    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ProcessQueryDTO build(java.util.Map<String, ?> map) throws Exception {
        ProcessQueryDTO self = new ProcessQueryDTO();
        return TeaModel.build(map, self);
    }

    public ProcessQueryDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
