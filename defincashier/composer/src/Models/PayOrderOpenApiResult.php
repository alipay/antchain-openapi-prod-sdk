<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEFINCASHIER\Models;

use AlibabaCloud\Tea\Model;

class PayOrderOpenApiResult extends Model
{
    // 会员所属业务平台在智能科技的会员ID
    /**
     * @example 268800000000001
     *
     * @var string
     */
    public $platformMemberId;

    // 外部订单号
    /**
     * @example 1
     *
     * @var string
     */
    public $outOrderId;

    // 资金模式
    /**
     * @example SALE
     *
     * @var string
     */
    public $fundMode;

    // 支付提交状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $state;

    // 交易单状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $orderState;

    // 收款账户
    /**
     * @example
     *
     * @var AccountDTO
     */
    public $payeeAccount;

    // 银行或其他支付服务提供方支付结果描述
    /**
     * @example 1
     *
     * @var string
     */
    public $paymentErrorMessage;

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

    // 蚂蚁交易单ID
    /**
     * @example 20200801000000001
     *
     * @var string
     */
    public $tradeId;

    // 授权URL
    /**
     * @example https://epay.test.bankcomm.cn/uat/pppu/index.html#/QRcode?operationType=2&token=ijTBsf9JI6YzA3XOQDpCZxu6PKbC3ZX2HpS
     *
     * @var string
     */
    public $authPayUrl;
    protected $_name = [
        'platformMemberId'    => 'platform_member_id',
        'outOrderId'          => 'out_order_id',
        'fundMode'            => 'fund_mode',
        'state'               => 'state',
        'orderState'          => 'order_state',
        'payeeAccount'        => 'payee_account',
        'paymentErrorMessage' => 'payment_error_message',
        'subCode'             => 'sub_code',
        'subMsg'              => 'sub_msg',
        'tradeId'             => 'trade_id',
        'authPayUrl'          => 'auth_pay_url',
    ];

    public function validate()
    {
        Model::validateRequired('platformMemberId', $this->platformMemberId, true);
        Model::validateRequired('outOrderId', $this->outOrderId, true);
        Model::validateRequired('fundMode', $this->fundMode, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('orderState', $this->orderState, true);
        Model::validateRequired('payeeAccount', $this->payeeAccount, true);
        Model::validateRequired('paymentErrorMessage', $this->paymentErrorMessage, true);
        Model::validateRequired('subCode', $this->subCode, true);
        Model::validateRequired('subMsg', $this->subMsg, true);
        Model::validateRequired('tradeId', $this->tradeId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->platformMemberId) {
            $res['platform_member_id'] = $this->platformMemberId;
        }
        if (null !== $this->outOrderId) {
            $res['out_order_id'] = $this->outOrderId;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->orderState) {
            $res['order_state'] = $this->orderState;
        }
        if (null !== $this->payeeAccount) {
            $res['payee_account'] = null !== $this->payeeAccount ? $this->payeeAccount->toMap() : null;
        }
        if (null !== $this->paymentErrorMessage) {
            $res['payment_error_message'] = $this->paymentErrorMessage;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }
        if (null !== $this->tradeId) {
            $res['trade_id'] = $this->tradeId;
        }
        if (null !== $this->authPayUrl) {
            $res['auth_pay_url'] = $this->authPayUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayOrderOpenApiResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['platform_member_id'])) {
            $model->platformMemberId = $map['platform_member_id'];
        }
        if (isset($map['out_order_id'])) {
            $model->outOrderId = $map['out_order_id'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['order_state'])) {
            $model->orderState = $map['order_state'];
        }
        if (isset($map['payee_account'])) {
            $model->payeeAccount = AccountDTO::fromMap($map['payee_account']);
        }
        if (isset($map['payment_error_message'])) {
            $model->paymentErrorMessage = $map['payment_error_message'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }
        if (isset($map['trade_id'])) {
            $model->tradeId = $map['trade_id'];
        }
        if (isset($map['auth_pay_url'])) {
            $model->authPayUrl = $map['auth_pay_url'];
        }

        return $model;
    }
}
