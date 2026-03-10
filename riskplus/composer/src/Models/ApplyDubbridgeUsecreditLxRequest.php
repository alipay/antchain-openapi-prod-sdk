<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeUsecreditLxRequest extends Model
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

    // 用信审批申请编号
    /**
     * @var string
     */
    public $applyId;

    // 合作方代码
    /**
     * @var string
     */
    public $partnerCode;

    // 授信编号
    /**
     * @var string
     */
    public $creditNo;

    // 资产类型，
    // 1：借钱（默认）
    // 2：电商购物
    // 3：乐花卡
    /**
     * @var string
     */
    public $orderType;

    // 借款金额，单位：元
    /**
     * @var int
     */
    public $loanPrincipal;

    // 借款期数，比如：1,2,3,6,9,12,15,18,24,36
    /**
     * @var int
     */
    public $loanTerm;

    // 申请贷款用途，
    // 借钱（透传）：日常消费；运动健身；电商购物；生活开销；学习进修；学艺术班；技能培训
    // 电商购物（默认）：电商购物
    // 乐花卡（默认）：个人综合消费
    /**
     * @var string
     */
    public $loanUse;

    // 借款人收款户名，
    // 借钱业务：借款用户个人收款账户名
    // 电商业务：打款到对公户，传对公户相关账号信息
    /**
     * @var string
     */
    public $debitAccountName;

    // 收款人银行卡开户行，
    // 借钱业务：借款用户个人账户开户行名称
    // 电商业务：打款到对公户，传对公户相关账号信息
    /**
     * @var string
     */
    public $debitOpenAccountBank;

    // 收款人银行卡卡号，
    // 借钱业务：借款用户个人账户卡号
    // 电商业务：打款到对公户，传对公户相关账号信息
    /**
     * @var string
     */
    public $debitAccountNo;

    // 收款卡联行号，
    // 借钱业务：非必传
    // 电商业务：打款到对公户，传对公户相关账号信息
    /**
     * @var string
     */
    public $debitCnaps;

    // 担保编号，有担保时提供担保编号
    /**
     * @var string
     */
    public $insureId;

    // 担保方名称，有担保时提供担名称
    /**
     * @var string
     */
    public $insureName;

    // 还款方式，
    // 1-等额本息（默认）
    // 2-等额本金
    // 4-气球贷
    // 10- 等本等息
    // 13-先息后本
    /**
     * @var int
     */
    public $repayType;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'applyId'              => 'apply_id',
        'partnerCode'          => 'partner_code',
        'creditNo'             => 'credit_no',
        'orderType'            => 'order_type',
        'loanPrincipal'        => 'loan_principal',
        'loanTerm'             => 'loan_term',
        'loanUse'              => 'loan_use',
        'debitAccountName'     => 'debit_account_name',
        'debitOpenAccountBank' => 'debit_open_account_bank',
        'debitAccountNo'       => 'debit_account_no',
        'debitCnaps'           => 'debit_cnaps',
        'insureId'             => 'insure_id',
        'insureName'           => 'insure_name',
        'repayType'            => 'repay_type',
    ];

    public function validate()
    {
        Model::validateRequired('applyId', $this->applyId, true);
        Model::validateRequired('creditNo', $this->creditNo, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('loanPrincipal', $this->loanPrincipal, true);
        Model::validateRequired('loanTerm', $this->loanTerm, true);
        Model::validateRequired('loanUse', $this->loanUse, true);
        Model::validateRequired('debitAccountName', $this->debitAccountName, true);
        Model::validateRequired('debitOpenAccountBank', $this->debitOpenAccountBank, true);
        Model::validateRequired('debitAccountNo', $this->debitAccountNo, true);
        Model::validateRequired('repayType', $this->repayType, true);
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
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->partnerCode) {
            $res['partner_code'] = $this->partnerCode;
        }
        if (null !== $this->creditNo) {
            $res['credit_no'] = $this->creditNo;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->loanPrincipal) {
            $res['loan_principal'] = $this->loanPrincipal;
        }
        if (null !== $this->loanTerm) {
            $res['loan_term'] = $this->loanTerm;
        }
        if (null !== $this->loanUse) {
            $res['loan_use'] = $this->loanUse;
        }
        if (null !== $this->debitAccountName) {
            $res['debit_account_name'] = $this->debitAccountName;
        }
        if (null !== $this->debitOpenAccountBank) {
            $res['debit_open_account_bank'] = $this->debitOpenAccountBank;
        }
        if (null !== $this->debitAccountNo) {
            $res['debit_account_no'] = $this->debitAccountNo;
        }
        if (null !== $this->debitCnaps) {
            $res['debit_cnaps'] = $this->debitCnaps;
        }
        if (null !== $this->insureId) {
            $res['insure_id'] = $this->insureId;
        }
        if (null !== $this->insureName) {
            $res['insure_name'] = $this->insureName;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeUsecreditLxRequest
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
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['partner_code'])) {
            $model->partnerCode = $map['partner_code'];
        }
        if (isset($map['credit_no'])) {
            $model->creditNo = $map['credit_no'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['loan_principal'])) {
            $model->loanPrincipal = $map['loan_principal'];
        }
        if (isset($map['loan_term'])) {
            $model->loanTerm = $map['loan_term'];
        }
        if (isset($map['loan_use'])) {
            $model->loanUse = $map['loan_use'];
        }
        if (isset($map['debit_account_name'])) {
            $model->debitAccountName = $map['debit_account_name'];
        }
        if (isset($map['debit_open_account_bank'])) {
            $model->debitOpenAccountBank = $map['debit_open_account_bank'];
        }
        if (isset($map['debit_account_no'])) {
            $model->debitAccountNo = $map['debit_account_no'];
        }
        if (isset($map['debit_cnaps'])) {
            $model->debitCnaps = $map['debit_cnaps'];
        }
        if (isset($map['insure_id'])) {
            $model->insureId = $map['insure_id'];
        }
        if (isset($map['insure_name'])) {
            $model->insureName = $map['insure_name'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }

        return $model;
    }
}
