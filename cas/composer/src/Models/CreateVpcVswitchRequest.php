<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateVpcVswitchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 网段
    /**
     * @var string
     */
    public $cidrBlock;

    // 描述
    /**
     * @var string
     */
    public $description;

    // switch 名称
    /**
     * @var string
     */
    public $name;

    // vpc paas id
    /**
     * @var string
     */
    public $vpcSequence;

    // zone
    /**
     * @var string
     */
    public $zone;
    protected $_name = [
        'authToken'   => 'auth_token',
        'cidrBlock'   => 'cidr_block',
        'description' => 'description',
        'name'        => 'name',
        'vpcSequence' => 'vpc_sequence',
        'zone'        => 'zone',
    ];

    public function validate()
    {
        Model::validateRequired('cidrBlock', $this->cidrBlock, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('vpcSequence', $this->vpcSequence, true);
        Model::validateRequired('zone', $this->zone, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cidrBlock) {
            $res['cidr_block'] = $this->cidrBlock;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->vpcSequence) {
            $res['vpc_sequence'] = $this->vpcSequence;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateVpcVswitchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['vpc_sequence'])) {
            $model->vpcSequence = $map['vpc_sequence'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }

        return $model;
    }
}
