// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowTestReqVO extends TeaModel {
    // api_id
    @NameInMap("api_id")
    public String apiId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // machine_name
    @NameInMap("machine_name")
    public String machineName;

    // params
    @NameInMap("input_params")
    public java.util.List<ApiTestParamVO> inputParams;

    // output_params
    @NameInMap("output_params")
    public java.util.List<ApiflowOutputVO> outputParams;

    public static ApiflowTestReqVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowTestReqVO self = new ApiflowTestReqVO();
        return TeaModel.build(map, self);
    }

    public ApiflowTestReqVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ApiflowTestReqVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ApiflowTestReqVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiflowTestReqVO setMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }
    public String getMachineName() {
        return this.machineName;
    }

    public ApiflowTestReqVO setInputParams(java.util.List<ApiTestParamVO> inputParams) {
        this.inputParams = inputParams;
        return this;
    }
    public java.util.List<ApiTestParamVO> getInputParams() {
        return this.inputParams;
    }

    public ApiflowTestReqVO setOutputParams(java.util.List<ApiflowOutputVO> outputParams) {
        this.outputParams = outputParams;
        return this;
    }
    public java.util.List<ApiflowOutputVO> getOutputParams() {
        return this.outputParams;
    }

}
