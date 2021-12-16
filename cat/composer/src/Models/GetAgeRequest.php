<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAT\Models;

use AlibabaCloud\Tea\Model;

class GetAgeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 猫猫的id
    /**
     * @var string
     */
    public $id;
    protected $_name = [
        'authToken' => 'auth_token',
        'id'        => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAgeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
