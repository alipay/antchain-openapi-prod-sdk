<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class PaymentCreateResult extends Model
{
    //
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

    // 收款方外部业务平台会员ID，收单场景表示卖家，纯资金场景表示收款方
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

    // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
    /**
     * @example PAYING
     *
     * @var string
     */
    public $orderState;

    // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
    /**
     * @example SALE
     *
     * @var string
     */
    public $fundMode;

    // 收款方账号
    /**
     * @example
     *
     * @var AccountDTO
     */
    public $payeeAccount;

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
        'platformMemberId' => 'platform_member_id',
        'outPayerId'       => 'out_payer_id',
        'outPayeeId'       => 'out_payee_id',
        'outOrderId'       => 'out_order_id',
        'orderState'       => 'order_state',
        'fundMode'         => 'fund_mode',
        'payeeAccount'     => 'payee_account',
        'subCode'          => 'sub_code',
        'subMsg'           => 'sub_msg',
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
        if (null !== $this->orderState) {
            $res['order_state'] = $this->orderState;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->payeeAccount) {
            $res['payee_account'] = null !== $this->payeeAccount ? $this->payeeAccount->toMap() : null;
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
     * @return PaymentCreateResult
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
        if (isset($map['order_state'])) {
            $model->orderState = $map['order_state'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['payee_account'])) {
            $model->payeeAccount = AccountDTO::fromMap($map['payee_account']);
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
