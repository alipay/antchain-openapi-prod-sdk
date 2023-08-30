<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryCjtestCjResRequest extends Model
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
     * @var int
     */
    public $test1;

    // 2
    /**
     * @var int
     */
    public $test2;

    // test
    /**
     * @var int[]
     */
    public $test3;

    // testclass
    /**
     * @var Host
     */
    public $testclass;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'test1'             => 'test1',
        'test2'             => 'test2',
        'test3'             => 'test3',
        'testclass'         => 'testclass',
    ];

    public function validate()
    {
        Model::validateRequired('test1', $this->test1, true);
        Model::validateRequired('test2', $this->test2, true);
        Model::validateRequired('test3', $this->test3, true);
        Model::validateRequired('testclass', $this->testclass, true);
        Model::validateMaximum('test1', $this->test1, 100);
        Model::validateMaximum('test2', $this->test2, 200);
        Model::validateMinimum('test1', $this->test1, 1);
        Model::validateMinimum('test2', $this->test2, 100);
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
            $res['test1'] = $this->test1;
        }
        if (null !== $this->test2) {
            $res['test2'] = $this->test2;
        }
        if (null !== $this->test3) {
            $res['test3'] = $this->test3;
        }
        if (null !== $this->testclass) {
            $res['testclass'] = null !== $this->testclass ? $this->testclass->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCjtestCjResRequest
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
        if (isset($map['test1'])) {
            $model->test1 = $map['test1'];
        }
        if (isset($map['test2'])) {
            $model->test2 = $map['test2'];
        }
        if (isset($map['test3'])) {
            if (!empty($map['test3'])) {
                $model->test3 = $map['test3'];
            }
        }
        if (isset($map['testclass'])) {
            $model->testclass = Host::fromMap($map['testclass']);
        }

        return $model;
    }
}
