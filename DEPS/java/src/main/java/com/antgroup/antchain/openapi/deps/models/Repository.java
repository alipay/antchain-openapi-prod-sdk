// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Repository extends TeaModel {
    // 代码库名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 代码库类型，svn或者git
    @NameInMap("type")
    public String type;

    // 代码库地址
    @NameInMap("url")
    public String url;

    // 代码库负责人登录名称
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 代码库负责人显示名称
    @NameInMap("owner_display_name")
    public String ownerDisplayName;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    public static Repository build(java.util.Map<String, ?> map) throws Exception {
        Repository self = new Repository();
        return TeaModel.build(map, self);
    }

    public Repository setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Repository setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Repository setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public Repository setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public Repository setOwnerDisplayName(String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
        return this;
    }
    public String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    public Repository setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

}
