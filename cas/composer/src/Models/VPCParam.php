<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VPCParam extends Model
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

    // region id
    /**
     * @example region id
     *
     * @var string
     */
    public $regionId;

    // vpc_name
    /**
     * @example vpc_name
     *
     * @var string
     */
    public $vpcName;
    protected $_name = [
        'cidrBlock'   => 'cidr_block',
        'description' => 'description',
        'regionId'    => 'region_id',
        'vpcName'     => 'vpc_name',
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
        if (null !== $this->vpcName) {
            $res['vpc_name'] = $this->vpcName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VPCParam
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
        if (isset($map['vpc_name'])) {
            $model->vpcName = $map['vpc_name'];
        }

        return $model;
    }
}
