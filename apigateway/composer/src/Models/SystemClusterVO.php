<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SystemClusterVO extends Model
{
    // api数
    /**
     * @example
     *
     * @var int
     */
    public $apiCount;

    // 认证配置
    /**
     * @example
     *
     * @var AuthenticationConfigVO
     */
    public $authenticationConfig;

    // 认证方式
    /**
     * @example SECRET/NONE
     *
     * @var string
     */
    public $authenticationType;

    // 是否可以删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // 描述
    /**
     * @example 测试系统
     *
     * @var string
     */
    public $description;

    // 绑定的外部授权数量
    /**
     * @example
     *
     * @var int
     */
    public $externalAuthCount;

    // gmt_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 系统host地址
    /**
     * @example
     *
     * @var string[]
     */
    public $host;

    // 负载均衡策略类型
    /**
     * @example RAMDOM / ROUND_ROBIN
     *
     * @var string
     */
    public $lbType;

    // 创建人
    /**
     * @example scott
     *
     * @var string
     */
    public $operator;

    // 端口
    /**
     * @example 8080
     *
     * @var int
     */
    public $port;

    // 实例id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // sys_id
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $sysId;

    // sys_name
    /**
     * @example test_sys
     *
     * @var string
     */
    public $sysName;

    // 系统类型(手工配置/sofa注册中心/zk)
    /**
     * @example URL / SOFA
     *
     * @var string
     */
    public $sysType;

    // tenant_id
    /**
     * @example TSCPDICNT
     *
     * @var string
     */
    public $tenantId;

    // unique_id
    /**
     * @example unique_id
     *
     * @var string
     */
    public $uniqueId;

    // upstream_protocol
    /**
     * @example HTTP / MRPC / SOFA
     *
     * @var string
     */
    public $upstreamProtocol;

    // 下发协议的开头
    /**
     * @example url_type
     *
     * @var string
     */
    public $urlType;

    // vpc_id
    /**
     * @example vpc_id
     *
     * @var string
     */
    public $vpcId;

    // workspace_id
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;

    // registry_id
    /**
     * @example registry_id
     *
     * @var string
     */
    public $registryId;

    // registry_info
    /**
     * @example
     *
     * @var RegistryInfoVO
     */
    public $registryInfo;

    // triple域名
    /**
     * @example triple_host
     *
     * @var string
     */
    public $tripleHost;

    // need_tls
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needTls;

    // 证书类型
    /**
     * @example DEV/PROD
     *
     * @var string
     */
    public $tlsType;
    protected $_name = [
        'apiCount'             => 'api_count',
        'authenticationConfig' => 'authentication_config',
        'authenticationType'   => 'authentication_type',
        'canDelete'            => 'can_delete',
        'description'          => 'description',
        'externalAuthCount'    => 'external_auth_count',
        'gmtCreate'            => 'gmt_create',
        'gmtModified'          => 'gmt_modified',
        'host'                 => 'host',
        'lbType'               => 'lb_type',
        'operator'             => 'operator',
        'port'                 => 'port',
        'instanceId'           => 'instance_id',
        'sysId'                => 'sys_id',
        'sysName'              => 'sys_name',
        'sysType'              => 'sys_type',
        'tenantId'             => 'tenant_id',
        'uniqueId'             => 'unique_id',
        'upstreamProtocol'     => 'upstream_protocol',
        'urlType'              => 'url_type',
        'vpcId'                => 'vpc_id',
        'workspaceId'          => 'workspace_id',
        'registryId'           => 'registry_id',
        'registryInfo'         => 'registry_info',
        'tripleHost'           => 'triple_host',
        'needTls'              => 'need_tls',
        'tlsType'              => 'tls_type',
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
        if (null !== $this->authenticationConfig) {
            $res['authentication_config'] = null !== $this->authenticationConfig ? $this->authenticationConfig->toMap() : null;
        }
        if (null !== $this->authenticationType) {
            $res['authentication_type'] = $this->authenticationType;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->externalAuthCount) {
            $res['external_auth_count'] = $this->externalAuthCount;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->lbType) {
            $res['lb_type'] = $this->lbType;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->sysId) {
            $res['sys_id'] = $this->sysId;
        }
        if (null !== $this->sysName) {
            $res['sys_name'] = $this->sysName;
        }
        if (null !== $this->sysType) {
            $res['sys_type'] = $this->sysType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->upstreamProtocol) {
            $res['upstream_protocol'] = $this->upstreamProtocol;
        }
        if (null !== $this->urlType) {
            $res['url_type'] = $this->urlType;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->registryId) {
            $res['registry_id'] = $this->registryId;
        }
        if (null !== $this->registryInfo) {
            $res['registry_info'] = null !== $this->registryInfo ? $this->registryInfo->toMap() : null;
        }
        if (null !== $this->tripleHost) {
            $res['triple_host'] = $this->tripleHost;
        }
        if (null !== $this->needTls) {
            $res['need_tls'] = $this->needTls;
        }
        if (null !== $this->tlsType) {
            $res['tls_type'] = $this->tlsType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SystemClusterVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['authentication_config'])) {
            $model->authenticationConfig = AuthenticationConfigVO::fromMap($map['authentication_config']);
        }
        if (isset($map['authentication_type'])) {
            $model->authenticationType = $map['authentication_type'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['external_auth_count'])) {
            $model->externalAuthCount = $map['external_auth_count'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['host'])) {
            if (!empty($map['host'])) {
                $model->host = $map['host'];
            }
        }
        if (isset($map['lb_type'])) {
            $model->lbType = $map['lb_type'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['sys_id'])) {
            $model->sysId = $map['sys_id'];
        }
        if (isset($map['sys_name'])) {
            $model->sysName = $map['sys_name'];
        }
        if (isset($map['sys_type'])) {
            $model->sysType = $map['sys_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['upstream_protocol'])) {
            $model->upstreamProtocol = $map['upstream_protocol'];
        }
        if (isset($map['url_type'])) {
            $model->urlType = $map['url_type'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['registry_id'])) {
            $model->registryId = $map['registry_id'];
        }
        if (isset($map['registry_info'])) {
            $model->registryInfo = RegistryInfoVO::fromMap($map['registry_info']);
        }
        if (isset($map['triple_host'])) {
            $model->tripleHost = $map['triple_host'];
        }
        if (isset($map['need_tls'])) {
            $model->needTls = $map['need_tls'];
        }
        if (isset($map['tls_type'])) {
            $model->tlsType = $map['tls_type'];
        }

        return $model;
    }
}
