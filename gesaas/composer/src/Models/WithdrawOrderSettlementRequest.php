<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class WithdrawOrderSettlementRequest extends Model
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

    // 退款金额，单位：分
    /**
     * @var int
     */
    public $refundAmount;

    // 支付交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
    /**
     * @var string
     */
    public $refundReason;

    // 【描述】退款请求号。 标识一次退款请求，需要保证在交易号下唯一，如需部分退款，则此参数必传。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。会保证同样的退款请求号多次请求只会退一次。
    // 【必选条件】部分退款时必选
    /**
     * @var string
     */
    public $outRequestNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'refundAmount'      => 'refund_amount',
        'tradeNo'           => 'trade_no',
        'refundReason'      => 'refund_reason',
        'outRequestNo'      => 'out_request_no',
    ];

    public function validate()
    {
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
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
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->refundReason) {
            $res['refund_reason'] = $this->refundReason;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WithdrawOrderSettlementRequest
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
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['refund_reason'])) {
            $model->refundReason = $map['refund_reason'];
        }
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }

        return $model;
    }
}
