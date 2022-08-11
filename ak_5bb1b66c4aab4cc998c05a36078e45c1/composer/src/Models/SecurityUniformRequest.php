<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class SecurityUniformRequest extends Model
{
    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $token;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $bizId;

    // 132
    /**
     * @example 123
     *
     * @var string
     */
    public $params;
    protected $_name = [
        'token'  => 'token',
        'bizId'  => 'biz_id',
        'params' => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('params', $this->params, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityUniformRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }

        return $model;
    }
}
