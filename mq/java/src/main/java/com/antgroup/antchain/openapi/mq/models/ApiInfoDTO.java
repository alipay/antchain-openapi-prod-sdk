// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ApiInfoDTO extends TeaModel {
    // api详细描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // api名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 负责人
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // api路径
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // api简介
    @NameInMap("summary")
    @Validation(required = true)
    public String summary;

    // 开关
    @NameInMap("switch_open")
    @Validation(required = true)
    public Boolean switchOpen;

    // sofamq action 名称
    @NameInMap("sofamq_action")
    public String sofamqAction;

    // 是否默认分配给普通用户
    @NameInMap("user_default_assign")
    public Boolean userDefaultAssign;

    // 是否默认分配给 app owner
    @NameInMap("owner_default_assign")
    public Boolean ownerDefaultAssign;

    public static ApiInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        ApiInfoDTO self = new ApiInfoDTO();
        return TeaModel.build(map, self);
    }

    public ApiInfoDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiInfoDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiInfoDTO setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ApiInfoDTO setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ApiInfoDTO setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public ApiInfoDTO setSwitchOpen(Boolean switchOpen) {
        this.switchOpen = switchOpen;
        return this;
    }
    public Boolean getSwitchOpen() {
        return this.switchOpen;
    }

    public ApiInfoDTO setSofamqAction(String sofamqAction) {
        this.sofamqAction = sofamqAction;
        return this;
    }
    public String getSofamqAction() {
        return this.sofamqAction;
    }

    public ApiInfoDTO setUserDefaultAssign(Boolean userDefaultAssign) {
        this.userDefaultAssign = userDefaultAssign;
        return this;
    }
    public Boolean getUserDefaultAssign() {
        return this.userDefaultAssign;
    }

    public ApiInfoDTO setOwnerDefaultAssign(Boolean ownerDefaultAssign) {
        this.ownerDefaultAssign = ownerDefaultAssign;
        return this;
    }
    public Boolean getOwnerDefaultAssign() {
        return this.ownerDefaultAssign;
    }

}
