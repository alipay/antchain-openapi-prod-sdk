<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class ImportTwiceThreeRequest extends Model
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

    // 超时间
    /**
     * @var string
     */
    public $timeout;

    // 结构体A
    /**
     * @var TestParamA
     */
    public $structA;

    // 结构体B
    /**
     * @var TestParamB
     */
    public $structB;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timeout'           => 'timeout',
        'structA'           => 'struct_a',
        'structB'           => 'struct_b',
    ];

    public function validate()
    {
        Model::validateRequired('timeout', $this->timeout, true);
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
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->structA) {
            $res['struct_a'] = null !== $this->structA ? $this->structA->toMap() : null;
        }
        if (null !== $this->structB) {
            $res['struct_b'] = null !== $this->structB ? $this->structB->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportTwiceThreeRequest
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
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['struct_a'])) {
            $model->structA = TestParamA::fromMap($map['struct_a']);
        }
        if (isset($map['struct_b'])) {
            $model->structB = TestParamB::fromMap($map['struct_b']);
        }

        return $model;
    }
}
