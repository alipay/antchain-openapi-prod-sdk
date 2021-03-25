<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class CreateServiceaccountRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 服务账号描述
    /**
     * @var string
     */
    public $description;

    // 服务账号别名
    /**
     * @var string
     */
    public $alias;
    protected $_name = [
        'authToken'   => 'auth_token',
        'description' => 'description',
        'alias'       => 'alias',
    ];

    public function validate()
    {
        Model::validateRequired('alias', $this->alias, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateServiceaccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }

        return $model;
    }
}
