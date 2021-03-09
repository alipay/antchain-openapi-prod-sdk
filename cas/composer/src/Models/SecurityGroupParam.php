<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SecurityGroupParam extends Model
{
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

    // security_group_name
    /**
     * @example security_group_name
     *
     * @var string
     */
    public $securityGroupName;

    // vpc_id
    /**
     * @example vpc_id
     *
     * @var string
     */
    public $vpcId;
    protected $_name = [
        'description'       => 'description',
        'regionId'          => 'region_id',
        'securityGroupName' => 'security_group_name',
        'vpcId'             => 'vpc_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->securityGroupName) {
            $res['security_group_name'] = $this->securityGroupName;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityGroupParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['security_group_name'])) {
            $model->securityGroupName = $map['security_group_name'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }

        return $model;
    }
}
