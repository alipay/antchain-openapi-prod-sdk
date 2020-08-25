<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ListTwcNotaryLeaseNotaryRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'merchantOrderNo' => 'merchant_order_no',
        'orderNo' => 'order_no',
        'paymentChannel' => 'payment_channel',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->paymentChannel) {
            $res['payment_channel'] = $this->paymentChannel;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListTwcNotaryLeaseNotaryRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['merchant_order_no'])){
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['payment_channel'])){
            $model->paymentChannel = $map['payment_channel'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 商户订单号，需要同twc.notary.lease.order.create接口的传参一致
    /**
     * @var string
     */
    public $merchantOrderNo;

    // 接口订单号，需要同twc.notary.lease.order.create接口的传参一致
    /**
     * @var string
     */
    public $orderNo;

    // 支付渠道，默认支持Alipay|ThirdParty|CreditCard|BankTransfer|WeChatPay|Other，需要同twc.notary.lease.order.create接口的传参一致
    /**
     * @var string
     */
    public $paymentChannel;

}
