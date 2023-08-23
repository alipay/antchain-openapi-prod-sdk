<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryApprovalTestRequest extends Model
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

    // 字符串
    /**
     * @var string
     */
    public $input;

    // name
    /**
     * @var string
     */
    public $name;

    // age
    /**
     * @var string
     */
    public $age;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'input'             => 'input',
        'name'              => 'name',
        'age'               => 'age',
    ];

    public function validate()
    {
        Model::validateRequired('input', $this->input, true);
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
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApprovalTestRequest
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
        if (isset($map['input'])) {
            $model->input = $map['input'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }

        return $model;
    }
}
