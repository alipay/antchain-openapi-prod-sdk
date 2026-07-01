<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclRefundRequest extends Model
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

    // 退款接口返回的退款id
    /**
     * @var string
     */
    public $refundId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'refundId'          => 'refund_id',
    ];

    public function validate()
    {
        Model::validateRequired('refundId', $this->refundId, true);
        Model::validateMaxLength('refundId', $this->refundId, 64);
        Model::validateMinLength('refundId', $this->refundId, 16);
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
        if (null !== $this->refundId) {
            $res['refund_id'] = $this->refundId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclRefundRequest
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
        if (isset($map['refund_id'])) {
            $model->refundId = $map['refund_id'];
        }

        return $model;
    }
}
