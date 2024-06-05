<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a1f82644937c486c81a62b0e5a6b4fbe\Models;

use AlibabaCloud\Tea\Model;

class OperateDemoShanghaiPreTestRequest extends Model
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

    // 参数1
    /**
     * @var string
     */
    public $param1;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'param1'            => 'param1',
    ];

    public function validate()
    {
        Model::validateRequired('param1', $this->param1, true);
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
        if (null !== $this->param1) {
            $res['param1'] = $this->param1;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateDemoShanghaiPreTestRequest
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
        if (isset($map['param1'])) {
            $model->param1 = $map['param1'];
        }

        return $model;
    }
}
