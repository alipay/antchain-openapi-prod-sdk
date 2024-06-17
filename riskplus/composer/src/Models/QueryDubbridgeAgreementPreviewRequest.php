<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeAgreementPreviewRequest extends Model
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

    // 授信：apply
    // 借款：loan
    // 绑卡：bind
    /**
     * @var string
     */
    public $bizType;

    // 资金方编号
    /**
     * @var string
     */
    public $fundCode;

    // 客户号
    /**
     * @var string
     */
    public $customerNo;

    // 借款金额
    /**
     * @var int
     */
    public $loanAmount;

    // 分期期数
    /**
     * @var int
     */
    public $period;

    // 银行编码
    /**
     * @var string
     */
    public $bankCode;

    // 还款方式
    /**
     * @var string
     */
    public $repayType;

    // 银行名称
    /**
     * @var string
     */
    public $bankName;

    // 银行卡号
    /**
     * @var string
     */
    public $bankCardNo;

    // 借据截至日期yyyy-MM-dd
    /**
     * @var string
     */
    public $receiptEndDate;

    // 借款用途
    /**
     * @var string
     */
    public $loanWay;

    // lpr
    /**
     * @var int
     */
    public $lpr;

    // LPR加点值
    /**
     * @var int
     */
    public $lprPoint;

    // LPR发布日期
    /**
     * @var string
     */
    public $lprEffectDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'fundCode'          => 'fund_code',
        'customerNo'        => 'customer_no',
        'loanAmount'        => 'loan_amount',
        'period'            => 'period',
        'bankCode'          => 'bank_code',
        'repayType'         => 'repay_type',
        'bankName'          => 'bank_name',
        'bankCardNo'        => 'bank_card_no',
        'receiptEndDate'    => 'receipt_end_date',
        'loanWay'           => 'loan_way',
        'lpr'               => 'lpr',
        'lprPoint'          => 'lpr_point',
        'lprEffectDate'     => 'lpr_effect_date',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('fundCode', $this->fundCode, true);
        Model::validateRequired('customerNo', $this->customerNo, true);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->loanAmount) {
            $res['loan_amount'] = $this->loanAmount;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->receiptEndDate) {
            $res['receipt_end_date'] = $this->receiptEndDate;
        }
        if (null !== $this->loanWay) {
            $res['loan_way'] = $this->loanWay;
        }
        if (null !== $this->lpr) {
            $res['lpr'] = $this->lpr;
        }
        if (null !== $this->lprPoint) {
            $res['lpr_point'] = $this->lprPoint;
        }
        if (null !== $this->lprEffectDate) {
            $res['lpr_effect_date'] = $this->lprEffectDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeAgreementPreviewRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }
        if (isset($map['loan_amount'])) {
            $model->loanAmount = $map['loan_amount'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['receipt_end_date'])) {
            $model->receiptEndDate = $map['receipt_end_date'];
        }
        if (isset($map['loan_way'])) {
            $model->loanWay = $map['loan_way'];
        }
        if (isset($map['lpr'])) {
            $model->lpr = $map['lpr'];
        }
        if (isset($map['lpr_point'])) {
            $model->lprPoint = $map['lpr_point'];
        }
        if (isset($map['lpr_effect_date'])) {
            $model->lprEffectDate = $map['lpr_effect_date'];
        }

        return $model;
    }
}
