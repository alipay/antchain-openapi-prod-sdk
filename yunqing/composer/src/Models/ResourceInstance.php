<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ResourceInstance extends Model
{
    // 环境id
    /**
     * @example 73040000001
     *
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @example YUNYOUDEV
     *
     * @var string
     */
    public $prodCode;

    // zz-rdb
    /**
     * @example 资源池名称
     *
     * @var string
     */
    public $resourcePoolName;

    // 资源id
    /**
     * @example zz-lb-xxxx
     *
     * @var string
     */
    public $resourceId;

    // 资源类型：LB、SERVER、RDB
    /**
     * @example LB
     *
     * @var string
     */
    public $resourceType;

    // 区域id
    /**
     * @example default
     *
     * @var string
     */
    public $regionId;

    // 可用区id
    /**
     * @example default
     *
     * @var string
     */
    public $zoneId;

    // 部署单元标识id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitIdentity;

    // 部署单元实例id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitInstanceIdentity;
    protected $_name = [
        'envId'                          => 'env_id',
        'prodCode'                       => 'prod_code',
        'resourcePoolName'               => 'resource_pool_name',
        'resourceId'                     => 'resource_id',
        'resourceType'                   => 'resource_type',
        'regionId'                       => 'region_id',
        'zoneId'                         => 'zone_id',
        'deploymentUnitIdentity'         => 'deployment_unit_identity',
        'deploymentUnitInstanceIdentity' => 'deployment_unit_instance_identity',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('resourcePoolName', $this->resourcePoolName, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
        Model::validateRequired('deploymentUnitIdentity', $this->deploymentUnitIdentity, true);
        Model::validateRequired('deploymentUnitInstanceIdentity', $this->deploymentUnitInstanceIdentity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->resourcePoolName) {
            $res['resource_pool_name'] = $this->resourcePoolName;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }
        if (null !== $this->deploymentUnitInstanceIdentity) {
            $res['deployment_unit_instance_identity'] = $this->deploymentUnitInstanceIdentity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResourceInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['resource_pool_name'])) {
            $model->resourcePoolName = $map['resource_pool_name'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }
        if (isset($map['deployment_unit_instance_identity'])) {
            $model->deploymentUnitInstanceIdentity = $map['deployment_unit_instance_identity'];
        }

        return $model;
    }
}
