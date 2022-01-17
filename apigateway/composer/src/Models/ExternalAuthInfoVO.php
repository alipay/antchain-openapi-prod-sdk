<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ExternalAuthInfoVO extends Model
{
    // 绑定api数量
    /**
     * @example 0
     *
     * @var int
     */
    public $apiCount;

    // 缓存开关
    /**
     * @example OFF/ON
     *
     * @var string
     */
    public $cacheSwitch;

    // 缓存时间
    /**
     * @example
     *
     * @var int
     */
    public $cacheTtl;

    // 能否删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // description
    /**
     * @example description1
     *
     * @var string
     */
    public $description;

    // 外部系统标识
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $externalAuthId;

    // 外部授权名称
    /**
     * @example external_auth_name1
     *
     * @var string
     */
    public $externalAuthName;

    //
    // 方法名
    /**
     * @example getUserID
     *
     * @var string
     */
    public $functionName;

    //
    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    //
    // 更改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 后端接口名
    /**
     * @example com.alipay.HelloFacade:1.0@DEFAULT
     *
     * @var string
     */
    public $interfaceName;

    // 请求方法
    /**
     * @example GET/POST
     *
     * @var string
     */
    public $method;

    // operationtype
    /**
     * @example operation_type1
     *
     * @var string
     */
    public $operationType;

    //
    // 创建人
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // 外部api参数
    /**
     * @example params
     *
     * @var ApiParamVO[]
     */
    public $params;

    // 路由标识
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $routerId;

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

    // SystemClusterVO
    /**
     * @example
     *
     * @var SystemClusterVO
     */
    public $systemCluster;

    // 系统集群标识
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $sysId;

    //
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

    // 后端路径
    /**
     * @example upstream_path1
     *
     * @var string
     */
    public $upstreamPath;

    // 后端协议类型
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
    protected $_name = [
        'apiCount'         => 'api_count',
        'cacheSwitch'      => 'cache_switch',
        'cacheTtl'         => 'cache_ttl',
        'canDelete'        => 'can_delete',
        'description'      => 'description',
        'externalAuthId'   => 'external_auth_id',
        'externalAuthName' => 'external_auth_name',
        'functionName'     => 'function_name',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'interfaceName'    => 'interface_name',
        'method'           => 'method',
        'operationType'    => 'operation_type',
        'operator'         => 'operator',
        'params'           => 'params',
        'routerId'         => 'router_id',
        'routerInfo'       => 'router_info',
        'routerType'       => 'router_type',
        'systemCluster'    => 'system_cluster',
        'sysId'            => 'sys_id',
        'tenantId'         => 'tenant_id',
        'timeout'          => 'timeout',
        'uniqueId'         => 'unique_id',
        'upstreamPath'     => 'upstream_path',
        'upstreamProtocol' => 'upstream_protocol',
        'upstreamType'     => 'upstream_type',
        'workspaceId'      => 'workspace_id',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiCount) {
            $res['api_count'] = $this->apiCount;
        }
        if (null !== $this->cacheSwitch) {
            $res['cache_switch'] = $this->cacheSwitch;
        }
        if (null !== $this->cacheTtl) {
            $res['cache_ttl'] = $this->cacheTtl;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->externalAuthId) {
            $res['external_auth_id'] = $this->externalAuthId;
        }
        if (null !== $this->externalAuthName) {
            $res['external_auth_name'] = $this->externalAuthName;
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
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->params) {
            $res['params'] = [];
            if (null !== $this->params && \is_array($this->params)) {
                $n = 0;
                foreach ($this->params as $item) {
                    $res['params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->systemCluster) {
            $res['system_cluster'] = null !== $this->systemCluster ? $this->systemCluster->toMap() : null;
        }
        if (null !== $this->sysId) {
            $res['sys_id'] = $this->sysId;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExternalAuthInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['cache_switch'])) {
            $model->cacheSwitch = $map['cache_switch'];
        }
        if (isset($map['cache_ttl'])) {
            $model->cacheTtl = $map['cache_ttl'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['external_auth_id'])) {
            $model->externalAuthId = $map['external_auth_id'];
        }
        if (isset($map['external_auth_name'])) {
            $model->externalAuthName = $map['external_auth_name'];
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
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['params'])) {
            if (!empty($map['params'])) {
                $model->params = [];
                $n             = 0;
                foreach ($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? ApiParamVO::fromMap($item) : $item;
                }
            }
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
        if (isset($map['system_cluster'])) {
            $model->systemCluster = SystemClusterVO::fromMap($map['system_cluster']);
        }
        if (isset($map['sys_id'])) {
            $model->sysId = $map['sys_id'];
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

        return $model;
    }
}
