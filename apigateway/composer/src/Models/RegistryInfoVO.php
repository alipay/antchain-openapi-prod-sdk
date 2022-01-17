<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class RegistryInfoVO extends Model
{
    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // 注册中心标识
    /**
     * @example registry_id
     *
     * @var string
     */
    public $registryId;

    // 注册中心类型
    /**
     * @example registry_type
     *
     * @var string
     */
    public $registryType;

    // 名称
    /**
     * @example registry_name
     *
     * @var string
     */
    public $registryName;

    // access_key
    /**
     * @example access_key
     *
     * @var string
     */
    public $accessKey;

    // secret_key
    /**
     * @example secret_key
     *
     * @var string
     */
    public $secretKey;

    // 集群数量
    /**
     * @example 1
     *
     * @var int
     */
    public $sysCount;

    // host
    /**
     * @example host
     *
     * @var string[]
     */
    public $host;

    // can_delete
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // port
    /**
     * @example
     *
     * @var int
     */
    public $port;

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

    // operator
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // pub协议标识
    /**
     * @example pub_protocol
     *
     * @var string
     */
    public $pubProtocol;

    // can_update
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canUpdate;

    // 注册中心分组
    /**
     * @example registry_group
     *
     * @var string
     */
    public $registryGroup;

    // 协议版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $protocolVersion;

    // 命名空间
    /**
     * @example name_space
     *
     * @var string
     */
    public $nameSpace;

    // 集群名称
    /**
     * @example cluster_name
     *
     * @var string
     */
    public $clusterName;
    protected $_name = [
        'workspaceId'     => 'workspace_id',
        'tenantId'        => 'tenant_id',
        'registryId'      => 'registry_id',
        'registryType'    => 'registry_type',
        'registryName'    => 'registry_name',
        'accessKey'       => 'access_key',
        'secretKey'       => 'secret_key',
        'sysCount'        => 'sys_count',
        'host'            => 'host',
        'canDelete'       => 'can_delete',
        'port'            => 'port',
        'gmtCreate'       => 'gmt_create',
        'gmtModified'     => 'gmt_modified',
        'operator'        => 'operator',
        'pubProtocol'     => 'pub_protocol',
        'canUpdate'       => 'can_update',
        'registryGroup'   => 'registry_group',
        'protocolVersion' => 'protocol_version',
        'nameSpace'       => 'name_space',
        'clusterName'     => 'cluster_name',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->registryId) {
            $res['registry_id'] = $this->registryId;
        }
        if (null !== $this->registryType) {
            $res['registry_type'] = $this->registryType;
        }
        if (null !== $this->registryName) {
            $res['registry_name'] = $this->registryName;
        }
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->secretKey) {
            $res['secret_key'] = $this->secretKey;
        }
        if (null !== $this->sysCount) {
            $res['sys_count'] = $this->sysCount;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->pubProtocol) {
            $res['pub_protocol'] = $this->pubProtocol;
        }
        if (null !== $this->canUpdate) {
            $res['can_update'] = $this->canUpdate;
        }
        if (null !== $this->registryGroup) {
            $res['registry_group'] = $this->registryGroup;
        }
        if (null !== $this->protocolVersion) {
            $res['protocol_version'] = $this->protocolVersion;
        }
        if (null !== $this->nameSpace) {
            $res['name_space'] = $this->nameSpace;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegistryInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['registry_id'])) {
            $model->registryId = $map['registry_id'];
        }
        if (isset($map['registry_type'])) {
            $model->registryType = $map['registry_type'];
        }
        if (isset($map['registry_name'])) {
            $model->registryName = $map['registry_name'];
        }
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['secret_key'])) {
            $model->secretKey = $map['secret_key'];
        }
        if (isset($map['sys_count'])) {
            $model->sysCount = $map['sys_count'];
        }
        if (isset($map['host'])) {
            if (!empty($map['host'])) {
                $model->host = $map['host'];
            }
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['pub_protocol'])) {
            $model->pubProtocol = $map['pub_protocol'];
        }
        if (isset($map['can_update'])) {
            $model->canUpdate = $map['can_update'];
        }
        if (isset($map['registry_group'])) {
            $model->registryGroup = $map['registry_group'];
        }
        if (isset($map['protocol_version'])) {
            $model->protocolVersion = $map['protocol_version'];
        }
        if (isset($map['name_space'])) {
            $model->nameSpace = $map['name_space'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }

        return $model;
    }
}
