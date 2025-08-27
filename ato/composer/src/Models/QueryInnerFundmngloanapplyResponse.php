<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerFundmngloanapplyResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 融资放款申请状态
    /**
     * @var string
     */
    public $financeLoanApplyStatus;

    // 商户还款方式
    // 每期全额还款，FULL_REPAYMENT_PER_INSTALLMENT
    /**
     * @var string
     */
    public $merchantPayType;

    // 商户代偿开始天数
    /**
     * @var int
     */
    public $merchantCompensateStartDay;

    // 商户还款开始期数
    /**
     * @var int
     */
    public $payStartTermIndex;

    // 商户付款项目，多个逗号分隔
    /**
     * @var string
     */
    public $paymentItem;

    // 分账支付宝账号uid
    /**
     * @var string
     */
    public $divideAlipayUserId;

    // 分账支付宝账号登录号
    /**
     * @var string
     */
    public $divideAlipayLoginId;

    // 代偿支付宝账号uid
    /**
     * @var string
     */
    public $compensateAlipayUserId;

    // 代偿支付宝账号登录号
    /**
     * @var string
     */
    public $compensateAlipayLoginId;

    // 商户履约承诺，MerchantPromiseInfo
    /**
     * @var string
     */
    public $merchantPromiseInfo;

    // 放款结果，FinanceLoanResults
    /**
     * @var string
     */
    public $financeLoanResults;

    // 融资放款结果同步失败原因
    /**
     * @var string
     */
    public $financeLoanResultSyncFailReason;
    protected $_name = [
        'reqMsgId'                        => 'req_msg_id',
        'resultCode'                      => 'result_code',
        'resultMsg'                       => 'result_msg',
        'financeLoanApplyStatus'          => 'finance_loan_apply_status',
        'merchantPayType'                 => 'merchant_pay_type',
        'merchantCompensateStartDay'      => 'merchant_compensate_start_day',
        'payStartTermIndex'               => 'pay_start_term_index',
        'paymentItem'                     => 'payment_item',
        'divideAlipayUserId'              => 'divide_alipay_user_id',
        'divideAlipayLoginId'             => 'divide_alipay_login_id',
        'compensateAlipayUserId'          => 'compensate_alipay_user_id',
        'compensateAlipayLoginId'         => 'compensate_alipay_login_id',
        'merchantPromiseInfo'             => 'merchant_promise_info',
        'financeLoanResults'              => 'finance_loan_results',
        'financeLoanResultSyncFailReason' => 'finance_loan_result_sync_fail_reason',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->financeLoanApplyStatus) {
            $res['finance_loan_apply_status'] = $this->financeLoanApplyStatus;
        }
        if (null !== $this->merchantPayType) {
            $res['merchant_pay_type'] = $this->merchantPayType;
        }
        if (null !== $this->merchantCompensateStartDay) {
            $res['merchant_compensate_start_day'] = $this->merchantCompensateStartDay;
        }
        if (null !== $this->payStartTermIndex) {
            $res['pay_start_term_index'] = $this->payStartTermIndex;
        }
        if (null !== $this->paymentItem) {
            $res['payment_item'] = $this->paymentItem;
        }
        if (null !== $this->divideAlipayUserId) {
            $res['divide_alipay_user_id'] = $this->divideAlipayUserId;
        }
        if (null !== $this->divideAlipayLoginId) {
            $res['divide_alipay_login_id'] = $this->divideAlipayLoginId;
        }
        if (null !== $this->compensateAlipayUserId) {
            $res['compensate_alipay_user_id'] = $this->compensateAlipayUserId;
        }
        if (null !== $this->compensateAlipayLoginId) {
            $res['compensate_alipay_login_id'] = $this->compensateAlipayLoginId;
        }
        if (null !== $this->merchantPromiseInfo) {
            $res['merchant_promise_info'] = $this->merchantPromiseInfo;
        }
        if (null !== $this->financeLoanResults) {
            $res['finance_loan_results'] = $this->financeLoanResults;
        }
        if (null !== $this->financeLoanResultSyncFailReason) {
            $res['finance_loan_result_sync_fail_reason'] = $this->financeLoanResultSyncFailReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerFundmngloanapplyResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['finance_loan_apply_status'])) {
            $model->financeLoanApplyStatus = $map['finance_loan_apply_status'];
        }
        if (isset($map['merchant_pay_type'])) {
            $model->merchantPayType = $map['merchant_pay_type'];
        }
        if (isset($map['merchant_compensate_start_day'])) {
            $model->merchantCompensateStartDay = $map['merchant_compensate_start_day'];
        }
        if (isset($map['pay_start_term_index'])) {
            $model->payStartTermIndex = $map['pay_start_term_index'];
        }
        if (isset($map['payment_item'])) {
            $model->paymentItem = $map['payment_item'];
        }
        if (isset($map['divide_alipay_user_id'])) {
            $model->divideAlipayUserId = $map['divide_alipay_user_id'];
        }
        if (isset($map['divide_alipay_login_id'])) {
            $model->divideAlipayLoginId = $map['divide_alipay_login_id'];
        }
        if (isset($map['compensate_alipay_user_id'])) {
            $model->compensateAlipayUserId = $map['compensate_alipay_user_id'];
        }
        if (isset($map['compensate_alipay_login_id'])) {
            $model->compensateAlipayLoginId = $map['compensate_alipay_login_id'];
        }
        if (isset($map['merchant_promise_info'])) {
            $model->merchantPromiseInfo = $map['merchant_promise_info'];
        }
        if (isset($map['finance_loan_results'])) {
            $model->financeLoanResults = $map['finance_loan_results'];
        }
        if (isset($map['finance_loan_result_sync_fail_reason'])) {
            $model->financeLoanResultSyncFailReason = $map['finance_loan_result_sync_fail_reason'];
        }

        return $model;
    }
}
