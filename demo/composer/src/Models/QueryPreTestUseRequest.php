<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryPreTestUseRequest extends Model
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

    // 2
    /**
     * @var PreTestUse
     */
    public $struct1;

    // 1
    /**
     * @var string
     */
    public $param1;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'struct1'           => 'struct_1',
        'param1'            => 'param_1',
    ];

    public function validate()
    {
        Model::validateRequired('struct1', $this->struct1, true);
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
        if (null !== $this->struct1) {
            $res['struct_1'] = null !== $this->struct1 ? $this->struct1->toMap() : null;
        }
        if (null !== $this->param1) {
            $res['param_1'] = $this->param1;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPreTestUseRequest
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
        if (isset($map['struct_1'])) {
            $model->struct1 = PreTestUse::fromMap($map['struct_1']);
        }
        if (isset($map['param_1'])) {
            $model->param1 = $map['param_1'];
        }

        return $model;
    }
}
