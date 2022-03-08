// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiInfoVO extends TeaModel {
    // API缓存模型
    @NameInMap("api_cache_model")
    public ApiCacheVO apiCacheModel;

    // api的网关配置列表
    @NameInMap("api_cross_zone_list")
    public java.util.List<ApiCrossZoneVO> apiCrossZoneList;

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

    // crossZone双网关 (api 类型)
    @NameInMap("api_type")
    public String apiType;

    // 授权应用类型
    @NameInMap("app_type")
    public String appType;

    // authentication_type
    @NameInMap("authentication_type")
    public String authenticationType;

    // auth_app_count
    @NameInMap("auth_app_count")
    public Long authAppCount;

    // 授权应用Id
    @NameInMap("auth_app_info_id")
    public String authAppInfoId;

    // 是否可以删除
    @NameInMap("can_delete")
    public Boolean canDelete;

    // 操作权限
    @NameInMap("operation_permission")
    public Boolean operationPermission;

    // charset
    @NameInMap("charset")
    public String charset;

    // 完整interfacename
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

    // 数据加密
    @NameInMap("data_encryption")
    public String dataEncryption;

    // description
    @NameInMap("description")
    public String description;

    // API分组域名
    @NameInMap("domain_name")
    public String domainName;

    // downstreamProtocol
    @NameInMap("downstream_protocol")
    public String downstreamProtocol;

    // edit_version
    @NameInMap("edit_version")
    public ApiVersionVO editVersion;

    // 编辑中的API版本号
    @NameInMap("edit_version_no")
    public String editVersionNo;

    // 出口网关列表
    @NameInMap("egress_list")
    public java.util.List<GateWayConfigVO> egressList;

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

    // history_version
    @NameInMap("history_version_list")
    public java.util.List<ApiVersionVO> historyVersionList;

    // 入口网关
    @NameInMap("ingress")
    public GateWayConfigVO ingress;

    // 接口名称
    @NameInMap("interface_name")
    public String interfaceName;

    // method
    @NameInMap("method")
    public String method;

    // 网关模式
    @NameInMap("model")
    public String model;

    // onlineVersion
    @NameInMap("online_version")
    public ApiVersionVO onlineVersion;

    // 发布中的API版本号
    @NameInMap("online_version_no")
    public String onlineVersionNo;

    // operationType
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

    // 请求body模型id
    @NameInMap("req_model_id")
    public String reqModelId;

    // 请求模型名称
    @NameInMap("req_model_name")
    public String reqModelName;

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

    // body类型一级参数
    @NameInMap("req_type")
    public String reqType;

    // 响应参数模型
    @NameInMap("resp_model_id")
    public String respModelId;

    // 响应模型名称
    @NameInMap("resp_model_name")
    public String respModelName;

    // respparammapping
    @NameInMap("resp_param_mapping")
    public ParamMappingInfoVO respParamMapping;

    // 响应参数标识
    @NameInMap("resp_param_mapping_id")
    public String respParamMappingId;

    // 响应参数一级类型
    @NameInMap("resp_type")
    public String respType;

    // router_id
    @NameInMap("router_id")
    public String routerId;

    // 路由规则
    @NameInMap("router_info")
    public RouterInfoVO routerInfo;

    // 路由策略类型
    @NameInMap("router_type")
    public String routerType;

    // rsqParam
    @NameInMap("rsq_param")
    public ApiParamVO rsqParam;

    // 后端集群
    @NameInMap("system_cluster")
    public SystemClusterVO systemCluster;

    // sys_id
    @NameInMap("sys_id")
    public String sysId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // timeout
    @NameInMap("timeout")
    public Long timeout;

    // unique_id
    @NameInMap("unique_id")
    public String uniqueId;

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

    // 策略ID
    @NameInMap("strategy_id")
    public String strategyId;

    // 策略详情
    @NameInMap("strategy_info")
    public StrategyInfoVO strategyInfo;

    // domain_list
    @NameInMap("domain_list")
    public java.util.List<ApiGroupDomainVO> domainList;

    // registry_group
    @NameInMap("registry_group")
    public String registryGroup;

    // param_path_list
    @NameInMap("param_path_list")
    public java.util.List<String> paramPathList;

    // 后端方法名
    @NameInMap("up_function_name")
    public String upFunctionName;

    // dubbo发布服务版本
    @NameInMap("service_version")
    public String serviceVersion;

    // 入口网关
    @NameInMap("ingress_list")
    public java.util.List<GateWayConfigVO> ingressList;

    // content
    @NameInMap("content")
    public String content;

    // api_count
    @NameInMap("api_count")
    public Long apiCount;

    // 流程编排的返回参数映射
    @NameInMap("field_mapping")
    public java.util.List<ApiflowOutputVO> fieldMapping;

    // triple协议证书开关
    @NameInMap("need_tls")
    public Boolean needTls;

    // api_group
    @NameInMap("api_group")
    public ApiGroupVO apiGroup;

    // 授权对象列表
    @NameInMap("auth_app_info_list")
    public java.util.List<AuthAppInfoVO> authAppInfoList;

    // 请求body数据模型
    @NameInMap("req_model_info")
    public ApiModelVO reqModelInfo;

    // 返回body数据模型
    @NameInMap("rsp_model_info")
    public ApiModelVO rspModelInfo;

    // 实例ID
    @NameInMap("upstream_instance_id")
    public String upstreamInstanceId;

    // 跨域状态
    @NameInMap("cors_status")
    public String corsStatus;

    // gray_type
    @NameInMap("gray_type")
    public Boolean grayType;

    public static ApiInfoVO build(java.util.Map<String, ?> map) throws Exception {
        ApiInfoVO self = new ApiInfoVO();
        return TeaModel.build(map, self);
    }

    public ApiInfoVO setApiCacheModel(ApiCacheVO apiCacheModel) {
        this.apiCacheModel = apiCacheModel;
        return this;
    }
    public ApiCacheVO getApiCacheModel() {
        return this.apiCacheModel;
    }

    public ApiInfoVO setApiCrossZoneList(java.util.List<ApiCrossZoneVO> apiCrossZoneList) {
        this.apiCrossZoneList = apiCrossZoneList;
        return this;
    }
    public java.util.List<ApiCrossZoneVO> getApiCrossZoneList() {
        return this.apiCrossZoneList;
    }

    public ApiInfoVO setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public ApiInfoVO setApiGroupName(String apiGroupName) {
        this.apiGroupName = apiGroupName;
        return this;
    }
    public String getApiGroupName() {
        return this.apiGroupName;
    }

    public ApiInfoVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ApiInfoVO setApiLimitConfig(LimitConfigVO apiLimitConfig) {
        this.apiLimitConfig = apiLimitConfig;
        return this;
    }
    public LimitConfigVO getApiLimitConfig() {
        return this.apiLimitConfig;
    }

    public ApiInfoVO setApiMockConfig(ApiMockConfigVO apiMockConfig) {
        this.apiMockConfig = apiMockConfig;
        return this;
    }
    public ApiMockConfigVO getApiMockConfig() {
        return this.apiMockConfig;
    }

    public ApiInfoVO setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ApiInfoVO setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }
    public String getApiStatus() {
        return this.apiStatus;
    }

    public ApiInfoVO setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public ApiInfoVO setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ApiInfoVO setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public ApiInfoVO setAuthAppCount(Long authAppCount) {
        this.authAppCount = authAppCount;
        return this;
    }
    public Long getAuthAppCount() {
        return this.authAppCount;
    }

    public ApiInfoVO setAuthAppInfoId(String authAppInfoId) {
        this.authAppInfoId = authAppInfoId;
        return this;
    }
    public String getAuthAppInfoId() {
        return this.authAppInfoId;
    }

    public ApiInfoVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public ApiInfoVO setOperationPermission(Boolean operationPermission) {
        this.operationPermission = operationPermission;
        return this;
    }
    public Boolean getOperationPermission() {
        return this.operationPermission;
    }

    public ApiInfoVO setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public ApiInfoVO setCompleteInterfaceName(String completeInterfaceName) {
        this.completeInterfaceName = completeInterfaceName;
        return this;
    }
    public String getCompleteInterfaceName() {
        return this.completeInterfaceName;
    }

    public ApiInfoVO setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ApiInfoVO setCorsId(String corsId) {
        this.corsId = corsId;
        return this;
    }
    public String getCorsId() {
        return this.corsId;
    }

    public ApiInfoVO setCorsInfo(CorsInfoVO corsInfo) {
        this.corsInfo = corsInfo;
        return this;
    }
    public CorsInfoVO getCorsInfo() {
        return this.corsInfo;
    }

    public ApiInfoVO setCurrentVersionNo(String currentVersionNo) {
        this.currentVersionNo = currentVersionNo;
        return this;
    }
    public String getCurrentVersionNo() {
        return this.currentVersionNo;
    }

    public ApiInfoVO setDataEncryption(String dataEncryption) {
        this.dataEncryption = dataEncryption;
        return this;
    }
    public String getDataEncryption() {
        return this.dataEncryption;
    }

    public ApiInfoVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiInfoVO setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ApiInfoVO setDownstreamProtocol(String downstreamProtocol) {
        this.downstreamProtocol = downstreamProtocol;
        return this;
    }
    public String getDownstreamProtocol() {
        return this.downstreamProtocol;
    }

    public ApiInfoVO setEditVersion(ApiVersionVO editVersion) {
        this.editVersion = editVersion;
        return this;
    }
    public ApiVersionVO getEditVersion() {
        return this.editVersion;
    }

    public ApiInfoVO setEditVersionNo(String editVersionNo) {
        this.editVersionNo = editVersionNo;
        return this;
    }
    public String getEditVersionNo() {
        return this.editVersionNo;
    }

    public ApiInfoVO setEgressList(java.util.List<GateWayConfigVO> egressList) {
        this.egressList = egressList;
        return this;
    }
    public java.util.List<GateWayConfigVO> getEgressList() {
        return this.egressList;
    }

    public ApiInfoVO setExternalAuth(ExternalAuthInfoVO externalAuth) {
        this.externalAuth = externalAuth;
        return this;
    }
    public ExternalAuthInfoVO getExternalAuth() {
        return this.externalAuth;
    }

    public ApiInfoVO setExternalAuthId(String externalAuthId) {
        this.externalAuthId = externalAuthId;
        return this;
    }
    public String getExternalAuthId() {
        return this.externalAuthId;
    }

    public ApiInfoVO setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ApiInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApiInfoVO setHistoryVersionList(java.util.List<ApiVersionVO> historyVersionList) {
        this.historyVersionList = historyVersionList;
        return this;
    }
    public java.util.List<ApiVersionVO> getHistoryVersionList() {
        return this.historyVersionList;
    }

    public ApiInfoVO setIngress(GateWayConfigVO ingress) {
        this.ingress = ingress;
        return this;
    }
    public GateWayConfigVO getIngress() {
        return this.ingress;
    }

    public ApiInfoVO setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public ApiInfoVO setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public ApiInfoVO setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ApiInfoVO setOnlineVersion(ApiVersionVO onlineVersion) {
        this.onlineVersion = onlineVersion;
        return this;
    }
    public ApiVersionVO getOnlineVersion() {
        return this.onlineVersion;
    }

    public ApiInfoVO setOnlineVersionNo(String onlineVersionNo) {
        this.onlineVersionNo = onlineVersionNo;
        return this;
    }
    public String getOnlineVersionNo() {
        return this.onlineVersionNo;
    }

    public ApiInfoVO setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ApiInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ApiInfoVO setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ApiInfoVO setPathMatchType(String pathMatchType) {
        this.pathMatchType = pathMatchType;
        return this;
    }
    public String getPathMatchType() {
        return this.pathMatchType;
    }

    public ApiInfoVO setReqModelId(String reqModelId) {
        this.reqModelId = reqModelId;
        return this;
    }
    public String getReqModelId() {
        return this.reqModelId;
    }

    public ApiInfoVO setReqModelName(String reqModelName) {
        this.reqModelName = reqModelName;
        return this;
    }
    public String getReqModelName() {
        return this.reqModelName;
    }

    public ApiInfoVO setReqParams(java.util.List<ApiParamVO> reqParams) {
        this.reqParams = reqParams;
        return this;
    }
    public java.util.List<ApiParamVO> getReqParams() {
        return this.reqParams;
    }

    public ApiInfoVO setReqParamMapping(ParamMappingInfoVO reqParamMapping) {
        this.reqParamMapping = reqParamMapping;
        return this;
    }
    public ParamMappingInfoVO getReqParamMapping() {
        return this.reqParamMapping;
    }

    public ApiInfoVO setReqParamMappingId(String reqParamMappingId) {
        this.reqParamMappingId = reqParamMappingId;
        return this;
    }
    public String getReqParamMappingId() {
        return this.reqParamMappingId;
    }

    public ApiInfoVO setReqParamMappingType(String reqParamMappingType) {
        this.reqParamMappingType = reqParamMappingType;
        return this;
    }
    public String getReqParamMappingType() {
        return this.reqParamMappingType;
    }

    public ApiInfoVO setReqType(String reqType) {
        this.reqType = reqType;
        return this;
    }
    public String getReqType() {
        return this.reqType;
    }

    public ApiInfoVO setRespModelId(String respModelId) {
        this.respModelId = respModelId;
        return this;
    }
    public String getRespModelId() {
        return this.respModelId;
    }

    public ApiInfoVO setRespModelName(String respModelName) {
        this.respModelName = respModelName;
        return this;
    }
    public String getRespModelName() {
        return this.respModelName;
    }

    public ApiInfoVO setRespParamMapping(ParamMappingInfoVO respParamMapping) {
        this.respParamMapping = respParamMapping;
        return this;
    }
    public ParamMappingInfoVO getRespParamMapping() {
        return this.respParamMapping;
    }

    public ApiInfoVO setRespParamMappingId(String respParamMappingId) {
        this.respParamMappingId = respParamMappingId;
        return this;
    }
    public String getRespParamMappingId() {
        return this.respParamMappingId;
    }

    public ApiInfoVO setRespType(String respType) {
        this.respType = respType;
        return this;
    }
    public String getRespType() {
        return this.respType;
    }

    public ApiInfoVO setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public ApiInfoVO setRouterInfo(RouterInfoVO routerInfo) {
        this.routerInfo = routerInfo;
        return this;
    }
    public RouterInfoVO getRouterInfo() {
        return this.routerInfo;
    }

    public ApiInfoVO setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public ApiInfoVO setRsqParam(ApiParamVO rsqParam) {
        this.rsqParam = rsqParam;
        return this;
    }
    public ApiParamVO getRsqParam() {
        return this.rsqParam;
    }

    public ApiInfoVO setSystemCluster(SystemClusterVO systemCluster) {
        this.systemCluster = systemCluster;
        return this;
    }
    public SystemClusterVO getSystemCluster() {
        return this.systemCluster;
    }

    public ApiInfoVO setSysId(String sysId) {
        this.sysId = sysId;
        return this;
    }
    public String getSysId() {
        return this.sysId;
    }

    public ApiInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiInfoVO setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public ApiInfoVO setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public ApiInfoVO setUpstreamParamMappings(java.util.List<ApiParamVO> upstreamParamMappings) {
        this.upstreamParamMappings = upstreamParamMappings;
        return this;
    }
    public java.util.List<ApiParamVO> getUpstreamParamMappings() {
        return this.upstreamParamMappings;
    }

    public ApiInfoVO setUpstreamPath(String upstreamPath) {
        this.upstreamPath = upstreamPath;
        return this;
    }
    public String getUpstreamPath() {
        return this.upstreamPath;
    }

    public ApiInfoVO setUpstreamProtocol(String upstreamProtocol) {
        this.upstreamProtocol = upstreamProtocol;
        return this;
    }
    public String getUpstreamProtocol() {
        return this.upstreamProtocol;
    }

    public ApiInfoVO setUpstreamType(String upstreamType) {
        this.upstreamType = upstreamType;
        return this;
    }
    public String getUpstreamType() {
        return this.upstreamType;
    }

    public ApiInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ApiInfoVO setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public ApiInfoVO setStrategyInfo(StrategyInfoVO strategyInfo) {
        this.strategyInfo = strategyInfo;
        return this;
    }
    public StrategyInfoVO getStrategyInfo() {
        return this.strategyInfo;
    }

    public ApiInfoVO setDomainList(java.util.List<ApiGroupDomainVO> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<ApiGroupDomainVO> getDomainList() {
        return this.domainList;
    }

    public ApiInfoVO setRegistryGroup(String registryGroup) {
        this.registryGroup = registryGroup;
        return this;
    }
    public String getRegistryGroup() {
        return this.registryGroup;
    }

    public ApiInfoVO setParamPathList(java.util.List<String> paramPathList) {
        this.paramPathList = paramPathList;
        return this;
    }
    public java.util.List<String> getParamPathList() {
        return this.paramPathList;
    }

    public ApiInfoVO setUpFunctionName(String upFunctionName) {
        this.upFunctionName = upFunctionName;
        return this;
    }
    public String getUpFunctionName() {
        return this.upFunctionName;
    }

    public ApiInfoVO setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public ApiInfoVO setIngressList(java.util.List<GateWayConfigVO> ingressList) {
        this.ingressList = ingressList;
        return this;
    }
    public java.util.List<GateWayConfigVO> getIngressList() {
        return this.ingressList;
    }

    public ApiInfoVO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApiInfoVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public ApiInfoVO setFieldMapping(java.util.List<ApiflowOutputVO> fieldMapping) {
        this.fieldMapping = fieldMapping;
        return this;
    }
    public java.util.List<ApiflowOutputVO> getFieldMapping() {
        return this.fieldMapping;
    }

    public ApiInfoVO setNeedTls(Boolean needTls) {
        this.needTls = needTls;
        return this;
    }
    public Boolean getNeedTls() {
        return this.needTls;
    }

    public ApiInfoVO setApiGroup(ApiGroupVO apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }
    public ApiGroupVO getApiGroup() {
        return this.apiGroup;
    }

    public ApiInfoVO setAuthAppInfoList(java.util.List<AuthAppInfoVO> authAppInfoList) {
        this.authAppInfoList = authAppInfoList;
        return this;
    }
    public java.util.List<AuthAppInfoVO> getAuthAppInfoList() {
        return this.authAppInfoList;
    }

    public ApiInfoVO setReqModelInfo(ApiModelVO reqModelInfo) {
        this.reqModelInfo = reqModelInfo;
        return this;
    }
    public ApiModelVO getReqModelInfo() {
        return this.reqModelInfo;
    }

    public ApiInfoVO setRspModelInfo(ApiModelVO rspModelInfo) {
        this.rspModelInfo = rspModelInfo;
        return this;
    }
    public ApiModelVO getRspModelInfo() {
        return this.rspModelInfo;
    }

    public ApiInfoVO setUpstreamInstanceId(String upstreamInstanceId) {
        this.upstreamInstanceId = upstreamInstanceId;
        return this;
    }
    public String getUpstreamInstanceId() {
        return this.upstreamInstanceId;
    }

    public ApiInfoVO setCorsStatus(String corsStatus) {
        this.corsStatus = corsStatus;
        return this;
    }
    public String getCorsStatus() {
        return this.corsStatus;
    }

    public ApiInfoVO setGrayType(Boolean grayType) {
        this.grayType = grayType;
        return this;
    }
    public Boolean getGrayType() {
        return this.grayType;
    }

}
