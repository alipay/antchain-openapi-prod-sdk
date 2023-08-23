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

    // 日期类型入参
    /**
     * @var string
     */
    public $test4;

    // 数组类型入参（数组内元素为结构体类型）
    /**
     * @var NumberTest[]
     */
    public $test5;

    // 结构体入参
    /**
     * @var NumberTest
     */
    public $test6;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'test1'             => 'test_1',
        'test2'             => 'test_2',
        'test3'             => 'test_3',
        'test4'             => 'test_4',
        'test5'             => 'test_5',
        'test6'             => 'test_6',
    ];

    public function validate()
    {
        Model::validateRequired('test1', $this->test1, true);
        Model::validateRequired('test2', $this->test2, true);
        Model::validateRequired('test3', $this->test3, true);
        Model::validateRequired('test4', $this->test4, true);
        Model::validateRequired('test5', $this->test5, true);
        Model::validateRequired('test6', $this->test6, true);
        Model::validatePattern('test4', $this->test4, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->test4) {
            $res['test_4'] = $this->test4;
        }
        if (null !== $this->test5) {
            $res['test_5'] = [];
            if (null !== $this->test5 && \is_array($this->test5)) {
                $n = 0;
                foreach ($this->test5 as $item) {
                    $res['test_5'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->test6) {
            $res['test_6'] = null !== $this->test6 ? $this->test6->toMap() : null;
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
        if (isset($map['test_4'])) {
            $model->test4 = $map['test_4'];
        }
        if (isset($map['test_5'])) {
            if (!empty($map['test_5'])) {
                $model->test5 = [];
                $n            = 0;
                foreach ($map['test_5'] as $item) {
                    $model->test5[$n++] = null !== $item ? NumberTest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['test_6'])) {
            $model->test6 = NumberTest::fromMap($map['test_6']);
        }

        return $model;
    }
}
