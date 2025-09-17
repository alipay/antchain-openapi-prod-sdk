<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RepayDubbridgeRepayWithholdRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 授信申请订单号
    /**
     * @var string
     */
    public $originalOrderNo;

    // 还款类型1:当期结清，2：正常还款3：全部结清
    /**
     * @var string
     */
    public $repayType;

    // 逾期期次列表（担保渠道）
    /**
     * @var int[]
     */
    public $periodList;

    // 校验还款金额
    /**
     * @var string
     */
    public $validRepayAmount;

    // 银行卡号
    /**
     * @var string
     */
    public $bankCardNo;

    // 是否支付代扣，Y是N否（Y：支付代扣，N：无需走支付通道，直接信息流入账--线下还款模式）；（担保渠道）
    /**
     * @var string
     */
    public $paymentFlag;

    // 账号开户名，payment_flag=Y时，必填；（担保渠道）
    /**
     * @var string
     */
    public $accountName;

    // 银行预留手机号，payment_flag=Y时，必填；（担保渠道）
    /**
     * @var string
     */
    public $reservedMobile;

    // 账号开户行编码（担保渠道）
    /**
     * @var string
     */
    public $accountOpenBank;

    // 扣款渠道代码（担保渠道）
    /**
     * @var string
     */
    public $deductionCode;

    // 通道签约协议号（担保渠道）
    /**
     * @var string
     */
    public $signingAgreementNum;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'orderNo'             => 'order_no',
        'originalOrderNo'     => 'original_order_no',
        'repayType'           => 'repay_type',
        'periodList'          => 'period_list',
        'validRepayAmount'    => 'valid_repay_amount',
        'bankCardNo'          => 'bank_card_no',
        'paymentFlag'         => 'payment_flag',
        'accountName'         => 'account_name',
        'reservedMobile'      => 'reserved_mobile',
        'accountOpenBank'     => 'account_open_bank',
        'deductionCode'       => 'deduction_code',
        'signingAgreementNum' => 'signing_agreement_num',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('originalOrderNo', $this->originalOrderNo, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->originalOrderNo) {
            $res['original_order_no'] = $this->originalOrderNo;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->periodList) {
            $res['period_list'] = $this->periodList;
        }
        if (null !== $this->validRepayAmount) {
            $res['valid_repay_amount'] = $this->validRepayAmount;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->paymentFlag) {
            $res['payment_flag'] = $this->paymentFlag;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->reservedMobile) {
            $res['reserved_mobile'] = $this->reservedMobile;
        }
        if (null !== $this->accountOpenBank) {
            $res['account_open_bank'] = $this->accountOpenBank;
        }
        if (null !== $this->deductionCode) {
            $res['deduction_code'] = $this->deductionCode;
        }
        if (null !== $this->signingAgreementNum) {
            $res['signing_agreement_num'] = $this->signingAgreementNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayDubbridgeRepayWithholdRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['original_order_no'])) {
            $model->originalOrderNo = $map['original_order_no'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['period_list'])) {
            if (!empty($map['period_list'])) {
                $model->periodList = $map['period_list'];
            }
        }
        if (isset($map['valid_repay_amount'])) {
            $model->validRepayAmount = $map['valid_repay_amount'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['payment_flag'])) {
            $model->paymentFlag = $map['payment_flag'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['reserved_mobile'])) {
            $model->reservedMobile = $map['reserved_mobile'];
        }
        if (isset($map['account_open_bank'])) {
            $model->accountOpenBank = $map['account_open_bank'];
        }
        if (isset($map['deduction_code'])) {
            $model->deductionCode = $map['deduction_code'];
        }
        if (isset($map['signing_agreement_num'])) {
            $model->signingAgreementNum = $map['signing_agreement_num'];
        }

        return $model;
    }
}
