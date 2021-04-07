<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateVpcVswitchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 修改会的 vswitch 名称
    /**
     * @var string
     */
    public $name;

    // vswitch id
    /**
     * @var string
     */
    public $vswitchId;

    // vpc paas id
    /**
     * @var string
     */
    public $vpcSequence;

    // 描述
    /**
     * @var string
     */
    public $description;
    protected $_name = [
        'authToken'   => 'auth_token',
        'name'        => 'name',
        'vswitchId'   => 'vswitch_id',
        'vpcSequence' => 'vpc_sequence',
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('vswitchId', $this->vswitchId, true);
        Model::validateRequired('vpcSequence', $this->vpcSequence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->vswitchId) {
            $res['vswitch_id'] = $this->vswitchId;
        }
        if (null !== $this->vpcSequence) {
            $res['vpc_sequence'] = $this->vpcSequence;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateVpcVswitchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['vswitch_id'])) {
            $model->vswitchId = $map['vswitch_id'];
        }
        if (isset($map['vpc_sequence'])) {
            $model->vpcSequence = $map['vpc_sequence'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
