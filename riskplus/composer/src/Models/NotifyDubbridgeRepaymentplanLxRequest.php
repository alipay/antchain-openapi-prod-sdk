<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyDubbridgeRepaymentplanLxRequest extends Model
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

    // 支用申请编号
    /**
     * @var string
     */
    public $applyId;

    // 合作方代码
    /**
     * @var string
     */
    public $partnerCode;

    // 放款编号
    /**
     * @var string
     */
    public $capitalLoanNo;

    // 借款总期数
    /**
     * @var int
     */
    public $totalTerm;

    // 借据总金额(元)
    /**
     * @var int
     */
    public $totalAmount;

    // 放款成功日期，yyyy_MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $paymentTime;

    // 还款计划列表
    /**
     * @var RepayPlanNotifyItem[]
     */
    public $repayPlans;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyId'           => 'apply_id',
        'partnerCode'       => 'partner_code',
        'capitalLoanNo'     => 'capital_loan_no',
        'totalTerm'         => 'total_term',
        'totalAmount'       => 'total_amount',
        'paymentTime'       => 'payment_time',
        'repayPlans'        => 'repay_plans',
    ];

    public function validate()
    {
        Model::validateRequired('applyId', $this->applyId, true);
        Model::validateRequired('capitalLoanNo', $this->capitalLoanNo, true);
        Model::validateRequired('totalTerm', $this->totalTerm, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('paymentTime', $this->paymentTime, true);
        Model::validateRequired('repayPlans', $this->repayPlans, true);
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
        if (null !== $this->capitalLoanNo) {
            $res['capital_loan_no'] = $this->capitalLoanNo;
        }
        if (null !== $this->totalTerm) {
            $res['total_term'] = $this->totalTerm;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->paymentTime) {
            $res['payment_time'] = $this->paymentTime;
        }
        if (null !== $this->repayPlans) {
            $res['repay_plans'] = [];
            if (null !== $this->repayPlans && \is_array($this->repayPlans)) {
                $n = 0;
                foreach ($this->repayPlans as $item) {
                    $res['repay_plans'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyDubbridgeRepaymentplanLxRequest
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
        if (isset($map['capital_loan_no'])) {
            $model->capitalLoanNo = $map['capital_loan_no'];
        }
        if (isset($map['total_term'])) {
            $model->totalTerm = $map['total_term'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['payment_time'])) {
            $model->paymentTime = $map['payment_time'];
        }
        if (isset($map['repay_plans'])) {
            if (!empty($map['repay_plans'])) {
                $model->repayPlans = [];
                $n                 = 0;
                foreach ($map['repay_plans'] as $item) {
                    $model->repayPlans[$n++] = null !== $item ? RepayPlanNotifyItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
