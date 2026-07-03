<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcCreditQuery extends Model
{
    // 外部申请编号
    /**
     * @example SQ202301291615023
     *
     * @var string
     */
    public $thirdApplyNo;

    // 银行审批流水号
    /**
     * @example APPL20200826000000250721
     *
     * @var string
     */
    public $applyNo;

    // 业务审批状态
    /**
     * @example APPROVING
     *
     * @var string
     */
    public $applyStatus;

    // 合同编号
    /**
     * @example CONT20230314000000143225
     *
     * @var string
     */
    public $contractNo;

    // 授信开始时间 格式yyyyMMdd
    /**
     * @example 20221010
     *
     * @var string
     */
    public $amountStartDate;

    // 授信结束时间 yyyyMMdd
    /**
     * @example 20231010
     *
     * @var string
     */
    public $amountEndDate;

    // 审批金额
    /**
     * @example 5000000.00
     *
     * @var string
     */
    public $approveAmount;

    // 否决原因
    /**
     * @example 审批否决
     *
     * @var string
     */
    public $denyReason;

    // 提还款账号
    /**
     * @example 6230580199590683459
     *
     * @var string
     */
    public $bankCardNo;

    // 提还款账号联行号
    /**
     * @example 307331002509
     *
     * @var string
     */
    public $bankCardBranchCode;

    // 账号开户行行名称
    /**
     * @example 平安银行杭州分行
     *
     * @var string
     */
    public $publicAccountBankname;

    // 审批通过时间 审批通过必填(格式: yyyy-MM-dd HH:mm:ss)
    /**
     * @example 2023-05-01 01:01:01
     *
     * @var string
     */
    public $approveTime;
    protected $_name = [
        'thirdApplyNo'          => 'third_apply_no',
        'applyNo'               => 'apply_no',
        'applyStatus'           => 'apply_status',
        'contractNo'            => 'contract_no',
        'amountStartDate'       => 'amount_start_date',
        'amountEndDate'         => 'amount_end_date',
        'approveAmount'         => 'approve_amount',
        'denyReason'            => 'deny_reason',
        'bankCardNo'            => 'bank_card_no',
        'bankCardBranchCode'    => 'bank_card_branch_code',
        'publicAccountBankname' => 'public_account_bankname',
        'approveTime'           => 'approve_time',
    ];

    public function validate()
    {
        Model::validateRequired('applyStatus', $this->applyStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->thirdApplyNo) {
            $res['third_apply_no'] = $this->thirdApplyNo;
        }
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }
        if (null !== $this->applyStatus) {
            $res['apply_status'] = $this->applyStatus;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->amountStartDate) {
            $res['amount_start_date'] = $this->amountStartDate;
        }
        if (null !== $this->amountEndDate) {
            $res['amount_end_date'] = $this->amountEndDate;
        }
        if (null !== $this->approveAmount) {
            $res['approve_amount'] = $this->approveAmount;
        }
        if (null !== $this->denyReason) {
            $res['deny_reason'] = $this->denyReason;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->bankCardBranchCode) {
            $res['bank_card_branch_code'] = $this->bankCardBranchCode;
        }
        if (null !== $this->publicAccountBankname) {
            $res['public_account_bankname'] = $this->publicAccountBankname;
        }
        if (null !== $this->approveTime) {
            $res['approve_time'] = $this->approveTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcCreditQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['third_apply_no'])) {
            $model->thirdApplyNo = $map['third_apply_no'];
        }
        if (isset($map['apply_no'])) {
            $model->applyNo = $map['apply_no'];
        }
        if (isset($map['apply_status'])) {
            $model->applyStatus = $map['apply_status'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['amount_start_date'])) {
            $model->amountStartDate = $map['amount_start_date'];
        }
        if (isset($map['amount_end_date'])) {
            $model->amountEndDate = $map['amount_end_date'];
        }
        if (isset($map['approve_amount'])) {
            $model->approveAmount = $map['approve_amount'];
        }
        if (isset($map['deny_reason'])) {
            $model->denyReason = $map['deny_reason'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['bank_card_branch_code'])) {
            $model->bankCardBranchCode = $map['bank_card_branch_code'];
        }
        if (isset($map['public_account_bankname'])) {
            $model->publicAccountBankname = $map['public_account_bankname'];
        }
        if (isset($map['approve_time'])) {
            $model->approveTime = $map['approve_time'];
        }

        return $model;
    }
}
