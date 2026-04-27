<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryInstanceidRuleRequest extends Model
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

    // 数字
    /**
     * @var string
     */
    public $count;

    // 姓名
    /**
     * @var string
     */
    public $oprator;

    // 结构体
    /**
     * @var TestA
     */
    public $struct;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'count'             => 'count',
        'oprator'           => 'oprator',
        'struct'            => 'struct',
    ];

    public function validate()
    {
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('oprator', $this->oprator, true);
        Model::validateRequired('struct', $this->struct, true);
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
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->oprator) {
            $res['oprator'] = $this->oprator;
        }
        if (null !== $this->struct) {
            $res['struct'] = null !== $this->struct ? $this->struct->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInstanceidRuleRequest
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
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['oprator'])) {
            $model->oprator = $map['oprator'];
        }
        if (isset($map['struct'])) {
            $model->struct = TestA::fromMap($map['struct']);
        }

        return $model;
    }
}
