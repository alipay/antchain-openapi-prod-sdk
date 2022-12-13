<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class PaymentCancelResult extends Model
{
    // 外部业务平台原始交易号
    /**
     * @example 20200801000000001
     *
     * @var string
     */
    public $outOrderId;

    // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
    //
    /**
     * @example SALE
     *
     * @var string
     */
    public $fundMode;

    // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $orderState;

    // 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
    /**
     * @example 100.00
     *
     * @var int
     */
    public $availableAmount;

    // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
    /**
     * @example CNY
     *
     * @var string
     */
    public $availableCurrency;

    // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
    /**
     * @example PROCESSING
     *
     * @var string
     */
    public $state;

    // 外部请求ID，需要支持部分请款/退款的平台必填
    //
    /**
     * @example 20102000000
     *
     * @var string
     */
    public $outRequestId;

    // 业务错误码(为空表示成功，否则为业务错误码)
    /**
     * @example PARAM_MISSING
     *
     * @var string
     */
    public $subCode;

    // 业务错误描述
    /**
     * @example 参数不全
     *
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'outOrderId'        => 'out_order_id',
        'fundMode'          => 'fund_mode',
        'orderState'        => 'order_state',
        'availableAmount'   => 'available_amount',
        'availableCurrency' => 'available_currency',
        'state'             => 'state',
        'outRequestId'      => 'out_request_id',
        'subCode'           => 'sub_code',
        'subMsg'            => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('outOrderId', $this->outOrderId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outOrderId) {
            $res['out_order_id'] = $this->outOrderId;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->orderState) {
            $res['order_state'] = $this->orderState;
        }
        if (null !== $this->availableAmount) {
            $res['available_amount'] = $this->availableAmount;
        }
        if (null !== $this->availableCurrency) {
            $res['available_currency'] = $this->availableCurrency;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->outRequestId) {
            $res['out_request_id'] = $this->outRequestId;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaymentCancelResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_order_id'])) {
            $model->outOrderId = $map['out_order_id'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['order_state'])) {
            $model->orderState = $map['order_state'];
        }
        if (isset($map['available_amount'])) {
            $model->availableAmount = $map['available_amount'];
        }
        if (isset($map['available_currency'])) {
            $model->availableCurrency = $map['available_currency'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['out_request_id'])) {
            $model->outRequestId = $map['out_request_id'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}
