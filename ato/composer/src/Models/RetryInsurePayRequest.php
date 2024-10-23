<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RetryInsurePayRequest extends Model
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

    // 商户的订单号，后续用作和保单结果交互
    /**
     * @var string
     */
    public $orderId;

    // 保险公司产品（险种）类型
    /**
     * @var string
     */
    public $insureProductType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'insureProductType' => 'insure_product_type',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('insureProductType', $this->insureProductType, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('insureProductType', $this->insureProductType, 64);
        Model::validateMinLength('orderId', $this->orderId, 0);
        Model::validateMinLength('insureProductType', $this->insureProductType, 0);
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
        if (null !== $this->insureProductType) {
            $res['insure_product_type'] = $this->insureProductType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RetryInsurePayRequest
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
        if (isset($map['insure_product_type'])) {
            $model->insureProductType = $map['insure_product_type'];
        }

        return $model;
    }
}
