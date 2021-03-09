<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteResourceVswitchRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 要删除的交换机的地域identity
    /**
     * @var string
     */
    public $region;

    // 要删除的交换机所处专有网络的ID
    /**
     * @var string
     */
    public $vpcId;

    // 要删除的交换机的ID
    /**
     * @var string
     */
    public $vSwitchId;
    protected $_name = [
        'authToken' => 'auth_token',
        'region'    => 'region',
        'vpcId'     => 'vpc_id',
        'vSwitchId' => 'v_switch_id',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('vSwitchId', $this->vSwitchId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vSwitchId) {
            $res['v_switch_id'] = $this->vSwitchId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteResourceVswitchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['v_switch_id'])) {
            $model->vSwitchId = $map['v_switch_id'];
        }

        return $model;
    }
}
