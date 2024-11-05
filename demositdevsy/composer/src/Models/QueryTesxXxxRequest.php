<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSITDEVSY\Models;

use AlibabaCloud\Tea\Model;

class QueryTesxXxxRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 性别
    /**
     * @var int
     */
    public $sex;
    protected $_name = [
        'authToken' => 'auth_token',
        'name'      => 'name',
        'sex'       => 'sex',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTesxXxxRequest
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
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }

        return $model;
    }
}
