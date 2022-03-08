<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class RouterInfoVO extends Model
{
    // api数
    /**
     * @example
     *
     * @var int
     */
    public $apiCount;

    // 是否可以删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

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

    // operator
    /**
     * @example scott
     *
     * @var string
     */
    public $operator;

    // routerConfigs
    /**
     * @example
     *
     * @var RouterConfigVO[]
     */
    public $routerConfigs;

    // router_id
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $routerId;

    // routerName
    /**
     * @example router_name1
     *
     * @var string
     */
    public $routerName;

    // routerType
    /**
     * @example PATH / HEADER / WEIGHT / LDC
     *
     * @var string
     */
    public $routerType;

    // upstream_protocol
    /**
     * @example HTTP / MRPC / SOFA / SOFA_VPC
     *
     * @var string
     */
    public $upstreamProtocol;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // 跨域状态
    /**
     * @example OPENED/CLOSED
     *
     * @var string
     */
    public $corsStatus;
    protected $_name = [
        'apiCount'         => 'api_count',
        'canDelete'        => 'can_delete',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'operator'         => 'operator',
        'routerConfigs'    => 'router_configs',
        'routerId'         => 'router_id',
        'routerName'       => 'router_name',
        'routerType'       => 'router_type',
        'upstreamProtocol' => 'upstream_protocol',
        'tenantId'         => 'tenant_id',
        'workspaceId'      => 'workspace_id',
        'corsStatus'       => 'cors_status',
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
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
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
        if (null !== $this->routerConfigs) {
            $res['router_configs'] = [];
            if (null !== $this->routerConfigs && \is_array($this->routerConfigs)) {
                $n = 0;
                foreach ($this->routerConfigs as $item) {
                    $res['router_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->routerId) {
            $res['router_id'] = $this->routerId;
        }
        if (null !== $this->routerName) {
            $res['router_name'] = $this->routerName;
        }
        if (null !== $this->routerType) {
            $res['router_type'] = $this->routerType;
        }
        if (null !== $this->upstreamProtocol) {
            $res['upstream_protocol'] = $this->upstreamProtocol;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->corsStatus) {
            $res['cors_status'] = $this->corsStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouterInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
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
        if (isset($map['router_configs'])) {
            if (!empty($map['router_configs'])) {
                $model->routerConfigs = [];
                $n                    = 0;
                foreach ($map['router_configs'] as $item) {
                    $model->routerConfigs[$n++] = null !== $item ? RouterConfigVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['router_id'])) {
            $model->routerId = $map['router_id'];
        }
        if (isset($map['router_name'])) {
            $model->routerName = $map['router_name'];
        }
        if (isset($map['router_type'])) {
            $model->routerType = $map['router_type'];
        }
        if (isset($map['upstream_protocol'])) {
            $model->upstreamProtocol = $map['upstream_protocol'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['cors_status'])) {
            $model->corsStatus = $map['cors_status'];
        }

        return $model;
    }
}
