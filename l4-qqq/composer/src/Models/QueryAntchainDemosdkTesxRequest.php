<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QQQ\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainDemosdkTesxRequest extends Model
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

    // 12
    /**
     * @var DemoClass
     */
    public $test;

    // 12
    /**
     * @var TestDemo
     */
    public $testNew;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'test'              => 'test',
        'testNew'           => 'test_new',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->test) {
            $res['test'] = null !== $this->test ? $this->test->toMap() : null;
        }
        if (null !== $this->testNew) {
            $res['test_new'] = null !== $this->testNew ? $this->testNew->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainDemosdkTesxRequest
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
        if (isset($map['test'])) {
            $model->test = DemoClass::fromMap($map['test']);
        }
        if (isset($map['test_new'])) {
            $model->testNew = TestDemo::fromMap($map['test_new']);
        }

        return $model;
    }
}
