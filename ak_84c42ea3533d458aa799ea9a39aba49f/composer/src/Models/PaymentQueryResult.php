<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class PaymentQueryResult extends Model
{
    // 会员所属业务平台在智能科技的会员ID
    /**
     * @example 268800000000001
     *
     * @var string
     */
    public $platformMemberId;

    // 付款方在外部业务平台的用户ID
    /**
     * @example 8899900004655511
     *
     * @var string
     */
    public $outPayerId;

    // 收款方在外部业务平台的用户ID；收单场景表示卖家，纯资金场景表示收款方
    /**
     * @example 8899900004655511
     *
     * @var string
     */
    public $outPayeeId;

    // 外部业务平台原始交易号
    /**
     * @example 20200801000000001
     *
     * @var string
     */
    public $outOrderId;

    // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
    /**
     * @example SALE
     *
     * @var string
     */
    public $fundMode;

    // 交易状态。INIT(初始创建);PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);PART_PROCESSING(部分处理中);PART_SUCCESS(部分请款部分退款)
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $orderState;

    // 银行或其他支付服务提供方结果码
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $paymentResultCode;

    // 银行或其他支付服务提供方支付结果描述
    /**
     * @example 成功
     *
     * @var string
     */
    public $paymentResultMessage;

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
        'platformMemberId'     => 'platform_member_id',
        'outPayerId'           => 'out_payer_id',
        'outPayeeId'           => 'out_payee_id',
        'outOrderId'           => 'out_order_id',
        'fundMode'             => 'fund_mode',
        'orderState'           => 'order_state',
        'paymentResultCode'    => 'payment_result_code',
        'paymentResultMessage' => 'payment_result_message',
        'subCode'              => 'sub_code',
        'subMsg'               => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('platformMemberId', $this->platformMemberId, true);
        Model::validateRequired('outPayerId', $this->outPayerId, true);
        Model::validateRequired('outOrderId', $this->outOrderId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->platformMemberId) {
            $res['platform_member_id'] = $this->platformMemberId;
        }
        if (null !== $this->outPayerId) {
            $res['out_payer_id'] = $this->outPayerId;
        }
        if (null !== $this->outPayeeId) {
            $res['out_payee_id'] = $this->outPayeeId;
        }
        if (null !== $this->outOrderId) {
            $res['out_order_id'] = $this->outOrderId;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->orderState) {
            $res['order_state'] = $this->orderState;
        }
        if (null !== $this->paymentResultCode) {
            $res['payment_result_code'] = $this->paymentResultCode;
        }
        if (null !== $this->paymentResultMessage) {
            $res['payment_result_message'] = $this->paymentResultMessage;
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
     * @return PaymentQueryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['platform_member_id'])) {
            $model->platformMemberId = $map['platform_member_id'];
        }
        if (isset($map['out_payer_id'])) {
            $model->outPayerId = $map['out_payer_id'];
        }
        if (isset($map['out_payee_id'])) {
            $model->outPayeeId = $map['out_payee_id'];
        }
        if (isset($map['out_order_id'])) {
            $model->outOrderId = $map['out_order_id'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['order_state'])) {
            $model->orderState = $map['order_state'];
        }
        if (isset($map['payment_result_code'])) {
            $model->paymentResultCode = $map['payment_result_code'];
        }
        if (isset($map['payment_result_message'])) {
            $model->paymentResultMessage = $map['payment_result_message'];
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
