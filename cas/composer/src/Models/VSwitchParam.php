<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VSwitchParam extends Model
{
    // cidr_block
    /**
     * @example cidr_block
     *
     * @var string
     */
    public $cidrBlock;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // region_id
    /**
     * @example region_id
     *
     * @var string
     */
    public $regionId;

    // vpc_id
    /**
     * @example vpc_id
     *
     * @var string
     */
    public $vpcId;

    // vswitch_name
    /**
     * @example vswitch_name
     *
     * @var string
     */
    public $vswitchName;

    // zone_id
    /**
     * @example zone_id
     *
     * @var string
     */
    public $zoneId;
    protected $_name = [
        'cidrBlock'   => 'cidr_block',
        'description' => 'description',
        'regionId'    => 'region_id',
        'vpcId'       => 'vpc_id',
        'vswitchName' => 'vswitch_name',
        'zoneId'      => 'zone_id',
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
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vswitchName) {
            $res['vswitch_name'] = $this->vswitchName;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VSwitchParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['vswitch_name'])) {
            $model->vswitchName = $map['vswitch_name'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }

        return $model;
    }
}
