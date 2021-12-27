<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ReceiptInfo extends Model
{
    // 客户名
    /**
     * @example XXX
     *
     * @var string
     */
    public $customName;

    // 证件号码
    /**
     * @example xxx
     *
     * @var string
     */
    public $cardNo;

    // 手机号
    /**
     * @example 166****1234
     *
     * @var string
     */
    public $mobile;

    // 贷款金额
    /**
     * @example 1234
     *
     * @var int
     */
    public $applyAmount;

    // 发放金额
    /**
     * @example 1234
     *
     * @var int
     */
    public $loanAmount;

    // 期数
    /**
     * @example 12
     *
     * @var int
     */
    public $period;

    // 当前期数
    /**
     * @example 12
     *
     * @var int
     */
    public $curPeriod;

    // 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
    /**
     * @example 1
     *
     * @var string
     */
    public $repayType;

    // 还款日
    /**
     * @example XXXX.XX.XX
     *
     * @var string
     */
    public $repayDate;

    // 放款时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $loanTime;

    // 借据状态0：未还清，1：已还清，2：已提前还清
    /**
     * @example 0
     *
     * @var string
     */
    public $status;

    // 已还本金
    /**
     * @example 1234
     *
     * @var int
     */
    public $alreadyCorpus;

    // 已还利息
    /**
     * @example 50
     *
     * @var int
     */
    public $alreadyAccrual;

    // 结清日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $alreadyDate;

    // 审批状态0：通过 1：拒绝 2：审批中 3：失败
    /**
     * @example 0
     *
     * @var string
     */
    public $workflowStatus;

    // 借据编号
    /**
     * @example 145785
     *
     * @var string
     */
    public $receiptNo;
    protected $_name = [
        'customName'     => 'custom_name',
        'cardNo'         => 'card_no',
        'mobile'         => 'mobile',
        'applyAmount'    => 'apply_amount',
        'loanAmount'     => 'loan_amount',
        'period'         => 'period',
        'curPeriod'      => 'cur_period',
        'repayType'      => 'repay_type',
        'repayDate'      => 'repay_date',
        'loanTime'       => 'loan_time',
        'status'         => 'status',
        'alreadyCorpus'  => 'already_corpus',
        'alreadyAccrual' => 'already_accrual',
        'alreadyDate'    => 'already_date',
        'workflowStatus' => 'workflow_status',
        'receiptNo'      => 'receipt_no',
    ];

    public function validate()
    {
        Model::validateRequired('customName', $this->customName, true);
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('applyAmount', $this->applyAmount, true);
        Model::validateRequired('loanAmount', $this->loanAmount, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('curPeriod', $this->curPeriod, true);
        Model::validateRequired('repayType', $this->repayType, true);
        Model::validateRequired('repayDate', $this->repayDate, true);
        Model::validateRequired('loanTime', $this->loanTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('alreadyCorpus', $this->alreadyCorpus, true);
        Model::validateRequired('alreadyAccrual', $this->alreadyAccrual, true);
        Model::validateRequired('alreadyDate', $this->alreadyDate, true);
        Model::validateRequired('workflowStatus', $this->workflowStatus, true);
        Model::validateRequired('receiptNo', $this->receiptNo, true);
        Model::validatePattern('loanTime', $this->loanTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('alreadyDate', $this->alreadyDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->applyAmount) {
            $res['apply_amount'] = $this->applyAmount;
        }
        if (null !== $this->loanAmount) {
            $res['loan_amount'] = $this->loanAmount;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->curPeriod) {
            $res['cur_period'] = $this->curPeriod;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->repayDate) {
            $res['repay_date'] = $this->repayDate;
        }
        if (null !== $this->loanTime) {
            $res['loan_time'] = $this->loanTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->alreadyCorpus) {
            $res['already_corpus'] = $this->alreadyCorpus;
        }
        if (null !== $this->alreadyAccrual) {
            $res['already_accrual'] = $this->alreadyAccrual;
        }
        if (null !== $this->alreadyDate) {
            $res['already_date'] = $this->alreadyDate;
        }
        if (null !== $this->workflowStatus) {
            $res['workflow_status'] = $this->workflowStatus;
        }
        if (null !== $this->receiptNo) {
            $res['receipt_no'] = $this->receiptNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiptInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['apply_amount'])) {
            $model->applyAmount = $map['apply_amount'];
        }
        if (isset($map['loan_amount'])) {
            $model->loanAmount = $map['loan_amount'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['cur_period'])) {
            $model->curPeriod = $map['cur_period'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['repay_date'])) {
            $model->repayDate = $map['repay_date'];
        }
        if (isset($map['loan_time'])) {
            $model->loanTime = $map['loan_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['already_corpus'])) {
            $model->alreadyCorpus = $map['already_corpus'];
        }
        if (isset($map['already_accrual'])) {
            $model->alreadyAccrual = $map['already_accrual'];
        }
        if (isset($map['already_date'])) {
            $model->alreadyDate = $map['already_date'];
        }
        if (isset($map['workflow_status'])) {
            $model->workflowStatus = $map['workflow_status'];
        }
        if (isset($map['receipt_no'])) {
            $model->receiptNo = $map['receipt_no'];
        }

        return $model;
    }
}
