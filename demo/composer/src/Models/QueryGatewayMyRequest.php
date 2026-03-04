<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryGatewayMyRequest extends Model
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

    // 字符串类型入参
    /**
     * @var string
     */
    public $test1;

    // 数字入参
    /**
     * @var int
     */
    public $test2;

    // 布尔值入参
    /**
     * @var bool
     */
    public $test3;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'test1'             => 'test_1',
        'test2'             => 'test_2',
        'test3'             => 'test_3',
    ];

    public function validate()
    {
        Model::validateRequired('test1', $this->test1, true);
        Model::validateRequired('test2', $this->test2, true);
        Model::validateRequired('test3', $this->test3, true);
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
        if (null !== $this->test1) {
            $res['test_1'] = $this->test1;
        }
        if (null !== $this->test2) {
            $res['test_2'] = $this->test2;
        }
        if (null !== $this->test3) {
            $res['test_3'] = $this->test3;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGatewayMyRequest
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
        if (isset($map['test_1'])) {
            $model->test1 = $map['test_1'];
        }
        if (isset($map['test_2'])) {
            $model->test2 = $map['test_2'];
        }
        if (isset($map['test_3'])) {
            $model->test3 = $map['test_3'];
        }

        return $model;
    }
}
