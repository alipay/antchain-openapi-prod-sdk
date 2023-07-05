<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class BindGatewayAbcTestRequest extends Model
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

    // 123
    /**
     * @var DemoClass[]
     */
    public $testParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'testParam'         => 'test_param',
    ];

    public function validate()
    {
        Model::validateRequired('testParam', $this->testParam, true);
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
        if (null !== $this->testParam) {
            $res['test_param'] = [];
            if (null !== $this->testParam && \is_array($this->testParam)) {
                $n = 0;
                foreach ($this->testParam as $item) {
                    $res['test_param'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindGatewayAbcTestRequest
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
        if (isset($map['test_param'])) {
            if (!empty($map['test_param'])) {
                $model->testParam = [];
                $n                = 0;
                foreach ($map['test_param'] as $item) {
                    $model->testParam[$n++] = null !== $item ? DemoClass::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
