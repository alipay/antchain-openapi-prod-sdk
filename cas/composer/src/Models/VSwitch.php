<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VSwitch extends Model
{
    // 交换机的IPv4网段
    /**
     * @example 172.16.0.0/24
     *
     * @var string
     */
    public $cidrBlock;

    // 交换机的创建时间
    /**
     * @example 2018-01-18T12:43:57Z
     *
     * @var string
     */
    public $creationTime;

    // 交换机的描述信息
    /**
     * @example VSwitchDescription
     *
     * @var string
     */
    public $description;

    // cn-hangzhou
    /**
     * @example cn-hangzhou
     *
     * @var string
     */
    public $regionId;

    // 交换机的状态，取值：
    //
    // Pending：配置中。
    // Available：可用。
    /**
     * @example Available
     *
     * @var string
     */
    public $status;

    // 交换机所属VPC的ID
    /**
     * @example vpc-257gcdcdq64****
     *
     * @var string
     */
    public $vpcId;

    // 交换机的ID
    /**
     * @example vsw-25bcdxs7pv1****
     *
     * @var string
     */
    public $vSwitchId;

    // 交换机的名称
    /**
     * @example VSwitch-1
     *
     * @var string
     */
    public $vSwitchName;

    // 交换机所属的可用区
    /**
     * @example cn-hangzhou-d
     *
     * @var string
     */
    public $zoneId;

    // zone iaas id
    /**
     * @example hangzhou-a
     *
     * @var string
     */
    public $zoneIaasId;
    protected $_name = [
        'cidrBlock'    => 'cidr_block',
        'creationTime' => 'creation_time',
        'description'  => 'description',
        'regionId'     => 'region_id',
        'status'       => 'status',
        'vpcId'        => 'vpc_id',
        'vSwitchId'    => 'v_switch_id',
        'vSwitchName'  => 'v_switch_name',
        'zoneId'       => 'zone_id',
        'zoneIaasId'   => 'zone_iaas_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cidrBlock) {
            $res['cidr_block'] = $this->cidrBlock;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vSwitchId) {
            $res['v_switch_id'] = $this->vSwitchId;
        }
        if (null !== $this->vSwitchName) {
            $res['v_switch_name'] = $this->vSwitchName;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->zoneIaasId) {
            $res['zone_iaas_id'] = $this->zoneIaasId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VSwitch
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['v_switch_id'])) {
            $model->vSwitchId = $map['v_switch_id'];
        }
        if (isset($map['v_switch_name'])) {
            $model->vSwitchName = $map['v_switch_name'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['zone_iaas_id'])) {
            $model->zoneIaasId = $map['zone_iaas_id'];
        }

        return $model;
    }
}
