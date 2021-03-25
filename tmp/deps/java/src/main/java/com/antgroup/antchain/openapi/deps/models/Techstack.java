// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Techstack extends TeaModel {
    // 描述信息
    @NameInMap("description")
    public String description;

    // extraInfo
    @NameInMap("extra_info")
    public String extraInfo;

    // 技术栈ID
    @NameInMap("id")
    public String id;

    // 标识符
    @NameInMap("identity")
    public String identity;

    // 名称
    @NameInMap("name")
    public String name;

    // 作用域
    @NameInMap("scope")
    public String scope;

    // 技术栈状态
    @NameInMap("status")
    public String status;

    public static Techstack build(java.util.Map<String, ?> map) throws Exception {
        Techstack self = new Techstack();
        return TeaModel.build(map, self);
    }

    public Techstack setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Techstack setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public Techstack setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Techstack setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Techstack setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Techstack setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public Techstack setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
