// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetRoleResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 角色所包含的操作点
    @NameInMap("actions")
    public java.util.List<Action> actions;

    // 创建时间,ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 角色描述
    @NameInMap("description")
    public String description;

    // 角色Id
    @NameInMap("id")
    public String id;

    // 角色名称
    @NameInMap("name")
    public String name;

    // 角色归属租户
    @NameInMap("tenant")
    public String tenant;

    // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
    @NameInMap("type")
    public String type;

    // 更新时间,ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static GetRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponse self = new GetRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetRoleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRoleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRoleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRoleResponse setActions(java.util.List<Action> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<Action> getActions() {
        return this.actions;
    }

    public GetRoleResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRoleResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRoleResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetRoleResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRoleResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetRoleResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetRoleResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
