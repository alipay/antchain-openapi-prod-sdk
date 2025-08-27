<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderFinanceInfo extends Model
{
    // 放款金额
    /**
     * @example 30000
     *
     * @var int
     */
    public $totalMoney;

    // 放款状态
    /**
     * @example AGREED_LOAN
     *
     * @var string
     */
    public $applyStatus;

    // 融资申请时间(yyyy-MM-dd HH:mm:ss)
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $loanApplyDate;

    // 放款时间(yyyy-MM-dd HH:mm:ss)
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $loanTime;

    // 放款交易流水号
    /**
     * @example 202403102912984772213
     *
     * @var string
     */
    public $loanSerialNumber;

    // 资方分账户登录号
    /**
     * @example xxx@qq.com
     *
     * @var string
     */
    public $fundDivideAlipayLogonId;

    // 资方分账户uid
    /**
     * @example 2088xxxx
     *
     * @var string
     */
    public $fundDivideAlipayUid;

    // 资方代扣户登录号
    /**
     * @example xxx@qq.com
     *
     * @var string
     */
    public $fundWithholdAlipayLogonId;

    // 资方代扣户uid
    /**
     * @example 2088xxxx
     *
     * @var string
     */
    public $fundWithholdAlipayUid;

    // 手续费支付方
    /**
     * @example MERCHANT
     *
     * @var string
     */
    public $feePaidRole;

    // 放款渠道
    /**
     * @example BANK
     *
     * @var string
     */
    public $loanChannel;

    // 放款账户
    /**
     * @example 6217xxxxx
     *
     * @var string
     */
    public $loanPayeeAccount;

    // 付款公司统一社会信用代码
    /**
     * @example 9210XM12385
     *
     * @var string
     */
    public $paidCompanyId;

    // 银行名称
    /**
     * @example x xx银行
     *
     * @var string
     */
    public $bankName;

    // 融资状态
    /**
     * @example APPLY
     *
     * @var string
     */
    public $financeStatus;

    // 收款项目列表
    /**
     * @example
     *
     * @var string[]
     */
    public $paymentItemList;

    // 转账代偿收款类型
    /**
     * @example 支付宝
     *
     * @var string
     */
    public $transferCompensateInAccountType;
    protected $_name = [
        'totalMoney'                      => 'total_money',
        'applyStatus'                     => 'apply_status',
        'loanApplyDate'                   => 'loan_apply_date',
        'loanTime'                        => 'loan_time',
        'loanSerialNumber'                => 'loan_serial_number',
        'fundDivideAlipayLogonId'         => 'fund_divide_alipay_logon_id',
        'fundDivideAlipayUid'             => 'fund_divide_alipay_uid',
        'fundWithholdAlipayLogonId'       => 'fund_withhold_alipay_logon_id',
        'fundWithholdAlipayUid'           => 'fund_withhold_alipay_uid',
        'feePaidRole'                     => 'fee_paid_role',
        'loanChannel'                     => 'loan_channel',
        'loanPayeeAccount'                => 'loan_payee_account',
        'paidCompanyId'                   => 'paid_company_id',
        'bankName'                        => 'bank_name',
        'financeStatus'                   => 'finance_status',
        'paymentItemList'                 => 'payment_item_list',
        'transferCompensateInAccountType' => 'transfer_compensate_in_account_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalMoney) {
            $res['total_money'] = $this->totalMoney;
        }
        if (null !== $this->applyStatus) {
            $res['apply_status'] = $this->applyStatus;
        }
        if (null !== $this->loanApplyDate) {
            $res['loan_apply_date'] = $this->loanApplyDate;
        }
        if (null !== $this->loanTime) {
            $res['loan_time'] = $this->loanTime;
        }
        if (null !== $this->loanSerialNumber) {
            $res['loan_serial_number'] = $this->loanSerialNumber;
        }
        if (null !== $this->fundDivideAlipayLogonId) {
            $res['fund_divide_alipay_logon_id'] = $this->fundDivideAlipayLogonId;
        }
        if (null !== $this->fundDivideAlipayUid) {
            $res['fund_divide_alipay_uid'] = $this->fundDivideAlipayUid;
        }
        if (null !== $this->fundWithholdAlipayLogonId) {
            $res['fund_withhold_alipay_logon_id'] = $this->fundWithholdAlipayLogonId;
        }
        if (null !== $this->fundWithholdAlipayUid) {
            $res['fund_withhold_alipay_uid'] = $this->fundWithholdAlipayUid;
        }
        if (null !== $this->feePaidRole) {
            $res['fee_paid_role'] = $this->feePaidRole;
        }
        if (null !== $this->loanChannel) {
            $res['loan_channel'] = $this->loanChannel;
        }
        if (null !== $this->loanPayeeAccount) {
            $res['loan_payee_account'] = $this->loanPayeeAccount;
        }
        if (null !== $this->paidCompanyId) {
            $res['paid_company_id'] = $this->paidCompanyId;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->financeStatus) {
            $res['finance_status'] = $this->financeStatus;
        }
        if (null !== $this->paymentItemList) {
            $res['payment_item_list'] = $this->paymentItemList;
        }
        if (null !== $this->transferCompensateInAccountType) {
            $res['transfer_compensate_in_account_type'] = $this->transferCompensateInAccountType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderFinanceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_money'])) {
            $model->totalMoney = $map['total_money'];
        }
        if (isset($map['apply_status'])) {
            $model->applyStatus = $map['apply_status'];
        }
        if (isset($map['loan_apply_date'])) {
            $model->loanApplyDate = $map['loan_apply_date'];
        }
        if (isset($map['loan_time'])) {
            $model->loanTime = $map['loan_time'];
        }
        if (isset($map['loan_serial_number'])) {
            $model->loanSerialNumber = $map['loan_serial_number'];
        }
        if (isset($map['fund_divide_alipay_logon_id'])) {
            $model->fundDivideAlipayLogonId = $map['fund_divide_alipay_logon_id'];
        }
        if (isset($map['fund_divide_alipay_uid'])) {
            $model->fundDivideAlipayUid = $map['fund_divide_alipay_uid'];
        }
        if (isset($map['fund_withhold_alipay_logon_id'])) {
            $model->fundWithholdAlipayLogonId = $map['fund_withhold_alipay_logon_id'];
        }
        if (isset($map['fund_withhold_alipay_uid'])) {
            $model->fundWithholdAlipayUid = $map['fund_withhold_alipay_uid'];
        }
        if (isset($map['fee_paid_role'])) {
            $model->feePaidRole = $map['fee_paid_role'];
        }
        if (isset($map['loan_channel'])) {
            $model->loanChannel = $map['loan_channel'];
        }
        if (isset($map['loan_payee_account'])) {
            $model->loanPayeeAccount = $map['loan_payee_account'];
        }
        if (isset($map['paid_company_id'])) {
            $model->paidCompanyId = $map['paid_company_id'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['finance_status'])) {
            $model->financeStatus = $map['finance_status'];
        }
        if (isset($map['payment_item_list'])) {
            if (!empty($map['payment_item_list'])) {
                $model->paymentItemList = $map['payment_item_list'];
            }
        }
        if (isset($map['transfer_compensate_in_account_type'])) {
            $model->transferCompensateInAccountType = $map['transfer_compensate_in_account_type'];
        }

        return $model;
    }
}
