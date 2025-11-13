<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantOrderFulfillmentInfo extends Model
{
    // 还款期数
    /**
     * @example 1
     *
     * @var int
     */
    public $termIndex;

    // 订单用户租期编号
    /**
     * @example 1
     *
     * @var int
     */
    public $leaseTermIndex;

    // 租期归还状态
    /**
     * @example RETURN_FULL
     *
     * @var string
     */
    public $rentalReturnState;

    // 还款方式
    /**
     * @example DIVIDE
     *
     * @var string
     */
    public $returnWay;

    // 支付类型
    /**
     * @example PERFORMANCE
     *
     * @var string
     */
    public $payType;

    // 实际到账金额
    /**
     * @example 1000
     *
     * @var int
     */
    public $totalMoney;

    // 实际还款时间(yyyy-MM-dd HH:mm:ss)
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $returnTime;

    // 外部交易流水号
    /**
     * @example ATO_xxxx
     *
     * @var string
     */
    public $returnVoucherSerial;

    // 支付宝交易流水号
    /**
     * @example 2024082622001472691457627
     *
     * @var string
     */
    public $alipayTradeNo;

    // 资方公司名称
    /**
     * @example xxx有限公司
     *
     * @var string
     */
    public $fundCompanyName;

    // 支付描述
    /**
     * @example 单期取消
     *
     * @var string
     */
    public $paymentDescription;
    protected $_name = [
        'termIndex'           => 'term_index',
        'leaseTermIndex'      => 'lease_term_index',
        'rentalReturnState'   => 'rental_return_state',
        'returnWay'           => 'return_way',
        'payType'             => 'pay_type',
        'totalMoney'          => 'total_money',
        'returnTime'          => 'return_time',
        'returnVoucherSerial' => 'return_voucher_serial',
        'alipayTradeNo'       => 'alipay_trade_no',
        'fundCompanyName'     => 'fund_company_name',
        'paymentDescription'  => 'payment_description',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->termIndex) {
            $res['term_index'] = $this->termIndex;
        }
        if (null !== $this->leaseTermIndex) {
            $res['lease_term_index'] = $this->leaseTermIndex;
        }
        if (null !== $this->rentalReturnState) {
            $res['rental_return_state'] = $this->rentalReturnState;
        }
        if (null !== $this->returnWay) {
            $res['return_way'] = $this->returnWay;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->totalMoney) {
            $res['total_money'] = $this->totalMoney;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }
        if (null !== $this->returnVoucherSerial) {
            $res['return_voucher_serial'] = $this->returnVoucherSerial;
        }
        if (null !== $this->alipayTradeNo) {
            $res['alipay_trade_no'] = $this->alipayTradeNo;
        }
        if (null !== $this->fundCompanyName) {
            $res['fund_company_name'] = $this->fundCompanyName;
        }
        if (null !== $this->paymentDescription) {
            $res['payment_description'] = $this->paymentDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantOrderFulfillmentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['term_index'])) {
            $model->termIndex = $map['term_index'];
        }
        if (isset($map['lease_term_index'])) {
            $model->leaseTermIndex = $map['lease_term_index'];
        }
        if (isset($map['rental_return_state'])) {
            $model->rentalReturnState = $map['rental_return_state'];
        }
        if (isset($map['return_way'])) {
            $model->returnWay = $map['return_way'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['total_money'])) {
            $model->totalMoney = $map['total_money'];
        }
        if (isset($map['return_time'])) {
            $model->returnTime = $map['return_time'];
        }
        if (isset($map['return_voucher_serial'])) {
            $model->returnVoucherSerial = $map['return_voucher_serial'];
        }
        if (isset($map['alipay_trade_no'])) {
            $model->alipayTradeNo = $map['alipay_trade_no'];
        }
        if (isset($map['fund_company_name'])) {
            $model->fundCompanyName = $map['fund_company_name'];
        }
        if (isset($map['payment_description'])) {
            $model->paymentDescription = $map['payment_description'];
        }

        return $model;
    }
}
