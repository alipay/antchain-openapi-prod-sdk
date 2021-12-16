<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABCDJB\Models;

use AlibabaCloud\Tea\Model;

class QueryTestTestRequest extends Model
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

    // test
    /**
     * @var string
     */
    public $test;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'test'              => 'test',
    ];

    public function validate()
    {
        Model::validateRequired('test', $this->test, true);
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
        if (null !== $this->test) {
            $res['test'] = $this->test;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTestTestRequest
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
        if (isset($map['test'])) {
            $model->test = $map['test'];
        }

        return $model;
    }
}
