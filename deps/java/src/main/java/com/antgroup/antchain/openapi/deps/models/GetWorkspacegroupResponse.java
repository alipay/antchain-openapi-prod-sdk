// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetWorkspacegroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 环境名称
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 环境显示名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 环境状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 租户名称
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 工作空间名称列表
    @NameInMap("workspaces")
    @Validation(required = true)
    public java.util.List<String> workspaces;

    // env_type
    @NameInMap("env_type")
    public String envType;

    public static GetWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacegroupResponse self = new GetWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspacegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetWorkspacegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetWorkspacegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetWorkspacegroupResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetWorkspacegroupResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetWorkspacegroupResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWorkspacegroupResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetWorkspacegroupResponse setWorkspaces(java.util.List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<String> getWorkspaces() {
        return this.workspaces;
    }

    public GetWorkspacegroupResponse setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

}
