<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VpcVO extends Model
{
    // VPC的状态，取值： Pending：配置中。 Available：可用。
    /**
     * @example Available
     *
     * @var string
     */
    public $status;

    // VPC的IPv4网段
    /**
     * @example 10.0.0.0/24
     *
     * @var string
     */
    public $cidrBlock;

    // VPC路由器的ID
    /**
     * @example vrt-bp1jcg5cmxjbl9xgc****
     *
     * @var string
     */
    public $vRouterIaasId;

    // workspace id
    /**
     * @example 123456425
     *
     * @var string
     */
    public $workspaceId;

    // vpc name
    /**
     * @example vpcName
     *
     * @var string
     */
    public $name;

    // 描述信息
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 计费类型
    /**
     * @example 按年
     *
     * @var string
     */
    public $instanceChargeType;

    // vpc iaas id
    /**
     * @example vpc-bp1qpo0kug3a20qqe****
     *
     * @var string
     */
    public $iaasId;

    // provider id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $providerId;

    // iaas 底座类型
    /**
     * @example Aliyun
     *
     * @var string
     */
    public $iaasType;

    // region id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $regionId;

    // zone id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $zoneId;

    // vpc id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $id;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // 最近一次修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'status'             => 'status',
        'cidrBlock'          => 'cidr_block',
        'vRouterIaasId'      => 'v_router_iaas_id',
        'workspaceId'        => 'workspace_id',
        'name'               => 'name',
        'description'        => 'description',
        'instanceChargeType' => 'instance_charge_type',
        'iaasId'             => 'iaas_id',
        'providerId'         => 'provider_id',
        'iaasType'           => 'iaas_type',
        'regionId'           => 'region_id',
        'zoneId'             => 'zone_id',
        'id'                 => 'id',
        'utcCreate'          => 'utc_create',
        'utcModified'        => 'utc_modified',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->cidrBlock) {
            $res['cidr_block'] = $this->cidrBlock;
        }
        if (null !== $this->vRouterIaasId) {
            $res['v_router_iaas_id'] = $this->vRouterIaasId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->instanceChargeType) {
            $res['instance_charge_type'] = $this->instanceChargeType;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VpcVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }
        if (isset($map['v_router_iaas_id'])) {
            $model->vRouterIaasId = $map['v_router_iaas_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['instance_charge_type'])) {
            $model->instanceChargeType = $map['instance_charge_type'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
