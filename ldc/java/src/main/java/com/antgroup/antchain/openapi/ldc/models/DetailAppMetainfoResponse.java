// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DetailAppMetainfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 工作空间组的名字
    @NameInMap("workspace_group_name")
    public String workspaceGroupName;

    // 名称空间
    @NameInMap("namespace")
    public String namespace;

    // 应用服务名字
    @NameInMap("container_service_name")
    public String containerServiceName;

    // 应用服务当前revision
    @NameInMap("container_service_revision")
    public String containerServiceRevision;

    // 中间件instanceId
    @NameInMap("instance_id")
    public String instanceId;

    public static DetailAppMetainfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailAppMetainfoResponse self = new DetailAppMetainfoResponse();
        return TeaModel.build(map, self);
    }

    public DetailAppMetainfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailAppMetainfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailAppMetainfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailAppMetainfoResponse setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public DetailAppMetainfoResponse setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DetailAppMetainfoResponse setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public DetailAppMetainfoResponse setContainerServiceRevision(String containerServiceRevision) {
        this.containerServiceRevision = containerServiceRevision;
        return this;
    }
    public String getContainerServiceRevision() {
        return this.containerServiceRevision;
    }

    public DetailAppMetainfoResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
