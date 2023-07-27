<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class CreateOauthServiceaccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 三方授权凭证
    /**
     * @var string
     */
    public $accessToken;

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
        'accessToken' => 'access_token',
        'description' => 'description',
        'alias'       => 'alias',
    ];

    public function validate()
    {
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('alias', $this->alias, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
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
     * @return CreateOauthServiceaccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
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
