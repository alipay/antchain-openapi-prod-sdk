<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeEcloanRequest extends Model
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

    // 业务场景
    /**
     * @var string
     */
    public $businessScene;

    // 提款申请单
    /**
     * @var string
     */
    public $loanApplyNo;

    // 合同编号
    /**
     * @var string
     */
    public $contractNo;

    // 提款金额
    /**
     * @var string
     */
    public $applyLoanAmt;

    // 币种
    /**
     * @var string
     */
    public $ccy;

    // 支付方式
    /**
     * @var string
     */
    public $payMode;

    // 还款方式
    /**
     * @var string
     */
    public $loanRepayType;

    // 还款周期
    /**
     * @var string
     */
    public $repayPeriod;

    // 借据期限
    /**
     * @var string
     */
    public $loanTerm;

    // 期限单位
    /**
     * @var string
     */
    public $loanTermUnit;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessScene'     => 'business_scene',
        'loanApplyNo'       => 'loan_apply_no',
        'contractNo'        => 'contract_no',
        'applyLoanAmt'      => 'apply_loan_amt',
        'ccy'               => 'ccy',
        'payMode'           => 'pay_mode',
        'loanRepayType'     => 'loan_repay_type',
        'repayPeriod'       => 'repay_period',
        'loanTerm'          => 'loan_term',
        'loanTermUnit'      => 'loan_term_unit',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('loanApplyNo', $this->loanApplyNo, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('applyLoanAmt', $this->applyLoanAmt, true);
        Model::validateRequired('ccy', $this->ccy, true);
        Model::validateRequired('payMode', $this->payMode, true);
        Model::validateRequired('loanRepayType', $this->loanRepayType, true);
        Model::validateRequired('repayPeriod', $this->repayPeriod, true);
        Model::validateRequired('loanTerm', $this->loanTerm, true);
        Model::validateRequired('loanTermUnit', $this->loanTermUnit, true);
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
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->loanApplyNo) {
            $res['loan_apply_no'] = $this->loanApplyNo;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->applyLoanAmt) {
            $res['apply_loan_amt'] = $this->applyLoanAmt;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->payMode) {
            $res['pay_mode'] = $this->payMode;
        }
        if (null !== $this->loanRepayType) {
            $res['loan_repay_type'] = $this->loanRepayType;
        }
        if (null !== $this->repayPeriod) {
            $res['repay_period'] = $this->repayPeriod;
        }
        if (null !== $this->loanTerm) {
            $res['loan_term'] = $this->loanTerm;
        }
        if (null !== $this->loanTermUnit) {
            $res['loan_term_unit'] = $this->loanTermUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeEcloanRequest
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
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['loan_apply_no'])) {
            $model->loanApplyNo = $map['loan_apply_no'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['apply_loan_amt'])) {
            $model->applyLoanAmt = $map['apply_loan_amt'];
        }
        if (isset($map['ccy'])) {
            $model->ccy = $map['ccy'];
        }
        if (isset($map['pay_mode'])) {
            $model->payMode = $map['pay_mode'];
        }
        if (isset($map['loan_repay_type'])) {
            $model->loanRepayType = $map['loan_repay_type'];
        }
        if (isset($map['repay_period'])) {
            $model->repayPeriod = $map['repay_period'];
        }
        if (isset($map['loan_term'])) {
            $model->loanTerm = $map['loan_term'];
        }
        if (isset($map['loan_term_unit'])) {
            $model->loanTermUnit = $map['loan_term_unit'];
        }

        return $model;
    }
}
