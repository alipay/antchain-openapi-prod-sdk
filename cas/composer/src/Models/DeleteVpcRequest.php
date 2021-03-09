<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteVpcRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 专有网络序列号
    /**
     * @var string
     */
    public $vpcSequence;
    protected $_name = [
        'authToken'   => 'auth_token',
        'vpcSequence' => 'vpc_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('vpcSequence', $this->vpcSequence, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteVpcRequest
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

        return $model;
    }
}
