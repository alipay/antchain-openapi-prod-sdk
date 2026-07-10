<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryNotaryOrderRequest extends Model
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

    // acrbasis订单ID
    /**
     * @var string
     */
    public $notaryOrderId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'notaryOrderId'     => 'notary_order_id',
    ];

    public function validate()
    {
        Model::validateRequired('notaryOrderId', $this->notaryOrderId, true);
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
        if (null !== $this->notaryOrderId) {
            $res['notary_order_id'] = $this->notaryOrderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNotaryOrderRequest
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
        if (isset($map['notary_order_id'])) {
            $model->notaryOrderId = $map['notary_order_id'];
        }

        return $model;
    }
}
