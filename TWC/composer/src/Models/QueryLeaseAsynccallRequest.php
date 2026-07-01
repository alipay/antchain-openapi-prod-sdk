<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseAsynccallRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 上链时返回的回执id
    /**
     * @var string
     */
    public $bizId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'bizId'             => 'biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('bizId', $this->bizId, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseAsynccallRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }

        return $model;
    }
}
