<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryTestproductTestobjectTestsubRequest extends Model
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

    // 主键
    /**
     * @var int
     */
    public $id;

    // 名字
    /**
     * @var string
     */
    public $name;

    // 性别
    /**
     * @var string
     */
    public $sex;

    // 年龄
    /**
     * @var int
     */
    public $age;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'name'              => 'name',
        'sex'               => 'sex',
        'age'               => 'age',
    ];

    public function validate()
    {
        Model::validateRequired('sex', $this->sex, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTestproductTestobjectTestsubRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }

        return $model;
    }
}
