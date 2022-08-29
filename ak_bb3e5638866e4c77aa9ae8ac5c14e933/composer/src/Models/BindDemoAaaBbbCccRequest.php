<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bb3e5638866e4c77aa9ae8ac5c14e933\Models;

use AlibabaCloud\Tea\Model;

class BindDemoAaaBbbCccRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindDemoAaaBbbCccRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }

        return $model;
    }
}
