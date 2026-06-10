<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class AaavTestLiuyzRequest extends Model
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

    // demo_param
    /**
     * @var DemoClass
     */
    public $demoParam;

    // aa
    /**
     * @var string
     */
    public $paramA;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'demoParam'         => 'demo_param',
        'paramA'            => 'param_a',
    ];

    public function validate()
    {
        Model::validateRequired('demoParam', $this->demoParam, true);
        Model::validateRequired('paramA', $this->paramA, true);
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
        if (null !== $this->demoParam) {
            $res['demo_param'] = null !== $this->demoParam ? $this->demoParam->toMap() : null;
        }
        if (null !== $this->paramA) {
            $res['param_a'] = $this->paramA;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AaavTestLiuyzRequest
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
        if (isset($map['demo_param'])) {
            $model->demoParam = DemoClass::fromMap($map['demo_param']);
        }
        if (isset($map['param_a'])) {
            $model->paramA = $map['param_a'];
        }

        return $model;
    }
}
