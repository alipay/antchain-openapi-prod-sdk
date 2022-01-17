<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiCrossZoneVO extends Model
{
    // workspace_id
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;

    // tenant_id
    /**
     * @example TSCPDICNT
     *
     * @var string
     */
    public $tenantId;

    // api_id
    /**
     * @example api_id
     *
     * @var string
     */
    public $apiId;

    // gw_id
    /**
     * @example gw_id
     *
     * @var string
     */
    public $gwId;

    // 注册中心类型
    /**
     * @example DSR、SOFA、NONE
     *
     * @var string
     */
    public $sysType;

    // 网关类型
    /**
     * @example egress、ingress
     *
     * @var string
     */
    public $type;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // registry_id
    /**
     * @example registry_id
     *
     * @var string
     */
    public $registryId;
    protected $_name = [
        'workspaceId' => 'workspace_id',
        'tenantId'    => 'tenant_id',
        'apiId'       => 'api_id',
        'gwId'        => 'gw_id',
        'sysType'     => 'sys_type',
        'type'        => 'type',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'registryId'  => 'registry_id',
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
        if (null !== $this->apiId) {
            $res['api_id'] = $this->apiId;
        }
        if (null !== $this->gwId) {
            $res['gw_id'] = $this->gwId;
        }
        if (null !== $this->sysType) {
            $res['sys_type'] = $this->sysType;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->registryId) {
            $res['registry_id'] = $this->registryId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiCrossZoneVO
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
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['gw_id'])) {
            $model->gwId = $map['gw_id'];
        }
        if (isset($map['sys_type'])) {
            $model->sysType = $map['sys_type'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['registry_id'])) {
            $model->registryId = $map['registry_id'];
        }

        return $model;
    }
}
