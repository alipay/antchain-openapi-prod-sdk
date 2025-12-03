<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeInstallmentCreditamtResponse extends Model
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

    // 授信申请状态：
    // 0- 通过
    // 1- 拒绝
    // 2- 审批中
    // 3- 失败
    //
    /**
     * @var string
     */
    public $applyStatus;

    // 额度状态：
    // 0- 正常
    // 1- 冻结
    // 2- 过期
    /**
     * @var string
     */
    public $creditStatus;

    // 授信总额度，单位：元
    /**
     * @var int
     */
    public $creditAmount;

    // 可用余额
    /**
     * @var int
     */
    public $restAmount;

    // 发放日期，yyyy-MM-dd
    /**
     * @var string
     */
    public $payDate;

    // 到期日期，yyyy-MM-dd
    /**
     * @var string
     */
    public $expireDate;

    // 授信年利率。精确到小数点后四位0.1250，表示年利率为12.5%
    /**
     * @var int
     */
    public $rateValue;

    // 资金方编号
    /**
     * @var string
     */
    public $fundCode;

    // 资金方简称
    /**
     * @var string
     */
    public $abbreFundName;

    // 1：现金贷、2：分期付
    /**
     * @var string
     */
    public $prodType;

    // Y- 可用
    // N- 不可用
    /**
     * @var string
     */
    public $installmentStatus;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'applyStatus'       => 'apply_status',
        'creditStatus'      => 'credit_status',
        'creditAmount'      => 'credit_amount',
        'restAmount'        => 'rest_amount',
        'payDate'           => 'pay_date',
        'expireDate'        => 'expire_date',
        'rateValue'         => 'rate_value',
        'fundCode'          => 'fund_code',
        'abbreFundName'     => 'abbre_fund_name',
        'prodType'          => 'prod_type',
        'installmentStatus' => 'installment_status',
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
        if (null !== $this->applyStatus) {
            $res['apply_status'] = $this->applyStatus;
        }
        if (null !== $this->creditStatus) {
            $res['credit_status'] = $this->creditStatus;
        }
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->restAmount) {
            $res['rest_amount'] = $this->restAmount;
        }
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->rateValue) {
            $res['rate_value'] = $this->rateValue;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->abbreFundName) {
            $res['abbre_fund_name'] = $this->abbreFundName;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }
        if (null !== $this->installmentStatus) {
            $res['installment_status'] = $this->installmentStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeInstallmentCreditamtResponse
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
        if (isset($map['apply_status'])) {
            $model->applyStatus = $map['apply_status'];
        }
        if (isset($map['credit_status'])) {
            $model->creditStatus = $map['credit_status'];
        }
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['rest_amount'])) {
            $model->restAmount = $map['rest_amount'];
        }
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['rate_value'])) {
            $model->rateValue = $map['rate_value'];
        }
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['abbre_fund_name'])) {
            $model->abbreFundName = $map['abbre_fund_name'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }
        if (isset($map['installment_status'])) {
            $model->installmentStatus = $map['installment_status'];
        }

        return $model;
    }
}
