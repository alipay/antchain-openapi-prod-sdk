// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
    @NameInMap("cronexp")
    public String cronexp;

    @NameInMap("name")
    public String name;

    @NameInMap("system")
    public String system;

    public static Task build(java.util.Map<String, ?> map) throws Exception {
        Task self = new Task();
        return TeaModel.build(map, self);
    }

    public Task setCronexp(String cronexp) {
        this.cronexp = cronexp;
        return this;
    }
    public String getCronexp() {
        return this.cronexp;
    }

    public Task setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Task setSystem(String system) {
        this.system = system;
        return this;
    }
    public String getSystem() {
        return this.system;
    }

}
