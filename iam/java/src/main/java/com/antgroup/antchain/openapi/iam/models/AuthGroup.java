// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AuthGroup extends TeaModel {
    // 创建时间，ISO8601格式
    @NameInMap("creation_time")
    public String creationTime;

    // 授权组ID
    @NameInMap("id")
    public String id;

    // 授权组名称
    @NameInMap("name")
    public String name;

    // 更新时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static AuthGroup build(java.util.Map<String, ?> map) throws Exception {
        AuthGroup self = new AuthGroup();
        return TeaModel.build(map, self);
    }

    public AuthGroup setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public AuthGroup setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AuthGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AuthGroup setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
