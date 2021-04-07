<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteVpcVswitchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // vpc id
    /**
     * @var string
     */
    public $vpcSequence;

    // vswitch 的 iaasIds
    /**
     * @var string[]
     */
    public $vswitchIds;
    protected $_name = [
        'authToken'   => 'auth_token',
        'vpcSequence' => 'vpc_sequence',
        'vswitchIds'  => 'vswitch_ids',
    ];

    public function validate()
    {
        Model::validateRequired('vpcSequence', $this->vpcSequence, true);
        Model::validateRequired('vswitchIds', $this->vswitchIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->vpcSequence) {
            $res['vpc_sequence'] = $this->vpcSequence;
        }
        if (null !== $this->vswitchIds) {
            $res['vswitch_ids'] = $this->vswitchIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteVpcVswitchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['vpc_sequence'])) {
            $model->vpcSequence = $map['vpc_sequence'];
        }
        if (isset($map['vswitch_ids'])) {
            if (!empty($map['vswitch_ids'])) {
                $model->vswitchIds = $map['vswitch_ids'];
            }
        }

        return $model;
    }
}
