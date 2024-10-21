<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalkeyPreauthpayRequest extends Model
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

    // 请求流水号，用于标示请求流水的唯一性。
    /**
     * @var string
     */
    public $outRequestNo;

    // 商户授权资金订单号。
    // 商家自定义需保证在商户端不重复。仅支持字母、数字、下划线
    /**
     * @var string
     */
    public $outOrderNo;

    // 订单标题
    /**
     * @var string
     */
    public $orderTitle;

    // 需要冻结的金额，实际金额乘以100
    /**
     * @var int
     */
    public $amount;

    // 收款账户的支付宝登录号（email或手机号）
    /**
     * @var string
     */
    public $payeeLogonId;

    // 无特殊需要请勿传入；商户可用该参数指定支付渠道。
    // 传入后用户仅能使用列表中的渠道进行支付，目前支持三种渠道，余额宝（MONEY_FUND）、花呗（PCREDIT_PAY）以及芝麻信用（CREDITZHIMA）。
    /**
     * @var string
     */
    public $enablePayChannels;

    // 支付宝二级商户编号
    /**
     * @var string
     */
    public $subMerchantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outRequestNo'      => 'out_request_no',
        'outOrderNo'        => 'out_order_no',
        'orderTitle'        => 'order_title',
        'amount'            => 'amount',
        'payeeLogonId'      => 'payee_logon_id',
        'enablePayChannels' => 'enable_pay_channels',
        'subMerchantId'     => 'sub_merchant_id',
    ];

    public function validate()
    {
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('orderTitle', $this->orderTitle, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('payeeLogonId', $this->payeeLogonId, true);
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
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->orderTitle) {
            $res['order_title'] = $this->orderTitle;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->payeeLogonId) {
            $res['payee_logon_id'] = $this->payeeLogonId;
        }
        if (null !== $this->enablePayChannels) {
            $res['enable_pay_channels'] = $this->enablePayChannels;
        }
        if (null !== $this->subMerchantId) {
            $res['sub_merchant_id'] = $this->subMerchantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDigitalkeyPreauthpayRequest
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
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['order_title'])) {
            $model->orderTitle = $map['order_title'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['payee_logon_id'])) {
            $model->payeeLogonId = $map['payee_logon_id'];
        }
        if (isset($map['enable_pay_channels'])) {
            $model->enablePayChannels = $map['enable_pay_channels'];
        }
        if (isset($map['sub_merchant_id'])) {
            $model->subMerchantId = $map['sub_merchant_id'];
        }

        return $model;
    }
}
