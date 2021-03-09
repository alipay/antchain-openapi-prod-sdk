// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BuildpackInstances extends TeaModel {
    // ecs个数
    @NameInMap("ecses")
    public Long ecses;

    // 绑定应用个数
    @NameInMap("app_binded")
    public Long appBinded;

    public static BuildpackInstances build(java.util.Map<String, ?> map) throws Exception {
        BuildpackInstances self = new BuildpackInstances();
        return TeaModel.build(map, self);
    }

    public BuildpackInstances setEcses(Long ecses) {
        this.ecses = ecses;
        return this;
    }
    public Long getEcses() {
        return this.ecses;
    }

    public BuildpackInstances setAppBinded(Long appBinded) {
        this.appBinded = appBinded;
        return this;
    }
    public Long getAppBinded() {
        return this.appBinded;
    }

}
