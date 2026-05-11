<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\JZQPRODUCTA\Models;

use AlibabaCloud\Tea\Model;

class TestDemoRequest extends Model
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

    // 1
    /**
     * @var string
     */
    public $demo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'demo'              => 'demo',
    ];

    public function validate()
    {
        Model::validateRequired('demo', $this->demo, true);
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
        if (null !== $this->demo) {
            $res['demo'] = $this->demo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestDemoRequest
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
        if (isset($map['demo'])) {
            $model->demo = $map['demo'];
        }

        return $model;
    }
}
