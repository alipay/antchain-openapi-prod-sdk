// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiTransferVO
    public class ApiTransferVO : TeaModel {
        // API缓存模型
        [NameInMap("api_cache_model")]
        [Validation(Required=false)]
        public ApiCacheVO ApiCacheModel { get; set; }

        // api_group
        [NameInMap("api_group")]
        [Validation(Required=false)]
        public ApiGroupVO ApiGroup { get; set; }

        // API分组标识
        [NameInMap("api_group_id")]
        [Validation(Required=false)]
        public string ApiGroupId { get; set; }

        // 所属API分组名称
        [NameInMap("api_group_name")]
        [Validation(Required=false)]
        public string ApiGroupName { get; set; }

        // API标识
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // API限流配置
        [NameInMap("api_limit_config")]
        [Validation(Required=false)]
        public LimitConfigVO ApiLimitConfig { get; set; }

        // api_mock_config
        [NameInMap("api_mock_config")]
        [Validation(Required=false)]
        public ApiMockConfigVO ApiMockConfig { get; set; }

        // API名称
        [NameInMap("api_name")]
        [Validation(Required=false)]
        public string ApiName { get; set; }

        // apiStatus
        [NameInMap("api_status")]
        [Validation(Required=false)]
        public string ApiStatus { get; set; }

        // 授权应用类型
        [NameInMap("app_type")]
        [Validation(Required=false)]
        public string AppType { get; set; }

        // authentication_type
        [NameInMap("authentication_type")]
        [Validation(Required=false)]
        public string AuthenticationType { get; set; }

        // auth_app_count
        [NameInMap("auth_app_count")]
        [Validation(Required=false)]
        public long? AuthAppCount { get; set; }

        // 是否可以删除
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // charset
        [NameInMap("charset")]
        [Validation(Required=false)]
        public string Charset { get; set; }

        // 重复的配置  信息详情
        [NameInMap("check_result")]
        [Validation(Required=false)]
        public string CheckResult { get; set; }

        // 完整interface_name
        [NameInMap("complete_interface_name")]
        [Validation(Required=false)]
        public string CompleteInterfaceName { get; set; }

        // contentType
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // cors_id
        [NameInMap("cors_id")]
        [Validation(Required=false)]
        public string CorsId { get; set; }

        // cors_info
        [NameInMap("cors_info")]
        [Validation(Required=false)]
        public CorsInfoVO CorsInfo { get; set; }

        // 当前显示的版本
        [NameInMap("current_version_no")]
        [Validation(Required=false)]
        public string CurrentVersionNo { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // API分组域名
        [NameInMap("domain_name")]
        [Validation(Required=false)]
        public string DomainName { get; set; }

        // downstreamProtocol
        [NameInMap("downstream_protocol")]
        [Validation(Required=false)]
        public string DownstreamProtocol { get; set; }

        // 编辑中的版本
        [NameInMap("edit_version")]
        [Validation(Required=false)]
        public ApiVersionVO EditVersion { get; set; }

        // 编辑中的API版本号
        [NameInMap("edit_version_no")]
        [Validation(Required=false)]
        public string EditVersionNo { get; set; }

        // external_auth
        [NameInMap("external_auth")]
        [Validation(Required=false)]
        public ExternalAuthInfoVO ExternalAuth { get; set; }

        // 外部系统标识
        [NameInMap("external_auth_id")]
        [Validation(Required=false)]
        public string ExternalAuthId { get; set; }

        // 方法名
        [NameInMap("function_name")]
        [Validation(Required=false)]
        public string FunctionName { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 接口名称
        [NameInMap("interface_name")]
        [Validation(Required=false)]
        public string InterfaceName { get; set; }

        // method
        [NameInMap("method")]
        [Validation(Required=false)]
        public string Method { get; set; }

        // onlineVersion
        [NameInMap("online_version")]
        [Validation(Required=false)]
        public ApiVersionVO OnlineVersion { get; set; }

        // 发布中的API版本号
        [NameInMap("online_version_no")]
        [Validation(Required=false)]
        public string OnlineVersionNo { get; set; }

        // operation_type
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

        // 创建人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // path
        [NameInMap("path")]
        [Validation(Required=false)]
        public string Path { get; set; }

        // 路径匹配类型
        [NameInMap("path_match_type")]
        [Validation(Required=false)]
        public string PathMatchType { get; set; }

        // reqParams
        [NameInMap("req_params")]
        [Validation(Required=false)]
        public List<ApiParamVO> ReqParams { get; set; }

        // reqparammapping
        [NameInMap("req_param_mapping")]
        [Validation(Required=false)]
        public ParamMappingInfoVO ReqParamMapping { get; set; }

        // 请求参数映射标识
        [NameInMap("req_param_mapping_id")]
        [Validation(Required=false)]
        public string ReqParamMappingId { get; set; }

        // 参数映射类型（普通\高级）
        [NameInMap("req_param_mapping_type")]
        [Validation(Required=false)]
        public string ReqParamMappingType { get; set; }

        // respparammapping
        [NameInMap("resp_param_mapping")]
        [Validation(Required=false)]
        public ParamMappingInfoVO RespParamMapping { get; set; }

        // 响应参数标识
        [NameInMap("resp_param_mapping_id")]
        [Validation(Required=false)]
        public string RespParamMappingId { get; set; }

        // router_id
        [NameInMap("router_id")]
        [Validation(Required=false)]
        public string RouterId { get; set; }

        // 	
        // 路由规则
        [NameInMap("router_info")]
        [Validation(Required=false)]
        public RouterInfoVO RouterInfo { get; set; }

        // 路由策略类型
        [NameInMap("router_type")]
        [Validation(Required=false)]
        public string RouterType { get; set; }

        // rsqParam
        [NameInMap("rsq_param")]
        [Validation(Required=false)]
        public ApiParamVO RsqParam { get; set; }

        // 	
        // 后端集群
        [NameInMap("system_cluster")]
        [Validation(Required=false)]
        public SystemClusterVO SystemCluster { get; set; }

        // sys_id
        [NameInMap("sys_id")]
        [Validation(Required=false)]
        public string SysId { get; set; }

        // 目标工作空间标识
        [NameInMap("target_workspace_id")]
        [Validation(Required=false)]
        public string TargetWorkspaceId { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // timeout
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

        // 服务标识
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // 需要覆盖的配置
        [NameInMap("update_config_list")]
        [Validation(Required=false)]
        public List<string> UpdateConfigList { get; set; }

        // upstreamParamMappings
        [NameInMap("upstream_param_mappings")]
        [Validation(Required=false)]
        public List<ApiParamVO> UpstreamParamMappings { get; set; }

        // upstreamPath
        [NameInMap("upstream_path")]
        [Validation(Required=false)]
        public string UpstreamPath { get; set; }

        // upstreamProtocol
        [NameInMap("upstream_protocol")]
        [Validation(Required=false)]
        public string UpstreamProtocol { get; set; }

        // 后端服务类型
        [NameInMap("upstream_type")]
        [Validation(Required=false)]
        public string UpstreamType { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 导入失败的原因
        [NameInMap("import_result")]
        [Validation(Required=false)]
        public string ImportResult { get; set; }

        // domain_list
        [NameInMap("domain_list")]
        [Validation(Required=false)]
        public List<ApiGroupDomainVO> DomainList { get; set; }

        // 策略ID
        [NameInMap("strategy_id")]
        [Validation(Required=false)]
        public string StrategyId { get; set; }

        // 策略详情
        [NameInMap("strategy_info")]
        [Validation(Required=false)]
        public StrategyInfoVO StrategyInfo { get; set; }

        // crossZone双网关 (api 类型)
        [NameInMap("api_type")]
        [Validation(Required=false)]
        public string ApiType { get; set; }

        // api的网关配置列表
        [NameInMap("api_cross_zone_list")]
        [Validation(Required=false)]
        public List<ApiCrossZoneVO> ApiCrossZoneList { get; set; }

        // registry_group
        [NameInMap("registry_group")]
        [Validation(Required=false)]
        public string RegistryGroup { get; set; }

        // parameter
        [NameInMap("parameter")]
        [Validation(Required=false)]
        public List<string> Parameter { get; set; }

        // up_function_name
        [NameInMap("up_function_name")]
        [Validation(Required=false)]
        public string UpFunctionName { get; set; }

        // param_path_list
        [NameInMap("param_path_list")]
        [Validation(Required=false)]
        public List<string> ParamPathList { get; set; }

        // dubbo发布服务版本
        [NameInMap("service_version")]
        [Validation(Required=false)]
        public string ServiceVersion { get; set; }

        // auth_app_info_id
        [NameInMap("auth_app_info_id")]
        [Validation(Required=false)]
        public string AuthAppInfoId { get; set; }

        // operation_permission
        [NameInMap("operation_permission")]
        [Validation(Required=false)]
        public bool? OperationPermission { get; set; }

        // data_encryption
        [NameInMap("data_encryption")]
        [Validation(Required=false)]
        public string DataEncryption { get; set; }

        // egress_list
        [NameInMap("egress_list")]
        [Validation(Required=false)]
        public List<GateWayConfigVO> EgressList { get; set; }

        // history_version_list
        [NameInMap("history_version_list")]
        [Validation(Required=false)]
        public List<ApiVersionVO> HistoryVersionList { get; set; }

        // GateWayConfigVO
        [NameInMap("ingress")]
        [Validation(Required=false)]
        public string Ingress { get; set; }

        // model
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // req_model_id
        [NameInMap("req_model_id")]
        [Validation(Required=false)]
        public string ReqModelId { get; set; }

        // req_model_name	
        [NameInMap("req_model_name")]
        [Validation(Required=false)]
        public string ReqModelName { get; set; }

        // req_type
        [NameInMap("req_type")]
        [Validation(Required=false)]
        public string ReqType { get; set; }

        // resp_model_id
        [NameInMap("resp_model_id")]
        [Validation(Required=false)]
        public string RespModelId { get; set; }

        // resp_model_name
        [NameInMap("resp_model_name")]
        [Validation(Required=false)]
        public string RespModelName { get; set; }

        // resp_type
        [NameInMap("resp_type")]
        [Validation(Required=false)]
        public string RespType { get; set; }

        // ingress_list
        [NameInMap("ingress_list")]
        [Validation(Required=false)]
        public List<GateWayConfigVO> IngressList { get; set; }

        // content
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // api_count
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // field_mapping
        [NameInMap("field_mapping")]
        [Validation(Required=false)]
        public List<ApiflowOutputVO> FieldMapping { get; set; }

        // need_tls
        [NameInMap("need_tls")]
        [Validation(Required=false)]
        public bool? NeedTls { get; set; }

    }

}
