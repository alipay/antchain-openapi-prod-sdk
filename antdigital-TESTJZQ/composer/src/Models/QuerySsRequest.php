<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TESTJZQ\Models\DemoClass;
use AntChain\TESTJZQ\Models\TestNew;

class QuerySsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name' => 'name',
        'test' => 'test',
        'testNew' => 'test_new',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->name) {
            $res['name'] = null !== $this->name ? $this->name->toMap() : null;
        }
        if (null !== $this->test) {
            $res['test'] = $this->test;
        }
        if (null !== $this->testNew) {
            $res['test_new'] = null !== $this->testNew ? $this->testNew->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['name'])){
            $model->name = DemoClass::fromMap($map['name']);
        }
        if(isset($map['test'])){
            $model->test = $map['test'];
        }
        if(isset($map['test_new'])){
            $model->testNew = TestNew::fromMap($map['test_new']);
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 测试用
    /**
     * @var DemoClass
     */
    public $name;

    // 1
    /**
     * @var string
     */
    public $test;

    // 12
    /**
     * @var TestNew
     */
    public $testNew;

}
