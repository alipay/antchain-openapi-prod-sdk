<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class VerifyOauthTokenRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // token值
    /**
     * @var string
     */
    public $accessToken;

    // 是否刷新access_token有限期
    /**
     * @var bool
     */
    public $extend;

    // token应用场景，LOGIN或AUTH
    /**
     * @var string
     */
    public $scene;
    protected $_name = [
        'authToken'   => 'auth_token',
        'accessToken' => 'access_token',
        'extend'      => 'extend',
        'scene'       => 'scene',
    ];

    public function validate()
    {
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('scene', $this->scene, true);
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
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyOauthTokenRequest
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
        if (isset($map['extend'])) {
            $model->extend = $map['extend'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }

        return $model;
    }
}
