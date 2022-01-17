// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiParamVO extends TeaModel {
    // API标识
    @NameInMap("api_id")
    public String apiId;

    // default_value
    @NameInMap("default_value")
    public String defaultValue;

    // description
    @NameInMap("description")
    public String description;

    // failure_demo
    @NameInMap("failure_demo")
    public String failureDemo;

    // location
    @NameInMap("location")
    public String location;

    // name
    @NameInMap("name")
    public String name;

    // 引用的模型类型	
    @NameInMap("ref_type")
    public String refType;

    // 是否必填
    @NameInMap("required")
    public Boolean required;

    // rsp_code_list
    @NameInMap("rsp_code_list")
    public java.util.List<ApiRspCodeVO> rspCodeList;

    // success_demo
    @NameInMap("success_demo")
    public String successDemo;

    // 数据类型
    @NameInMap("type")
    public String type;

    // upstreamLocation
    @NameInMap("upstream_location")
    public String upstreamLocation;

    // upstream_name
    @NameInMap("upstream_name")
    public String upstreamName;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    public static ApiParamVO build(java.util.Map<String, ?> map) throws Exception {
        ApiParamVO self = new ApiParamVO();
        return TeaModel.build(map, self);
    }

    public ApiParamVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ApiParamVO setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public ApiParamVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiParamVO setFailureDemo(String failureDemo) {
        this.failureDemo = failureDemo;
        return this;
    }
    public String getFailureDemo() {
        return this.failureDemo;
    }

    public ApiParamVO setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ApiParamVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiParamVO setRefType(String refType) {
        this.refType = refType;
        return this;
    }
    public String getRefType() {
        return this.refType;
    }

    public ApiParamVO setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public ApiParamVO setRspCodeList(java.util.List<ApiRspCodeVO> rspCodeList) {
        this.rspCodeList = rspCodeList;
        return this;
    }
    public java.util.List<ApiRspCodeVO> getRspCodeList() {
        return this.rspCodeList;
    }

    public ApiParamVO setSuccessDemo(String successDemo) {
        this.successDemo = successDemo;
        return this;
    }
    public String getSuccessDemo() {
        return this.successDemo;
    }

    public ApiParamVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ApiParamVO setUpstreamLocation(String upstreamLocation) {
        this.upstreamLocation = upstreamLocation;
        return this;
    }
    public String getUpstreamLocation() {
        return this.upstreamLocation;
    }

    public ApiParamVO setUpstreamName(String upstreamName) {
        this.upstreamName = upstreamName;
        return this;
    }
    public String getUpstreamName() {
        return this.upstreamName;
    }

    public ApiParamVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ApiParamVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
