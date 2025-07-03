<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class ResetProductRedisRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 要刷新的产品码类型
    /**
     * @var string[]
     */
    public $products;
    protected $_name = [
        'authToken' => 'auth_token',
        'products'  => 'products',
    ];

    public function validate()
    {
        Model::validateRequired('products', $this->products, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->products) {
            $res['products'] = $this->products;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResetProductRedisRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['products'])) {
            if (!empty($map['products'])) {
                $model->products = $map['products'];
            }
        }

        return $model;
    }
}
