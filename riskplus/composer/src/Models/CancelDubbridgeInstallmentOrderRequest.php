<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CancelDubbridgeInstallmentOrderRequest extends Model
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

    // 订单号：request请求单号，每次请求唯一，如uuid
    /**
     * @var string
     */
    public $orderNo;

    // 待支付的购物订单编号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 渠道方唯一标识
    /**
     * @var string
     */
    public $openId;

    // 天枢客户号
    /**
     * @var string
     */
    public $customerNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'bizOrderNo'        => 'biz_order_no',
        'openId'            => 'open_id',
        'customerNo'        => 'customer_no',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelDubbridgeInstallmentOrderRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }

        return $model;
    }
}
