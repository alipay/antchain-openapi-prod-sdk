// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetUnireleasePipelineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // pipeline ID
    @NameInMap("id")
    public String id;

    // 解决方案ID
    @NameInMap("solution_id")
    public String solutionId;

    // 发布单状态
    @NameInMap("state")
    public String state;

    // 应用发布状态
    @NameInMap("tenant_pipelines")
    public java.util.List<TenantAppReleasePipeline> tenantPipelines;

    public static GetUnireleasePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnireleasePipelineResponse self = new GetUnireleasePipelineResponse();
        return TeaModel.build(map, self);
    }

    public GetUnireleasePipelineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetUnireleasePipelineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUnireleasePipelineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetUnireleasePipelineResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetUnireleasePipelineResponse setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public GetUnireleasePipelineResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetUnireleasePipelineResponse setTenantPipelines(java.util.List<TenantAppReleasePipeline> tenantPipelines) {
        this.tenantPipelines = tenantPipelines;
        return this;
    }
    public java.util.List<TenantAppReleasePipeline> getTenantPipelines() {
        return this.tenantPipelines;
    }

}
