// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class GetMiddlewareMetaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间
    @NameInMap("workspace_id")
    public String workspaceId;

    // instanceId
    @NameInMap("instance_id")
    public String instanceId;

    // acvip 连接地址
    @NameInMap("acvip_endpoint")
    public String acvipEndpoint;

    public static GetMiddlewareMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareMetaResponse self = new GetMiddlewareMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareMetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMiddlewareMetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMiddlewareMetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMiddlewareMetaResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMiddlewareMetaResponse setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetMiddlewareMetaResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMiddlewareMetaResponse setAcvipEndpoint(String acvipEndpoint) {
        this.acvipEndpoint = acvipEndpoint;
        return this;
    }
    public String getAcvipEndpoint() {
        return this.acvipEndpoint;
    }

}
