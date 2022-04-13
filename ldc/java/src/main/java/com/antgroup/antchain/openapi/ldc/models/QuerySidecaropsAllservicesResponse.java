// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySidecaropsAllservicesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 根据wsglabel换到的wsgname
    @NameInMap("workspace_group_name")
    public String workspaceGroupName;

    // 所属命名空间
    @NameInMap("namespace")
    public String namespace;

    // 应用服务详细配置信息，主要为sidecar当前在用的参数信息
    @NameInMap("services_sidecar_info")
    public java.util.List<AppServiceSidecarReleaseInfo> servicesSidecarInfo;

    // 不满足升级条件的服务信息，包含服务不唯一应用及正在升级的应用。
    @NameInMap("unsatisfied_services_info")
    public java.util.List<AppServiceSidecarReleaseInfo> unsatisfiedServicesInfo;

    public static QuerySidecaropsAllservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySidecaropsAllservicesResponse self = new QuerySidecaropsAllservicesResponse();
        return TeaModel.build(map, self);
    }

    public QuerySidecaropsAllservicesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySidecaropsAllservicesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySidecaropsAllservicesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySidecaropsAllservicesResponse setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public QuerySidecaropsAllservicesResponse setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QuerySidecaropsAllservicesResponse setServicesSidecarInfo(java.util.List<AppServiceSidecarReleaseInfo> servicesSidecarInfo) {
        this.servicesSidecarInfo = servicesSidecarInfo;
        return this;
    }
    public java.util.List<AppServiceSidecarReleaseInfo> getServicesSidecarInfo() {
        return this.servicesSidecarInfo;
    }

    public QuerySidecaropsAllservicesResponse setUnsatisfiedServicesInfo(java.util.List<AppServiceSidecarReleaseInfo> unsatisfiedServicesInfo) {
        this.unsatisfiedServicesInfo = unsatisfiedServicesInfo;
        return this;
    }
    public java.util.List<AppServiceSidecarReleaseInfo> getUnsatisfiedServicesInfo() {
        return this.unsatisfiedServicesInfo;
    }

}
