<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class PayBlockchainBotDigitalkeyWithholdRequest extends Model
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

    // 商户订单号，需要保证不重复
    /**
     * @var string
     */
    public $outTradeNo;

    // 订单标题
    /**
     * @var string
     */
    public $subject;

    // 签约时支付宝返回的用户ID
    /**
     * @var string
     */
    public $alipayUserId;

    // 销售产品码，商户代扣场景固定为GENERAL_WITHHOLDING
    /**
     * @var string
     */
    public $productCode;

    // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
    /**
     * @var int
     */
    public $totalAmount;

    // 商户代扣扣款许可
    /**
     * @var string
     */
    public $deductPermission;

    // 代扣协议号, 对应于签约时，支付宝返回的协议
    /**
     * @var string
     */
    public $agreementNo;

    // 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
    /**
     * @var string
     */
    public $timeoutExpress;

    // 异步支付类型
    /**
     * @var string
     */
    public $asyncType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outTradeNo'        => 'out_trade_no',
        'subject'           => 'subject',
        'alipayUserId'      => 'alipay_user_id',
        'productCode'       => 'product_code',
        'totalAmount'       => 'total_amount',
        'deductPermission'  => 'deduct_permission',
        'agreementNo'       => 'agreement_no',
        'timeoutExpress'    => 'timeout_express',
        'asyncType'         => 'async_type',
    ];

    public function validate()
    {
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('alipayUserId', $this->alipayUserId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('agreementNo', $this->agreementNo, true);
        Model::validateRequired('asyncType', $this->asyncType, true);
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
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->deductPermission) {
            $res['deduct_permission'] = $this->deductPermission;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->timeoutExpress) {
            $res['timeout_express'] = $this->timeoutExpress;
        }
        if (null !== $this->asyncType) {
            $res['async_type'] = $this->asyncType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayBlockchainBotDigitalkeyWithholdRequest
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
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['deduct_permission'])) {
            $model->deductPermission = $map['deduct_permission'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['timeout_express'])) {
            $model->timeoutExpress = $map['timeout_express'];
        }
        if (isset($map['async_type'])) {
            $model->asyncType = $map['async_type'];
        }

        return $model;
    }
}
