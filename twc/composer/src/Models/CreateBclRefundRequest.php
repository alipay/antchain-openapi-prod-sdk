<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateBclRefundRequest extends Model
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

    // 例如：PROD202312312321301
    /**
     * @var string
     */
    public $orderId;

    // 代扣成功的期数, 1,5,7,12
    /**
     * @var int
     */
    public $termNo;

    // 退款金额: 单位分, 最小值1, 最大值不能超过当前代扣的总金额, 如果多次退款,本次退款金额加已退款成功的金额不大于当前代扣总金额
    /**
     * @var int
     */
    public $refundAmount;

    // 幂等号，用来保证请求幂等性.
    // 注意：
    // ● clientToken只支持ASCII字符，且不能超过64个字符；
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'termNo'            => 'term_no',
        'refundAmount'      => 'refund_amount',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('termNo', $this->termNo, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateMaxLength('orderId', $this->orderId, 32);
        Model::validateMaxLength('clientToken', $this->clientToken, 64);
        Model::validateMinLength('orderId', $this->orderId, 16);
        Model::validateMinLength('clientToken', $this->clientToken, 16);
        Model::validateMaximum('termNo', $this->termNo, 120);
        Model::validateMinimum('termNo', $this->termNo, 1);
        Model::validateMinimum('refundAmount', $this->refundAmount, 1);
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
        if (null !== $this->termNo) {
            $res['term_no'] = $this->termNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBclRefundRequest
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
        if (isset($map['term_no'])) {
            $model->termNo = $map['term_no'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
