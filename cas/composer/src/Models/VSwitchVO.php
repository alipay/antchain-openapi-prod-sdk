<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VSwitchVO extends Model
{
    // 交换机的iaas ID
    /**
     * @example vsw-25bcdxs7pv1****
     *
     * @var string
     */
    public $iaasId;

    // 交换机名称
    /**
     * @example vswitchName
     *
     * @var string
     */
    public $name;

    // 交换机描述信息
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 交换机的状态，取值： Pending：配置中。 Available：可用。
    /**
     * @example Available
     *
     * @var string
     */
    public $status;

    // vpc id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $vpcId;

    // workspace id
    /**
     * @example 0002321004
     *
     * @var string
     */
    public $workspaceId;

    // zone id
    /**
     * @example 0435324900
     *
     * @var string
     */
    public $zoneId;

    // zone iaas id
    /**
     * @example cn-hangzhou-d
     *
     * @var string
     */
    public $zoneIaasId;

    // region id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $regionId;

    // 换机的IPv4网段
    /**
     * @example 172.16.0.0/24
     *
     * @var string
     */
    public $cidrBlock;

    // 交换机创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // 可用ip数目
    /**
     * @example
     *
     * @var int
     */
    public $availableIpAddressCount;
    protected $_name = [
        'iaasId'                  => 'iaas_id',
        'name'                    => 'name',
        'description'             => 'description',
        'status'                  => 'status',
        'vpcId'                   => 'vpc_id',
        'workspaceId'             => 'workspace_id',
        'zoneId'                  => 'zone_id',
        'zoneIaasId'              => 'zone_iaas_id',
        'regionId'                => 'region_id',
        'cidrBlock'               => 'cidr_block',
        'utcCreate'               => 'utc_create',
        'availableIpAddressCount' => 'available_ip_address_count',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->zoneIaasId) {
            $res['zone_iaas_id'] = $this->zoneIaasId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->cidrBlock) {
            $res['cidr_block'] = $this->cidrBlock;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->availableIpAddressCount) {
            $res['available_ip_address_count'] = $this->availableIpAddressCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VSwitchVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['zone_iaas_id'])) {
            $model->zoneIaasId = $map['zone_iaas_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['available_ip_address_count'])) {
            $model->availableIpAddressCount = $map['available_ip_address_count'];
        }

        return $model;
    }
}
