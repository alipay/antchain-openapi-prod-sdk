<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class SubmitEcarLcaorderwithcustomerRequest extends Model
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

    // 客户信息
    /**
     * @var PlatformCustomerSummary
     */
    public $customer;

    // 产品信息
    /**
     * @var EnterpriseProductSummary
     */
    public $product;

    // 订单时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $orderTime;

    // 订单金额，订单金额只能为有效数字（整数不得大于10位，小数不得大于6位）
    /**
     * @var string
     */
    public $orderAmount;

    // 来源于三方平台的订单编号
    /**
     * @var string
     */
    public $sourceOrderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customer'          => 'customer',
        'product'           => 'product',
        'orderTime'         => 'order_time',
        'orderAmount'       => 'order_amount',
        'sourceOrderNo'     => 'source_order_no',
    ];

    public function validate()
    {
        Model::validateRequired('customer', $this->customer, true);
        Model::validateRequired('product', $this->product, true);
        Model::validateRequired('orderTime', $this->orderTime, true);
        Model::validateRequired('orderAmount', $this->orderAmount, true);
        Model::validateRequired('sourceOrderNo', $this->sourceOrderNo, true);
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
        if (null !== $this->customer) {
            $res['customer'] = null !== $this->customer ? $this->customer->toMap() : null;
        }
        if (null !== $this->product) {
            $res['product'] = null !== $this->product ? $this->product->toMap() : null;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }
        if (null !== $this->orderAmount) {
            $res['order_amount'] = $this->orderAmount;
        }
        if (null !== $this->sourceOrderNo) {
            $res['source_order_no'] = $this->sourceOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitEcarLcaorderwithcustomerRequest
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
        if (isset($map['customer'])) {
            $model->customer = PlatformCustomerSummary::fromMap($map['customer']);
        }
        if (isset($map['product'])) {
            $model->product = EnterpriseProductSummary::fromMap($map['product']);
        }
        if (isset($map['order_time'])) {
            $model->orderTime = $map['order_time'];
        }
        if (isset($map['order_amount'])) {
            $model->orderAmount = $map['order_amount'];
        }
        if (isset($map['source_order_no'])) {
            $model->sourceOrderNo = $map['source_order_no'];
        }

        return $model;
    }
}
