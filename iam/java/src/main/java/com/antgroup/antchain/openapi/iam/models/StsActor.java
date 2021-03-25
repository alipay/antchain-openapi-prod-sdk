// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class StsActor extends TeaModel {
    // 虚拟身份受信关系集合，通常只包含一个
    @NameInMap("bindings")
    @Validation(required = true)
    public java.util.List<StsActorBinding> bindings;

    // 针对虚拟身份的描述
    @NameInMap("description")
    public String description;

    // 虚拟身份名称，租户内唯一
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 虚拟身份所在租户
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static StsActor build(java.util.Map<String, ?> map) throws Exception {
        StsActor self = new StsActor();
        return TeaModel.build(map, self);
    }

    public StsActor setBindings(java.util.List<StsActorBinding> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<StsActorBinding> getBindings() {
        return this.bindings;
    }

    public StsActor setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StsActor setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StsActor setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
