// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiTransferVO extends TeaModel {
    // API缓存模型
    @NameInMap("api_cache_model")
    public ApiCacheVO apiCacheModel;

    // api_group
    @NameInMap("api_group")
    public ApiGroupVO apiGroup;

    // API分组标识
    @NameInMap("api_group_id")
    public String apiGroupId;

    // 所属API分组名称
    @NameInMap("api_group_name")
    public String apiGroupName;

    // API标识
    @NameInMap("api_id")
    public String apiId;

    // API限流配置
    @NameInMap("api_limit_config")
    public LimitConfigVO apiLimitConfig;

    // api_mock_config
    @NameInMap("api_mock_config")
    public ApiMockConfigVO apiMockConfig;

    // API名称
    @NameInMap("api_name")
    public String apiName;

    // apiStatus
    @NameInMap("api_status")
    public String apiStatus;

    // 授权应用类型
    @NameInMap("app_type")
    public String appType;

    // authentication_type
    @NameInMap("authentication_type")
    public String authenticationType;

    // auth_app_count
    @NameInMap("auth_app_count")
    public Long authAppCount;

    // 是否可以删除
    @NameInMap("can_delete")
    public Boolean canDelete;

    // charset
    @NameInMap("charset")
    public String charset;

    // 重复的配置  信息详情
    @NameInMap("check_result")
    public String checkResult;

    // 完整interface_name
    @NameInMap("complete_interface_name")
    public String completeInterfaceName;

    // contentType
    @NameInMap("content_type")
    public String contentType;

    // cors_id
    @NameInMap("cors_id")
    public String corsId;

    // cors_info
    @NameInMap("cors_info")
    public CorsInfoVO corsInfo;

    // 当前显示的版本
    @NameInMap("current_version_no")
    public String currentVersionNo;

    // description
    @NameInMap("description")
    public String description;

    // API分组域名
    @NameInMap("domain_name")
    public String domainName;

    // downstreamProtocol
    @NameInMap("downstream_protocol")
    public String downstreamProtocol;

    // 编辑中的版本
    @NameInMap("edit_version")
    public ApiVersionVO editVersion;

    // 编辑中的API版本号
    @NameInMap("edit_version_no")
    public String editVersionNo;

    // external_auth
    @NameInMap("external_auth")
    public ExternalAuthInfoVO externalAuth;

    // 外部系统标识
    @NameInMap("external_auth_id")
    public String externalAuthId;

    // 方法名
    @NameInMap("function_name")
    public String functionName;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 接口名称
    @NameInMap("interface_name")
    public String interfaceName;

    // method
    @NameInMap("method")
    public String method;

    // onlineVersion
    @NameInMap("online_version")
    public ApiVersionVO onlineVersion;

    // 发布中的API版本号
    @NameInMap("online_version_no")
    public String onlineVersionNo;

    // operation_type
    @NameInMap("operation_type")
    public String operationType;

    // 创建人
    @NameInMap("operator")
    public String operator;

    // path
    @NameInMap("path")
    public String path;

    // 路径匹配类型
    @NameInMap("path_match_type")
    public String pathMatchType;

    // reqParams
    @NameInMap("req_params")
    public java.util.List<ApiParamVO> reqParams;

    // reqparammapping
    @NameInMap("req_param_mapping")
    public ParamMappingInfoVO reqParamMapping;

    // 请求参数映射标识
    @NameInMap("req_param_mapping_id")
    public String reqParamMappingId;

    // 参数映射类型（普通\高级）
    @NameInMap("req_param_mapping_type")
    public String reqParamMappingType;

    // respparammapping
    @NameInMap("resp_param_mapping")
    public ParamMappingInfoVO respParamMapping;

    // 响应参数标识
    @NameInMap("resp_param_mapping_id")
    public String respParamMappingId;

    // router_id
    @NameInMap("router_id")
    public String routerId;

    // 	
    // 路由规则
    @NameInMap("router_info")
    public RouterInfoVO routerInfo;

    // 路由策略类型
    @NameInMap("router_type")
    public String routerType;

    // rsqParam
    @NameInMap("rsq_param")
    public ApiParamVO rsqParam;

    // 	
    // 后端集群
    @NameInMap("system_cluster")
    public SystemClusterVO systemCluster;

    // sys_id
    @NameInMap("sys_id")
    public String sysId;

    // 目标工作空间标识
    @NameInMap("target_workspace_id")
    public String targetWorkspaceId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // timeout
    @NameInMap("timeout")
    public Long timeout;

    // 服务标识
    @NameInMap("unique_id")
    public String uniqueId;

    // 需要覆盖的配置
    @NameInMap("update_config_list")
    public java.util.List<String> updateConfigList;

    // upstreamParamMappings
    @NameInMap("upstream_param_mappings")
    public java.util.List<ApiParamVO> upstreamParamMappings;

    // upstreamPath
    @NameInMap("upstream_path")
    public String upstreamPath;

    // upstreamProtocol
    @NameInMap("upstream_protocol")
    public String upstreamProtocol;

    // 后端服务类型
    @NameInMap("upstream_type")
    public String upstreamType;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // 导入失败的原因
    @NameInMap("import_result")
    public String importResult;

    // domain_list
    @NameInMap("domain_list")
    public java.util.List<ApiGroupDomainVO> domainList;

    // 策略ID
    @NameInMap("strategy_id")
    public String strategyId;

    // 策略详情
    @NameInMap("strategy_info")
    public StrategyInfoVO strategyInfo;

    // crossZone双网关 (api 类型)
    @NameInMap("api_type")
    public String apiType;

    // api的网关配置列表
    @NameInMap("api_cross_zone_list")
    public java.util.List<ApiCrossZoneVO> apiCrossZoneList;

    // registry_group
    @NameInMap("registry_group")
    public String registryGroup;

    // parameter
    @NameInMap("parameter")
    public java.util.List<String> parameter;

    // up_function_name
    @NameInMap("up_function_name")
    public String upFunctionName;

    // param_path_list
    @NameInMap("param_path_list")
    public java.util.List<String> paramPathList;

    // dubbo发布服务版本
    @NameInMap("service_version")
    public String serviceVersion;

    // auth_app_info_id
    @NameInMap("auth_app_info_id")
    public String authAppInfoId;

    // operation_permission
    @NameInMap("operation_permission")
    public Boolean operationPermission;

    // data_encryption
    @NameInMap("data_encryption")
    public String dataEncryption;

    // egress_list
    @NameInMap("egress_list")
    public java.util.List<GateWayConfigVO> egressList;

    // history_version_list
    @NameInMap("history_version_list")
    public java.util.List<ApiVersionVO> historyVersionList;

    // GateWayConfigVO
    @NameInMap("ingress")
    public String ingress;

    // model
    @NameInMap("model")
    public String model;

    // req_model_id
    @NameInMap("req_model_id")
    public String reqModelId;

    // req_model_name	
    @NameInMap("req_model_name")
    public String reqModelName;

    // req_type
    @NameInMap("req_type")
    public String reqType;

    // resp_model_id
    @NameInMap("resp_model_id")
    public String respModelId;

    // resp_model_name
    @NameInMap("resp_model_name")
    public String respModelName;

    // resp_type
    @NameInMap("resp_type")
    public String respType;

    // ingress_list
    @NameInMap("ingress_list")
    public java.util.List<GateWayConfigVO> ingressList;

    // content
    @NameInMap("content")
    public String content;

    // api_count
    @NameInMap("api_count")
    public Long apiCount;

    // field_mapping
    @NameInMap("field_mapping")
    public java.util.List<ApiflowOutputVO> fieldMapping;

    // need_tls
    @NameInMap("need_tls")
    public Boolean needTls;

    public static ApiTransferVO build(java.util.Map<String, ?> map) throws Exception {
        ApiTransferVO self = new ApiTransferVO();
        return TeaModel.build(map, self);
    }

    public ApiTransferVO setApiCacheModel(ApiCacheVO apiCacheModel) {
        this.apiCacheModel = apiCacheModel;
        return this;
    }
    public ApiCacheVO getApiCacheModel() {
        return this.apiCacheModel;
    }

    public ApiTransferVO setApiGroup(ApiGroupVO apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }
    public ApiGroupVO getApiGroup() {
        return this.apiGroup;
    }

    public ApiTransferVO setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public ApiTransferVO setApiGroupName(String apiGroupName) {
        this.apiGroupName = apiGroupName;
        return this;
    }
    public String getApiGroupName() {
        return this.apiGroupName;
    }

    public ApiTransferVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ApiTransferVO setApiLimitConfig(LimitConfigVO apiLimitConfig) {
        this.apiLimitConfig = apiLimitConfig;
        return this;
    }
    public LimitConfigVO getApiLimitConfig() {
        return this.apiLimitConfig;
    }

    public ApiTransferVO setApiMockConfig(ApiMockConfigVO apiMockConfig) {
        this.apiMockConfig = apiMockConfig;
        return this;
    }
    public ApiMockConfigVO getApiMockConfig() {
        return this.apiMockConfig;
    }

    public ApiTransferVO setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ApiTransferVO setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }
    public String getApiStatus() {
        return this.apiStatus;
    }

    public ApiTransferVO setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ApiTransferVO setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public ApiTransferVO setAuthAppCount(Long authAppCount) {
        this.authAppCount = authAppCount;
        return this;
    }
    public Long getAuthAppCount() {
        return this.authAppCount;
    }

    public ApiTransferVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public ApiTransferVO setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public ApiTransferVO setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

    public ApiTransferVO setCompleteInterfaceName(String completeInterfaceName) {
        this.completeInterfaceName = completeInterfaceName;
        return this;
    }
    public String getCompleteInterfaceName() {
        return this.completeInterfaceName;
    }

    public ApiTransferVO setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ApiTransferVO setCorsId(String corsId) {
        this.corsId = corsId;
        return this;
    }
    public String getCorsId() {
        return this.corsId;
    }

    public ApiTransferVO setCorsInfo(CorsInfoVO corsInfo) {
        this.corsInfo = corsInfo;
        return this;
    }
    public CorsInfoVO getCorsInfo() {
        return this.corsInfo;
    }

    public ApiTransferVO setCurrentVersionNo(String currentVersionNo) {
        this.currentVersionNo = currentVersionNo;
        return this;
    }
    public String getCurrentVersionNo() {
        return this.currentVersionNo;
    }

    public ApiTransferVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiTransferVO setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ApiTransferVO setDownstreamProtocol(String downstreamProtocol) {
        this.downstreamProtocol = downstreamProtocol;
        return this;
    }
    public String getDownstreamProtocol() {
        return this.downstreamProtocol;
    }

    public ApiTransferVO setEditVersion(ApiVersionVO editVersion) {
        this.editVersion = editVersion;
        return this;
    }
    public ApiVersionVO getEditVersion() {
        return this.editVersion;
    }

    public ApiTransferVO setEditVersionNo(String editVersionNo) {
        this.editVersionNo = editVersionNo;
        return this;
    }
    public String getEditVersionNo() {
        return this.editVersionNo;
    }

    public ApiTransferVO setExternalAuth(ExternalAuthInfoVO externalAuth) {
        this.externalAuth = externalAuth;
        return this;
    }
    public ExternalAuthInfoVO getExternalAuth() {
        return this.externalAuth;
    }

    public ApiTransferVO setExternalAuthId(String externalAuthId) {
        this.externalAuthId = externalAuthId;
        return this;
    }
    public String getExternalAuthId() {
        return this.externalAuthId;
    }

    public ApiTransferVO setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ApiTransferVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiTransferVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApiTransferVO setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public ApiTransferVO setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public ApiTransferVO setOnlineVersion(ApiVersionVO onlineVersion) {
        this.onlineVersion = onlineVersion;
        return this;
    }
    public ApiVersionVO getOnlineVersion() {
        return this.onlineVersion;
    }

    public ApiTransferVO setOnlineVersionNo(String onlineVersionNo) {
        this.onlineVersionNo = onlineVersionNo;
        return this;
    }
    public String getOnlineVersionNo() {
        return this.onlineVersionNo;
    }

    public ApiTransferVO setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ApiTransferVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ApiTransferVO setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ApiTransferVO setPathMatchType(String pathMatchType) {
        this.pathMatchType = pathMatchType;
        return this;
    }
    public String getPathMatchType() {
        return this.pathMatchType;
    }

    public ApiTransferVO setReqParams(java.util.List<ApiParamVO> reqParams) {
        this.reqParams = reqParams;
        return this;
    }
    public java.util.List<ApiParamVO> getReqParams() {
        return this.reqParams;
    }

    public ApiTransferVO setReqParamMapping(ParamMappingInfoVO reqParamMapping) {
        this.reqParamMapping = reqParamMapping;
        return this;
    }
    public ParamMappingInfoVO getReqParamMapping() {
        return this.reqParamMapping;
    }

    public ApiTransferVO setReqParamMappingId(String reqParamMappingId) {
        this.reqParamMappingId = reqParamMappingId;
        return this;
    }
    public String getReqParamMappingId() {
        return this.reqParamMappingId;
    }

    public ApiTransferVO setReqParamMappingType(String reqParamMappingType) {
        this.reqParamMappingType = reqParamMappingType;
        return this;
    }
    public String getReqParamMappingType() {
        return this.reqParamMappingType;
    }

    public ApiTransferVO setRespParamMapping(ParamMappingInfoVO respParamMapping) {
        this.respParamMapping = respParamMapping;
        return this;
    }
    public ParamMappingInfoVO getRespParamMapping() {
        return this.respParamMapping;
    }

    public ApiTransferVO setRespParamMappingId(String respParamMappingId) {
        this.respParamMappingId = respParamMappingId;
        return this;
    }
    public String getRespParamMappingId() {
        return this.respParamMappingId;
    }

    public ApiTransferVO setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public ApiTransferVO setRouterInfo(RouterInfoVO routerInfo) {
        this.routerInfo = routerInfo;
        return this;
    }
    public RouterInfoVO getRouterInfo() {
        return this.routerInfo;
    }

    public ApiTransferVO setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public ApiTransferVO setRsqParam(ApiParamVO rsqParam) {
        this.rsqParam = rsqParam;
        return this;
    }
    public ApiParamVO getRsqParam() {
        return this.rsqParam;
    }

    public ApiTransferVO setSystemCluster(SystemClusterVO systemCluster) {
        this.systemCluster = systemCluster;
        return this;
    }
    public SystemClusterVO getSystemCluster() {
        return this.systemCluster;
    }

    public ApiTransferVO setSysId(String sysId) {
        this.sysId = sysId;
        return this;
    }
    public String getSysId() {
        return this.sysId;
    }

    public ApiTransferVO setTargetWorkspaceId(String targetWorkspaceId) {
        this.targetWorkspaceId = targetWorkspaceId;
        return this;
    }
    public String getTargetWorkspaceId() {
        return this.targetWorkspaceId;
    }

    public ApiTransferVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiTransferVO setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public ApiTransferVO setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public ApiTransferVO setUpdateConfigList(java.util.List<String> updateConfigList) {
        this.updateConfigList = updateConfigList;
        return this;
    }
    public java.util.List<String> getUpdateConfigList() {
        return this.updateConfigList;
    }

    public ApiTransferVO setUpstreamParamMappings(java.util.List<ApiParamVO> upstreamParamMappings) {
        this.upstreamParamMappings = upstreamParamMappings;
        return this;
    }
    public java.util.List<ApiParamVO> getUpstreamParamMappings() {
        return this.upstreamParamMappings;
    }

    public ApiTransferVO setUpstreamPath(String upstreamPath) {
        this.upstreamPath = upstreamPath;
        return this;
    }
    public String getUpstreamPath() {
        return this.upstreamPath;
    }

    public ApiTransferVO setUpstreamProtocol(String upstreamProtocol) {
        this.upstreamProtocol = upstreamProtocol;
        return this;
    }
    public String getUpstreamProtocol() {
        return this.upstreamProtocol;
    }

    public ApiTransferVO setUpstreamType(String upstreamType) {
        this.upstreamType = upstreamType;
        return this;
    }
    public String getUpstreamType() {
        return this.upstreamType;
    }

    public ApiTransferVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ApiTransferVO setImportResult(String importResult) {
        this.importResult = importResult;
        return this;
    }
    public String getImportResult() {
        return this.importResult;
    }

    public ApiTransferVO setDomainList(java.util.List<ApiGroupDomainVO> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<ApiGroupDomainVO> getDomainList() {
        return this.domainList;
    }

    public ApiTransferVO setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public ApiTransferVO setStrategyInfo(StrategyInfoVO strategyInfo) {
        this.strategyInfo = strategyInfo;
        return this;
    }
    public StrategyInfoVO getStrategyInfo() {
        return this.strategyInfo;
    }

    public ApiTransferVO setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public ApiTransferVO setApiCrossZoneList(java.util.List<ApiCrossZoneVO> apiCrossZoneList) {
        this.apiCrossZoneList = apiCrossZoneList;
        return this;
    }
    public java.util.List<ApiCrossZoneVO> getApiCrossZoneList() {
        return this.apiCrossZoneList;
    }

    public ApiTransferVO setRegistryGroup(String registryGroup) {
        this.registryGroup = registryGroup;
        return this;
    }
    public String getRegistryGroup() {
        return this.registryGroup;
    }

    public ApiTransferVO setParameter(java.util.List<String> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.List<String> getParameter() {
        return this.parameter;
    }

    public ApiTransferVO setUpFunctionName(String upFunctionName) {
        this.upFunctionName = upFunctionName;
        return this;
    }
    public String getUpFunctionName() {
        return this.upFunctionName;
    }

    public ApiTransferVO setParamPathList(java.util.List<String> paramPathList) {
        this.paramPathList = paramPathList;
        return this;
    }
    public java.util.List<String> getParamPathList() {
        return this.paramPathList;
    }

    public ApiTransferVO setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public ApiTransferVO setAuthAppInfoId(String authAppInfoId) {
        this.authAppInfoId = authAppInfoId;
        return this;
    }
    public String getAuthAppInfoId() {
        return this.authAppInfoId;
    }

    public ApiTransferVO setOperationPermission(Boolean operationPermission) {
        this.operationPermission = operationPermission;
        return this;
    }
    public Boolean getOperationPermission() {
        return this.operationPermission;
    }

    public ApiTransferVO setDataEncryption(String dataEncryption) {
        this.dataEncryption = dataEncryption;
        return this;
    }
    public String getDataEncryption() {
        return this.dataEncryption;
    }

    public ApiTransferVO setEgressList(java.util.List<GateWayConfigVO> egressList) {
        this.egressList = egressList;
        return this;
    }
    public java.util.List<GateWayConfigVO> getEgressList() {
        return this.egressList;
    }

    public ApiTransferVO setHistoryVersionList(java.util.List<ApiVersionVO> historyVersionList) {
        this.historyVersionList = historyVersionList;
        return this;
    }
    public java.util.List<ApiVersionVO> getHistoryVersionList() {
        return this.historyVersionList;
    }

    public ApiTransferVO setIngress(String ingress) {
        this.ingress = ingress;
        return this;
    }
    public String getIngress() {
        return this.ingress;
    }

    public ApiTransferVO setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ApiTransferVO setReqModelId(String reqModelId) {
        this.reqModelId = reqModelId;
        return this;
    }
    public String getReqModelId() {
        return this.reqModelId;
    }

    public ApiTransferVO setReqModelName(String reqModelName) {
        this.reqModelName = reqModelName;
        return this;
    }
    public String getReqModelName() {
        return this.reqModelName;
    }

    public ApiTransferVO setReqType(String reqType) {
        this.reqType = reqType;
        return this;
    }
    public String getReqType() {
        return this.reqType;
    }

    public ApiTransferVO setRespModelId(String respModelId) {
        this.respModelId = respModelId;
        return this;
    }
    public String getRespModelId() {
        return this.respModelId;
    }

    public ApiTransferVO setRespModelName(String respModelName) {
        this.respModelName = respModelName;
        return this;
    }
    public String getRespModelName() {
        return this.respModelName;
    }

    public ApiTransferVO setRespType(String respType) {
        this.respType = respType;
        return this;
    }
    public String getRespType() {
        return this.respType;
    }

    public ApiTransferVO setIngressList(java.util.List<GateWayConfigVO> ingressList) {
        this.ingressList = ingressList;
        return this;
    }
    public java.util.List<GateWayConfigVO> getIngressList() {
        return this.ingressList;
    }

    public ApiTransferVO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApiTransferVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public ApiTransferVO setFieldMapping(java.util.List<ApiflowOutputVO> fieldMapping) {
        this.fieldMapping = fieldMapping;
        return this;
    }
    public java.util.List<ApiflowOutputVO> getFieldMapping() {
        return this.fieldMapping;
    }

    public ApiTransferVO setNeedTls(Boolean needTls) {
        this.needTls = needTls;
        return this;
    }
    public Boolean getNeedTls() {
        return this.needTls;
    }

}
