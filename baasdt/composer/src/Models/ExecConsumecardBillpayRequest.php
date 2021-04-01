<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecConsumecardBillpayRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 账单ID
    /**
     * @var string
     */
    public $orderId;

    // 需要支付的金额(单位:元,精确到分)
    /**
     * @var string
     */
    public $payPrice;

    // 附言(不要超过500个字符)
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'orderId'           => 'order_id',
        'payPrice'          => 'pay_price',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('payPrice', $this->payPrice, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->payPrice) {
            $res['pay_price'] = $this->payPrice;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecConsumecardBillpayRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['pay_price'])) {
            $model->payPrice = $map['pay_price'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
