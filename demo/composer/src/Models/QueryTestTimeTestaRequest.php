<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryTestTimeTestaRequest extends Model
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

    // a
    /**
     * @var string
     */
    public $a;

    // b
    /**
     * @var TestClass
     */
    public $b;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'a'                 => 'a',
        'b'                 => 'b',
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
        if (null !== $this->a) {
            $res['a'] = $this->a;
        }
        if (null !== $this->b) {
            $res['b'] = null !== $this->b ? $this->b->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTestTimeTestaRequest
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
        if (isset($map['a'])) {
            $model->a = $map['a'];
        }
        if (isset($map['b'])) {
            $model->b = TestClass::fromMap($map['b']);
        }

        return $model;
    }
}
