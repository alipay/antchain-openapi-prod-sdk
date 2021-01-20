// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSingleworkspacegroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 工作空间组标识。
    @NameInMap("identity")
    public String identity;

    // 工作空间组显示名称。
    @NameInMap("name")
    public String name;

    // 部署模式。
    @NameInMap("release_mode")
    public String releaseMode;

    // 域名后缀。
    @NameInMap("domain_suffix")
    public String domainSuffix;

    // 包含工作空间名称列表。
    @NameInMap("workspaces")
    public java.util.List<String> workspaces;

    public static GetSingleworkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSingleworkspacegroupResponse self = new GetSingleworkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public GetSingleworkspacegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSingleworkspacegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSingleworkspacegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSingleworkspacegroupResponse setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public GetSingleworkspacegroupResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSingleworkspacegroupResponse setReleaseMode(String releaseMode) {
        this.releaseMode = releaseMode;
        return this;
    }
    public String getReleaseMode() {
        return this.releaseMode;
    }

    public GetSingleworkspacegroupResponse setDomainSuffix(String domainSuffix) {
        this.domainSuffix = domainSuffix;
        return this;
    }
    public String getDomainSuffix() {
        return this.domainSuffix;
    }

    public GetSingleworkspacegroupResponse setWorkspaces(java.util.List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<String> getWorkspaces() {
        return this.workspaces;
    }

}
