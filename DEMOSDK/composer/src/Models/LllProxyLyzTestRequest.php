<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class LllProxyLyzTestRequest extends Model
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

    // 测试
    /**
     * @var InitPack
     */
    public $paramA;

    // aa
    /**
     * @var ResultTest
     */
    public $paramC;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'paramA'            => 'param_a',
        'paramC'            => 'param_c',
    ];

    public function validate()
    {
        Model::validateRequired('paramA', $this->paramA, true);
        Model::validateRequired('paramC', $this->paramC, true);
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
        if (null !== $this->paramA) {
            $res['param_a'] = null !== $this->paramA ? $this->paramA->toMap() : null;
        }
        if (null !== $this->paramC) {
            $res['param_c'] = null !== $this->paramC ? $this->paramC->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LllProxyLyzTestRequest
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
        if (isset($map['param_a'])) {
            $model->paramA = InitPack::fromMap($map['param_a']);
        }
        if (isset($map['param_c'])) {
            $model->paramC = ResultTest::fromMap($map['param_c']);
        }

        return $model;
    }
}
