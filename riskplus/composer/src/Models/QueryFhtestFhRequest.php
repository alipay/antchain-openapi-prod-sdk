<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryFhtestFhRequest extends Model
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

    // 名称
    /**
     * @var string
     */
    public $name;

    // 年龄
    /**
     * @var int
     */
    public $age;

    // 判断字段
    /**
     * @var bool
     */
    public $judge;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'age'               => 'age',
        'judge'             => 'judge',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('age', $this->age, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }
        if (null !== $this->judge) {
            $res['judge'] = $this->judge;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFhtestFhRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }
        if (isset($map['judge'])) {
            $model->judge = $map['judge'];
        }

        return $model;
    }
}
