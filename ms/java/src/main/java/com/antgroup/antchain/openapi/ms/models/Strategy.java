// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Strategy extends TeaModel {
    // 调度策略名称
    @NameInMap("name")
    public String name;

    // 关联的调度任务数
    @NameInMap("related_task_count")
    public Integer relatedTaskCount;

    public static Strategy build(java.util.Map<String, ?> map) throws Exception {
        Strategy self = new Strategy();
        return TeaModel.build(map, self);
    }

    public Strategy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Strategy setRelatedTaskCount(Integer relatedTaskCount) {
        this.relatedTaskCount = relatedTaskCount;
        return this;
    }
    public Integer getRelatedTaskCount() {
        return this.relatedTaskCount;
    }

}
