<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ReinitComputerPasswordRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // computer_sequence
    /**
     * @var string
     */
    public $computerSequence;

    // 密码
    /**
     * @var string
     */
    public $password;
    protected $_name = [
        'authToken'        => 'auth_token',
        'computerSequence' => 'computer_sequence',
        'password'         => 'password',
    ];

    public function validate()
    {
        Model::validateRequired('computerSequence', $this->computerSequence, true);
        Model::validateRequired('password', $this->password, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->computerSequence) {
            $res['computer_sequence'] = $this->computerSequence;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReinitComputerPasswordRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['computer_sequence'])) {
            $model->computerSequence = $map['computer_sequence'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }

        return $model;
    }
}
