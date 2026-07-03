<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DubheEcQuota extends Model
{
    // 交易流水号,与上面的交易流水号一致
    /**
     * @example JJBH136433239635646977
     *
     * @var string
     */
    public $transactionNo;

    // 业务状态同步接口中，客户签约成功后的合同编号，在后续查询类接口都需要使用。
    /**
     * @example CONT20230213000000146577
     *
     * @var string
     */
    public $contractNo;

    // 客户对应合同的总额度，单位：元，格式：数字，小数点后两位。
    /**
     * @example 1
     *
     * @var int
     */
    public $amt;

    // 客户对应合同的可用额度，单位：元，格式：数字，小数点后两位
    /**
     * @example 1
     *
     * @var int
     */
    public $availCreditAmt;

    // 客户对应合同的已用额度，单位：元，格式：数字，小数点后两位
    /**
     * @example 1.01
     *
     * @var int
     */
    public $engrossAmt;

    // 合同目前的额度状态
    /**
     * @example 1
     *
     * @var string
     */
    public $creditStatus;

    // 授信开始时间  格式: yyyy/MM/dd。额度有效时返回
    /**
     * @example 2023/02/01
     *
     * @var string
     */
    public $contractEffectDate;

    // 授信结束时间 格式:yyyy/MM/dd。额度有效时返回
    /**
     * @example 2023/05/01
     *
     * @var string
     */
    public $maturityDate;
    protected $_name = [
        'transactionNo'      => 'transaction_no',
        'contractNo'         => 'contract_no',
        'amt'                => 'amt',
        'availCreditAmt'     => 'avail_credit_amt',
        'engrossAmt'         => 'engross_amt',
        'creditStatus'       => 'credit_status',
        'contractEffectDate' => 'contract_effect_date',
        'maturityDate'       => 'maturity_date',
    ];

    public function validate()
    {
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('amt', $this->amt, true);
        Model::validateRequired('availCreditAmt', $this->availCreditAmt, true);
        Model::validateRequired('engrossAmt', $this->engrossAmt, true);
        Model::validateRequired('creditStatus', $this->creditStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->amt) {
            $res['amt'] = $this->amt;
        }
        if (null !== $this->availCreditAmt) {
            $res['avail_credit_amt'] = $this->availCreditAmt;
        }
        if (null !== $this->engrossAmt) {
            $res['engross_amt'] = $this->engrossAmt;
        }
        if (null !== $this->creditStatus) {
            $res['credit_status'] = $this->creditStatus;
        }
        if (null !== $this->contractEffectDate) {
            $res['contract_effect_date'] = $this->contractEffectDate;
        }
        if (null !== $this->maturityDate) {
            $res['maturity_date'] = $this->maturityDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DubheEcQuota
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['amt'])) {
            $model->amt = $map['amt'];
        }
        if (isset($map['avail_credit_amt'])) {
            $model->availCreditAmt = $map['avail_credit_amt'];
        }
        if (isset($map['engross_amt'])) {
            $model->engrossAmt = $map['engross_amt'];
        }
        if (isset($map['credit_status'])) {
            $model->creditStatus = $map['credit_status'];
        }
        if (isset($map['contract_effect_date'])) {
            $model->contractEffectDate = $map['contract_effect_date'];
        }
        if (isset($map['maturity_date'])) {
            $model->maturityDate = $map['maturity_date'];
        }

        return $model;
    }
}
