// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ReleasePlanSpecAppService extends TeaModel {
    // 依赖的应用服务名字列表
    @NameInMap("dependencies")
    @Validation(required = true)
    public java.util.List<String> dependencies;

    // 应用服务名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // container service revision
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    public static ReleasePlanSpecAppService build(java.util.Map<String, ?> map) throws Exception {
        ReleasePlanSpecAppService self = new ReleasePlanSpecAppService();
        return TeaModel.build(map, self);
    }

    public ReleasePlanSpecAppService setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<String> getDependencies() {
        return this.dependencies;
    }

    public ReleasePlanSpecAppService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ReleasePlanSpecAppService setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

}
