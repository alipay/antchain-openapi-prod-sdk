// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class GetInstancesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // instance id
    @NameInMap("instance_id")
    public String instanceId;

    // 之所以不叫tenant是为了防止和openapi内置的tenant字段冲突.
    @NameInMap("middleware_tenant")
    public String middlewareTenant;

    // 之所以不叫workspace是为了防止和openapi内置的workspace字段冲突.
    @NameInMap("middleware_workspace")
    public String middlewareWorkspace;

    public static GetInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesResponse self = new GetInstancesResponse();
        return TeaModel.build(map, self);
    }

    public GetInstancesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInstancesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInstancesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInstancesResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstancesResponse setMiddlewareTenant(String middlewareTenant) {
        this.middlewareTenant = middlewareTenant;
        return this;
    }
    public String getMiddlewareTenant() {
        return this.middlewareTenant;
    }

    public GetInstancesResponse setMiddlewareWorkspace(String middlewareWorkspace) {
        this.middlewareWorkspace = middlewareWorkspace;
        return this;
    }
    public String getMiddlewareWorkspace() {
        return this.middlewareWorkspace;
    }

}
