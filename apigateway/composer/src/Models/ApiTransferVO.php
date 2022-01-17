<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiTransferVO extends Model
{
    // API缓存模型
    /**
     * @example
     *
     * @var ApiCacheVO
     */
    public $apiCacheModel;

    // api_group
    /**
     * @example
     *
     * @var ApiGroupVO
     */
    public $apiGroup;

    // API分组标识
    /**
     * @example api_group_id1
     *
     * @var string
     */
    public $apiGroupId;

    // 所属API分组名称
    /**
     * @example api_group_name1
     *
     * @var string
     */
    public $apiGroupName;

    // API标识
    /**
     * @example api_id
     *
     * @var string
     */
    public $apiId;

    // API限流配置
    /**
     * @example
     *
     * @var LimitConfigVO
     */
    public $apiLimitConfig;

    // api_mock_config
    /**
     * @example api_mock_config
     *
     * @var ApiMockConfigVO
     */
    public $apiMockConfig;

    // API名称
    /**
     * @example apiname1
     *
     * @var string
     */
    public $apiName;

    // apiStatus
    /**
     * @example OPENED / CLOSED
     *
     * @var string
     */
    public $apiStatus;

    // 授权应用类型
    /**
     * @example MPAAS/STANDARD/STANDARD_AND_MPAAS
     *
     * @var string
     */
    public $appType;

    // authentication_type
    /**
     * @example NONE / SECRET
     *
     * @var string
     */
    public $authenticationType;

    // auth_app_count
    /**
     * @example
     *
     * @var int
     */
    public $authAppCount;

    // 是否可以删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // charset
    /**
     * @example UTF-8
     *
     * @var string
     */
    public $charset;

    // 重复的配置  信息详情
    /**
     * @example {}
     *
     * @var string
     */
    public $checkResult;

    // 完整interface_name
    /**
     * @example com.example.dubbo.demo.UserService:1.0:asds@DEFAULT
     *
     * @var string
     */
    public $completeInterfaceName;

    // contentType
    /**
     * @example content_type1
     *
     * @var string
     */
    public $contentType;

    // cors_id
    /**
     * @example cors_id
     *
     * @var string
     */
    public $corsId;

    // cors_info
    /**
     * @example
     *
     * @var CorsInfoVO
     */
    public $corsInfo;

    // 当前显示的版本
    /**
     * @example current_version_no
     *
     * @var string
     */
    public $currentVersionNo;

    // description
    /**
     * @example description1
     *
     * @var string
     */
    public $description;

    // API分组域名
    /**
     * @example test.apigateway.com
     *
     * @var string
     */
    public $domainName;

    // downstreamProtocol
    /**
     * @example HTTP / SOFA / SOFA_VPC
     *
     * @var string
     */
    public $downstreamProtocol;

    // 编辑中的版本
    /**
     * @example edit_version
     *
     * @var ApiVersionVO
     */
    public $editVersion;

    // 编辑中的API版本号
    /**
     * @example edit_version_no1
     *
     * @var string
     */
    public $editVersionNo;

    // external_auth
    /**
     * @example
     *
     * @var ExternalAuthInfoVO
     */
    public $externalAuth;

    // 外部系统标识
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $externalAuthId;

    // 方法名
    /**
     * @example getUserID
     *
     * @var string
     */
    public $functionName;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 接口名称
    /**
     * @example com.alipay.HelloFacade:1.0@DEFAULT
     *
     * @var string
     */
    public $interfaceName;

    // method
    /**
     * @example GET / POST
     *
     * @var string
     */
    public $method;

    // onlineVersion
    /**
     * @example
     *
     * @var ApiVersionVO
     */
    public $onlineVersion;

    // 发布中的API版本号
    /**
     * @example online_version_no
     *
     * @var string
     */
    public $onlineVersionNo;

    // operation_type
    /**
     * @example operation_type
     *
     * @var string
     */
    public $operationType;

    // 创建人
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // path
    /**
     * @example path1
     *
     * @var string
     */
    public $path;

    // 路径匹配类型
    /**
     * @example ABSOLUTE / PREFIX
     *
     * @var string
     */
    public $pathMatchType;

    // reqParams
    /**
     * @example
     *
     * @var ApiParamVO[]
     */
    public $reqParams;

    // reqparammapping
    /**
     * @example
     *
     * @var ParamMappingInfoVO
     */
    public $reqParamMapping;

    // 请求参数映射标识
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $reqParamMappingId;

    // 参数映射类型（普通\高级）
    /**
     * @example ORDINARY/SENIOR
     *
     * @var string
     */
    public $reqParamMappingType;

    // respparammapping
    /**
     * @example
     *
     * @var ParamMappingInfoVO
     */
    public $respParamMapping;

    // 响应参数标识
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $respParamMappingId;

    // router_id
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $routerId;

    //
    // 路由规则
    /**
     * @example
     *
     * @var RouterInfoVO
     */
    public $routerInfo;

    // 路由策略类型
    /**
     * @example PATH / HEADER / WEIGHT/LDC
     *
     * @var string
     */
    public $routerType;

    // rsqParam
    /**
     * @example
     *
     * @var ApiParamVO
     */
    public $rsqParam;

    //
    // 后端集群
    /**
     * @example
     *
     * @var SystemClusterVO
     */
    public $systemCluster;

    // sys_id
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $sysId;

    // 目标工作空间标识
    /**
     * @example target_workspace_id
     *
     * @var string
     */
    public $targetWorkspaceId;

    // 租户标识
    /**
     * @example tenant1
     *
     * @var string
     */
    public $tenantId;

    // timeout
    /**
     * @example 123
     *
     * @var int
     */
    public $timeout;

    // 服务标识
    /**
     * @example unique_id
     *
     * @var string
     */
    public $uniqueId;

    // 需要覆盖的配置
    /**
     * @example ["apiGroup","systemCluster","routerInfo","corsInfo","reqParamMapping","respParamMapping","externalAuth"]
     *
     * @var string[]
     */
    public $updateConfigList;

    // upstreamParamMappings
    /**
     * @example
     *
     * @var ApiParamVO[]
     */
    public $upstreamParamMappings;

    // upstreamPath
    /**
     * @example upstream_path1
     *
     * @var string
     */
    public $upstreamPath;

    // upstreamProtocol
    /**
     * @example HTTP / MRPC / SOFA / SOFA_VPC
     *
     * @var string
     */
    public $upstreamProtocol;

    // 后端服务类型
    /**
     * @example NONE / MOCK / SYSTEM_CLUSTER
     *
     * @var string
     */
    public $upstreamType;

    // 工作空间标识
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;

    // 导入失败的原因
    /**
     * @example {}
     *
     * @var string
     */
    public $importResult;

    // domain_list
    /**
     * @example
     *
     * @var ApiGroupDomainVO[]
     */
    public $domainList;

    // 策略ID
    /**
     * @example strategy_id
     *
     * @var string
     */
    public $strategyId;

    // 策略详情
    /**
     * @example
     *
     * @var StrategyInfoVO
     */
    public $strategyInfo;

    // crossZone双网关 (api 类型)
    /**
     * @example crossZone
     *
     * @var string
     */
    public $apiType;

    // api的网关配置列表
    /**
     * @example
     *
     * @var ApiCrossZoneVO[]
     */
    public $apiCrossZoneList;

    // registry_group
    /**
     * @example registry_group
     *
     * @var string
     */
    public $registryGroup;

    // parameter
    /**
     * @example
     *
     * @var string[]
     */
    public $parameter;

    // up_function_name
    /**
     * @example up_function_name
     *
     * @var string
     */
    public $upFunctionName;

    // param_path_list
    /**
     * @example 参数路径
     *
     * @var string[]
     */
    public $paramPathList;

    // dubbo发布服务版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $serviceVersion;

    // auth_app_info_id
    /**
     * @example auth_app_info_id
     *
     * @var string
     */
    public $authAppInfoId;

    // operation_permission
    /**
     * @example true, false
     *
     * @var bool
     */
    public $operationPermission;

    // data_encryption
    /**
     * @example data_encryption
     *
     * @var string
     */
    public $dataEncryption;

    // egress_list
    /**
     * @example
     *
     * @var GateWayConfigVO[]
     */
    public $egressList;

    // history_version_list
    /**
     * @example
     *
     * @var ApiVersionVO[]
     */
    public $historyVersionList;

    // GateWayConfigVO
    /**
     * @example GateWayConfigVO
     *
     * @var string
     */
    public $ingress;

    // model
    /**
     * @example model
     *
     * @var string
     */
    public $model;

    // req_model_id
    /**
     * @example req_model_id
     *
     * @var string
     */
    public $reqModelId;

    // req_model_name
    /**
     * @example req_model_name
     *
     * @var string
     */
    public $reqModelName;

    // req_type
    /**
     * @example req_type
     *
     * @var string
     */
    public $reqType;

    // resp_model_id
    /**
     * @example resp_model_id
     *
     * @var string
     */
    public $respModelId;

    // resp_model_name
    /**
     * @example resp_model_name
     *
     * @var string
     */
    public $respModelName;

    // resp_type
    /**
     * @example resp_type
     *
     * @var string
     */
    public $respType;

    // ingress_list
    /**
     * @example ingress_list
     *
     * @var GateWayConfigVO[]
     */
    public $ingressList;

    // content
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // api_count
    /**
     * @example api_count
     *
     * @var int
     */
    public $apiCount;

    // field_mapping
    /**
     * @example field_mapping
     *
     * @var ApiflowOutputVO[]
     */
    public $fieldMapping;

    // need_tls
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needTls;
    protected $_name = [
        'apiCacheModel'         => 'api_cache_model',
        'apiGroup'              => 'api_group',
        'apiGroupId'            => 'api_group_id',
        'apiGroupName'          => 'api_group_name',
        'apiId'                 => 'api_id',
        'apiLimitConfig'        => 'api_limit_config',
        'apiMockConfig'         => 'api_mock_config',
        'apiName'               => 'api_name',
        'apiStatus'             => 'api_status',
        'appType'               => 'app_type',
        'authenticationType'    => 'authentication_type',
        'authAppCount'          => 'auth_app_count',
        'canDelete'             => 'can_delete',
        'charset'               => 'charset',
        'checkResult'           => 'check_result',
        'completeInterfaceName' => 'complete_interface_name',
        'contentType'           => 'content_type',
        'corsId'                => 'cors_id',
        'corsInfo'              => 'cors_info',
        'currentVersionNo'      => 'current_version_no',
        'description'           => 'description',
        'domainName'            => 'domain_name',
        'downstreamProtocol'    => 'downstream_protocol',
        'editVersion'           => 'edit_version',
        'editVersionNo'         => 'edit_version_no',
        'externalAuth'          => 'external_auth',
        'externalAuthId'        => 'external_auth_id',
        'functionName'          => 'function_name',
        'gmtCreate'             => 'gmt_create',
        'gmtModified'           => 'gmt_modified',
        'interfaceName'         => 'interface_name',
        'method'                => 'method',
        'onlineVersion'         => 'online_version',
        'onlineVersionNo'       => 'online_version_no',
        'operationType'         => 'operation_type',
        'operator'              => 'operator',
        'path'                  => 'path',
        'pathMatchType'         => 'path_match_type',
        'reqParams'             => 'req_params',
        'reqParamMapping'       => 'req_param_mapping',
        'reqParamMappingId'     => 'req_param_mapping_id',
        'reqParamMappingType'   => 'req_param_mapping_type',
        'respParamMapping'      => 'resp_param_mapping',
        'respParamMappingId'    => 'resp_param_mapping_id',
        'routerId'              => 'router_id',
        'routerInfo'            => 'router_info',
        'routerType'            => 'router_type',
        'rsqParam'              => 'rsq_param',
        'systemCluster'         => 'system_cluster',
        'sysId'                 => 'sys_id',
        'targetWorkspaceId'     => 'target_workspace_id',
        'tenantId'              => 'tenant_id',
        'timeout'               => 'timeout',
        'uniqueId'              => 'unique_id',
        'updateConfigList'      => 'update_config_list',
        'upstreamParamMappings' => 'upstream_param_mappings',
        'upstreamPath'          => 'upstream_path',
        'upstreamProtocol'      => 'upstream_protocol',
        'upstreamType'          => 'upstream_type',
        'workspaceId'           => 'workspace_id',
        'importResult'          => 'import_result',
        'domainList'            => 'domain_list',
        'strategyId'            => 'strategy_id',
        'strategyInfo'          => 'strategy_info',
        'apiType'               => 'api_type',
        'apiCrossZoneList'      => 'api_cross_zone_list',
        'registryGroup'         => 'registry_group',
        'parameter'             => 'parameter',
        'upFunctionName'        => 'up_function_name',
        'paramPathList'         => 'param_path_list',
        'serviceVersion'        => 'service_version',
        'authAppInfoId'         => 'auth_app_info_id',
        'operationPermission'   => 'operation_permission',
        'dataEncryption'        => 'data_encryption',
        'egressList'            => 'egress_list',
        'historyVersionList'    => 'history_version_list',
        'ingress'               => 'ingress',
        'model'                 => 'model',
        'reqModelId'            => 'req_model_id',
        'reqModelName'          => 'req_model_name',
        'reqType'               => 'req_type',
        'respModelId'           => 'resp_model_id',
        'respModelName'         => 'resp_model_name',
        'respType'              => 'resp_type',
        'ingressList'           => 'ingress_list',
        'content'               => 'content',
        'apiCount'              => 'api_count',
        'fieldMapping'          => 'field_mapping',
        'needTls'               => 'need_tls',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiCacheModel) {
            $res['api_cache_model'] = null !== $this->apiCacheModel ? $this->apiCacheModel->toMap() : null;
        }
        if (null !== $this->apiGroup) {
            $res['api_group'] = null !== $this->apiGroup ? $this->apiGroup->toMap() : null;
        }
        if (null !== $this->apiGroupId) {
            $res['api_group_id'] = $this->apiGroupId;
        }
        if (null !== $this->apiGroupName) {
            $res['api_group_name'] = $this->apiGroupName;
        }
        if (null !== $this->apiId) {
            $res['api_id'] = $this->apiId;
        }
        if (null !== $this->apiLimitConfig) {
            $res['api_limit_config'] = null !== $this->apiLimitConfig ? $this->apiLimitConfig->toMap() : null;
        }
        if (null !== $this->apiMockConfig) {
            $res['api_mock_config'] = null !== $this->apiMockConfig ? $this->apiMockConfig->toMap() : null;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->apiStatus) {
            $res['api_status'] = $this->apiStatus;
        }
        if (null !== $this->appType) {
            $res['app_type'] = $this->appType;
        }
        if (null !== $this->authenticationType) {
            $res['authentication_type'] = $this->authenticationType;
        }
        if (null !== $this->authAppCount) {
            $res['auth_app_count'] = $this->authAppCount;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->charset) {
            $res['charset'] = $this->charset;
        }
        if (null !== $this->checkResult) {
            $res['check_result'] = $this->checkResult;
        }
        if (null !== $this->completeInterfaceName) {
            $res['complete_interface_name'] = $this->completeInterfaceName;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->corsId) {
            $res['cors_id'] = $this->corsId;
        }
        if (null !== $this->corsInfo) {
            $res['cors_info'] = null !== $this->corsInfo ? $this->corsInfo->toMap() : null;
        }
        if (null !== $this->currentVersionNo) {
            $res['current_version_no'] = $this->currentVersionNo;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->domainName) {
            $res['domain_name'] = $this->domainName;
        }
        if (null !== $this->downstreamProtocol) {
            $res['downstream_protocol'] = $this->downstreamProtocol;
        }
        if (null !== $this->editVersion) {
            $res['edit_version'] = null !== $this->editVersion ? $this->editVersion->toMap() : null;
        }
        if (null !== $this->editVersionNo) {
            $res['edit_version_no'] = $this->editVersionNo;
        }
        if (null !== $this->externalAuth) {
            $res['external_auth'] = null !== $this->externalAuth ? $this->externalAuth->toMap() : null;
        }
        if (null !== $this->externalAuthId) {
            $res['external_auth_id'] = $this->externalAuthId;
        }
        if (null !== $this->functionName) {
            $res['function_name'] = $this->functionName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->interfaceName) {
            $res['interface_name'] = $this->interfaceName;
        }
        if (null !== $this->method) {
            $res['method'] = $this->method;
        }
        if (null !== $this->onlineVersion) {
            $res['online_version'] = null !== $this->onlineVersion ? $this->onlineVersion->toMap() : null;
        }
        if (null !== $this->onlineVersionNo) {
            $res['online_version_no'] = $this->onlineVersionNo;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->pathMatchType) {
            $res['path_match_type'] = $this->pathMatchType;
        }
        if (null !== $this->reqParams) {
            $res['req_params'] = [];
            if (null !== $this->reqParams && \is_array($this->reqParams)) {
                $n = 0;
                foreach ($this->reqParams as $item) {
                    $res['req_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->reqParamMapping) {
            $res['req_param_mapping'] = null !== $this->reqParamMapping ? $this->reqParamMapping->toMap() : null;
        }
        if (null !== $this->reqParamMappingId) {
            $res['req_param_mapping_id'] = $this->reqParamMappingId;
        }
        if (null !== $this->reqParamMappingType) {
            $res['req_param_mapping_type'] = $this->reqParamMappingType;
        }
        if (null !== $this->respParamMapping) {
            $res['resp_param_mapping'] = null !== $this->respParamMapping ? $this->respParamMapping->toMap() : null;
        }
        if (null !== $this->respParamMappingId) {
            $res['resp_param_mapping_id'] = $this->respParamMappingId;
        }
        if (null !== $this->routerId) {
            $res['router_id'] = $this->routerId;
        }
        if (null !== $this->routerInfo) {
            $res['router_info'] = null !== $this->routerInfo ? $this->routerInfo->toMap() : null;
        }
        if (null !== $this->routerType) {
            $res['router_type'] = $this->routerType;
        }
        if (null !== $this->rsqParam) {
            $res['rsq_param'] = null !== $this->rsqParam ? $this->rsqParam->toMap() : null;
        }
        if (null !== $this->systemCluster) {
            $res['system_cluster'] = null !== $this->systemCluster ? $this->systemCluster->toMap() : null;
        }
        if (null !== $this->sysId) {
            $res['sys_id'] = $this->sysId;
        }
        if (null !== $this->targetWorkspaceId) {
            $res['target_workspace_id'] = $this->targetWorkspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->updateConfigList) {
            $res['update_config_list'] = $this->updateConfigList;
        }
        if (null !== $this->upstreamParamMappings) {
            $res['upstream_param_mappings'] = [];
            if (null !== $this->upstreamParamMappings && \is_array($this->upstreamParamMappings)) {
                $n = 0;
                foreach ($this->upstreamParamMappings as $item) {
                    $res['upstream_param_mappings'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->upstreamPath) {
            $res['upstream_path'] = $this->upstreamPath;
        }
        if (null !== $this->upstreamProtocol) {
            $res['upstream_protocol'] = $this->upstreamProtocol;
        }
        if (null !== $this->upstreamType) {
            $res['upstream_type'] = $this->upstreamType;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->importResult) {
            $res['import_result'] = $this->importResult;
        }
        if (null !== $this->domainList) {
            $res['domain_list'] = [];
            if (null !== $this->domainList && \is_array($this->domainList)) {
                $n = 0;
                foreach ($this->domainList as $item) {
                    $res['domain_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->strategyId) {
            $res['strategy_id'] = $this->strategyId;
        }
        if (null !== $this->strategyInfo) {
            $res['strategy_info'] = null !== $this->strategyInfo ? $this->strategyInfo->toMap() : null;
        }
        if (null !== $this->apiType) {
            $res['api_type'] = $this->apiType;
        }
        if (null !== $this->apiCrossZoneList) {
            $res['api_cross_zone_list'] = [];
            if (null !== $this->apiCrossZoneList && \is_array($this->apiCrossZoneList)) {
                $n = 0;
                foreach ($this->apiCrossZoneList as $item) {
                    $res['api_cross_zone_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->registryGroup) {
            $res['registry_group'] = $this->registryGroup;
        }
        if (null !== $this->parameter) {
            $res['parameter'] = $this->parameter;
        }
        if (null !== $this->upFunctionName) {
            $res['up_function_name'] = $this->upFunctionName;
        }
        if (null !== $this->paramPathList) {
            $res['param_path_list'] = $this->paramPathList;
        }
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }
        if (null !== $this->authAppInfoId) {
            $res['auth_app_info_id'] = $this->authAppInfoId;
        }
        if (null !== $this->operationPermission) {
            $res['operation_permission'] = $this->operationPermission;
        }
        if (null !== $this->dataEncryption) {
            $res['data_encryption'] = $this->dataEncryption;
        }
        if (null !== $this->egressList) {
            $res['egress_list'] = [];
            if (null !== $this->egressList && \is_array($this->egressList)) {
                $n = 0;
                foreach ($this->egressList as $item) {
                    $res['egress_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->historyVersionList) {
            $res['history_version_list'] = [];
            if (null !== $this->historyVersionList && \is_array($this->historyVersionList)) {
                $n = 0;
                foreach ($this->historyVersionList as $item) {
                    $res['history_version_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ingress) {
            $res['ingress'] = $this->ingress;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->reqModelId) {
            $res['req_model_id'] = $this->reqModelId;
        }
        if (null !== $this->reqModelName) {
            $res['req_model_name'] = $this->reqModelName;
        }
        if (null !== $this->reqType) {
            $res['req_type'] = $this->reqType;
        }
        if (null !== $this->respModelId) {
            $res['resp_model_id'] = $this->respModelId;
        }
        if (null !== $this->respModelName) {
            $res['resp_model_name'] = $this->respModelName;
        }
        if (null !== $this->respType) {
            $res['resp_type'] = $this->respType;
        }
        if (null !== $this->ingressList) {
            $res['ingress_list'] = [];
            if (null !== $this->ingressList && \is_array($this->ingressList)) {
                $n = 0;
                foreach ($this->ingressList as $item) {
                    $res['ingress_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->apiCount) {
            $res['api_count'] = $this->apiCount;
        }
        if (null !== $this->fieldMapping) {
            $res['field_mapping'] = [];
            if (null !== $this->fieldMapping && \is_array($this->fieldMapping)) {
                $n = 0;
                foreach ($this->fieldMapping as $item) {
                    $res['field_mapping'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->needTls) {
            $res['need_tls'] = $this->needTls;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiTransferVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_cache_model'])) {
            $model->apiCacheModel = ApiCacheVO::fromMap($map['api_cache_model']);
        }
        if (isset($map['api_group'])) {
            $model->apiGroup = ApiGroupVO::fromMap($map['api_group']);
        }
        if (isset($map['api_group_id'])) {
            $model->apiGroupId = $map['api_group_id'];
        }
        if (isset($map['api_group_name'])) {
            $model->apiGroupName = $map['api_group_name'];
        }
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['api_limit_config'])) {
            $model->apiLimitConfig = LimitConfigVO::fromMap($map['api_limit_config']);
        }
        if (isset($map['api_mock_config'])) {
            $model->apiMockConfig = ApiMockConfigVO::fromMap($map['api_mock_config']);
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['api_status'])) {
            $model->apiStatus = $map['api_status'];
        }
        if (isset($map['app_type'])) {
            $model->appType = $map['app_type'];
        }
        if (isset($map['authentication_type'])) {
            $model->authenticationType = $map['authentication_type'];
        }
        if (isset($map['auth_app_count'])) {
            $model->authAppCount = $map['auth_app_count'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['charset'])) {
            $model->charset = $map['charset'];
        }
        if (isset($map['check_result'])) {
            $model->checkResult = $map['check_result'];
        }
        if (isset($map['complete_interface_name'])) {
            $model->completeInterfaceName = $map['complete_interface_name'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['cors_id'])) {
            $model->corsId = $map['cors_id'];
        }
        if (isset($map['cors_info'])) {
            $model->corsInfo = CorsInfoVO::fromMap($map['cors_info']);
        }
        if (isset($map['current_version_no'])) {
            $model->currentVersionNo = $map['current_version_no'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['domain_name'])) {
            $model->domainName = $map['domain_name'];
        }
        if (isset($map['downstream_protocol'])) {
            $model->downstreamProtocol = $map['downstream_protocol'];
        }
        if (isset($map['edit_version'])) {
            $model->editVersion = ApiVersionVO::fromMap($map['edit_version']);
        }
        if (isset($map['edit_version_no'])) {
            $model->editVersionNo = $map['edit_version_no'];
        }
        if (isset($map['external_auth'])) {
            $model->externalAuth = ExternalAuthInfoVO::fromMap($map['external_auth']);
        }
        if (isset($map['external_auth_id'])) {
            $model->externalAuthId = $map['external_auth_id'];
        }
        if (isset($map['function_name'])) {
            $model->functionName = $map['function_name'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['interface_name'])) {
            $model->interfaceName = $map['interface_name'];
        }
        if (isset($map['method'])) {
            $model->method = $map['method'];
        }
        if (isset($map['online_version'])) {
            $model->onlineVersion = ApiVersionVO::fromMap($map['online_version']);
        }
        if (isset($map['online_version_no'])) {
            $model->onlineVersionNo = $map['online_version_no'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['path_match_type'])) {
            $model->pathMatchType = $map['path_match_type'];
        }
        if (isset($map['req_params'])) {
            if (!empty($map['req_params'])) {
                $model->reqParams = [];
                $n                = 0;
                foreach ($map['req_params'] as $item) {
                    $model->reqParams[$n++] = null !== $item ? ApiParamVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['req_param_mapping'])) {
            $model->reqParamMapping = ParamMappingInfoVO::fromMap($map['req_param_mapping']);
        }
        if (isset($map['req_param_mapping_id'])) {
            $model->reqParamMappingId = $map['req_param_mapping_id'];
        }
        if (isset($map['req_param_mapping_type'])) {
            $model->reqParamMappingType = $map['req_param_mapping_type'];
        }
        if (isset($map['resp_param_mapping'])) {
            $model->respParamMapping = ParamMappingInfoVO::fromMap($map['resp_param_mapping']);
        }
        if (isset($map['resp_param_mapping_id'])) {
            $model->respParamMappingId = $map['resp_param_mapping_id'];
        }
        if (isset($map['router_id'])) {
            $model->routerId = $map['router_id'];
        }
        if (isset($map['router_info'])) {
            $model->routerInfo = RouterInfoVO::fromMap($map['router_info']);
        }
        if (isset($map['router_type'])) {
            $model->routerType = $map['router_type'];
        }
        if (isset($map['rsq_param'])) {
            $model->rsqParam = ApiParamVO::fromMap($map['rsq_param']);
        }
        if (isset($map['system_cluster'])) {
            $model->systemCluster = SystemClusterVO::fromMap($map['system_cluster']);
        }
        if (isset($map['sys_id'])) {
            $model->sysId = $map['sys_id'];
        }
        if (isset($map['target_workspace_id'])) {
            $model->targetWorkspaceId = $map['target_workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['update_config_list'])) {
            if (!empty($map['update_config_list'])) {
                $model->updateConfigList = $map['update_config_list'];
            }
        }
        if (isset($map['upstream_param_mappings'])) {
            if (!empty($map['upstream_param_mappings'])) {
                $model->upstreamParamMappings = [];
                $n                            = 0;
                foreach ($map['upstream_param_mappings'] as $item) {
                    $model->upstreamParamMappings[$n++] = null !== $item ? ApiParamVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['upstream_path'])) {
            $model->upstreamPath = $map['upstream_path'];
        }
        if (isset($map['upstream_protocol'])) {
            $model->upstreamProtocol = $map['upstream_protocol'];
        }
        if (isset($map['upstream_type'])) {
            $model->upstreamType = $map['upstream_type'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['import_result'])) {
            $model->importResult = $map['import_result'];
        }
        if (isset($map['domain_list'])) {
            if (!empty($map['domain_list'])) {
                $model->domainList = [];
                $n                 = 0;
                foreach ($map['domain_list'] as $item) {
                    $model->domainList[$n++] = null !== $item ? ApiGroupDomainVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['strategy_id'])) {
            $model->strategyId = $map['strategy_id'];
        }
        if (isset($map['strategy_info'])) {
            $model->strategyInfo = StrategyInfoVO::fromMap($map['strategy_info']);
        }
        if (isset($map['api_type'])) {
            $model->apiType = $map['api_type'];
        }
        if (isset($map['api_cross_zone_list'])) {
            if (!empty($map['api_cross_zone_list'])) {
                $model->apiCrossZoneList = [];
                $n                       = 0;
                foreach ($map['api_cross_zone_list'] as $item) {
                    $model->apiCrossZoneList[$n++] = null !== $item ? ApiCrossZoneVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['registry_group'])) {
            $model->registryGroup = $map['registry_group'];
        }
        if (isset($map['parameter'])) {
            if (!empty($map['parameter'])) {
                $model->parameter = $map['parameter'];
            }
        }
        if (isset($map['up_function_name'])) {
            $model->upFunctionName = $map['up_function_name'];
        }
        if (isset($map['param_path_list'])) {
            if (!empty($map['param_path_list'])) {
                $model->paramPathList = $map['param_path_list'];
            }
        }
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }
        if (isset($map['auth_app_info_id'])) {
            $model->authAppInfoId = $map['auth_app_info_id'];
        }
        if (isset($map['operation_permission'])) {
            $model->operationPermission = $map['operation_permission'];
        }
        if (isset($map['data_encryption'])) {
            $model->dataEncryption = $map['data_encryption'];
        }
        if (isset($map['egress_list'])) {
            if (!empty($map['egress_list'])) {
                $model->egressList = [];
                $n                 = 0;
                foreach ($map['egress_list'] as $item) {
                    $model->egressList[$n++] = null !== $item ? GateWayConfigVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['history_version_list'])) {
            if (!empty($map['history_version_list'])) {
                $model->historyVersionList = [];
                $n                         = 0;
                foreach ($map['history_version_list'] as $item) {
                    $model->historyVersionList[$n++] = null !== $item ? ApiVersionVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ingress'])) {
            $model->ingress = $map['ingress'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['req_model_id'])) {
            $model->reqModelId = $map['req_model_id'];
        }
        if (isset($map['req_model_name'])) {
            $model->reqModelName = $map['req_model_name'];
        }
        if (isset($map['req_type'])) {
            $model->reqType = $map['req_type'];
        }
        if (isset($map['resp_model_id'])) {
            $model->respModelId = $map['resp_model_id'];
        }
        if (isset($map['resp_model_name'])) {
            $model->respModelName = $map['resp_model_name'];
        }
        if (isset($map['resp_type'])) {
            $model->respType = $map['resp_type'];
        }
        if (isset($map['ingress_list'])) {
            if (!empty($map['ingress_list'])) {
                $model->ingressList = [];
                $n                  = 0;
                foreach ($map['ingress_list'] as $item) {
                    $model->ingressList[$n++] = null !== $item ? GateWayConfigVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['field_mapping'])) {
            if (!empty($map['field_mapping'])) {
                $model->fieldMapping = [];
                $n                   = 0;
                foreach ($map['field_mapping'] as $item) {
                    $model->fieldMapping[$n++] = null !== $item ? ApiflowOutputVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['need_tls'])) {
            $model->needTls = $map['need_tls'];
        }

        return $model;
    }
}
